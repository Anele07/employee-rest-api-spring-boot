package com.employee;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class EmployeesTest {

    @Test
    void shouldStartWithAnEmptyEmployeeList() {

        // Arrange
        Employees employees = new Employees();

        // Assert
        assertNotNull(employees.getEmployees());
        assertTrue(employees.getEmployees().isEmpty());
        assertEquals(0, employees.getEmployees().size());
    }

    @Test
    void shouldAddOneEmployee() {

        // Arrange
        Employees employees = new Employees();

        Employee employee = new Employee(
                "101",
                "Sarah",
                "Smith",
                "sarah@example.com",
                "Software Developer"
        );

        // Act
        employees.addEmployee(employee);

        // Assert
        assertEquals(1, employees.getEmployees().size());
        assertEquals(employee, employees.getEmployees().get(0));
    }

    @Test
    void shouldAddMultipleEmployees() {

        // Arrange
        Employees employees = new Employees();

        Employee employee1 = new Employee(
                "101",
                "Sarah",
                "Smith",
                "sarah@example.com",
                "Software Developer"
        );

        Employee employee2 = new Employee(
                "102",
                "John",
                "Williams",
                "john@example.com",
                "Project Manager"
        );

        Employee employee3 = new Employee(
                "103",
                "David",
                "Brown",
                "david@example.com",
                "Data Analyst"
        );

        // Act
        employees.addEmployee(employee1);
        employees.addEmployee(employee2);
        employees.addEmployee(employee3);

        // Assert
        assertEquals(3, employees.getEmployees().size());

        assertEquals(employee1, employees.getEmployees().get(0));
        assertEquals(employee2, employees.getEmployees().get(1));
        assertEquals(employee3, employees.getEmployees().get(2));
    }

    @Test
    void shouldReturnEmployeeList() {

        // Arrange
        Employees employees = new Employees();

        Employee employee = new Employee(
                "101",
                "Sarah",
                "Smith",
                "sarah@example.com",
                "Software Developer"
        );

        employees.addEmployee(employee);

        // Act
        List<Employee> result = employees.getEmployees();

        // Assert
        assertNotNull(result);
        assertEquals(1, result.size());
        assertEquals(employee, result.get(0));
    }

    @Test
    void shouldReplaceEmployeeListUsingSetEmployees() {

        // Arrange
        Employees employees = new Employees();

        List<Employee> newList = new ArrayList<>();

        Employee employee1 = new Employee(
                "201",
                "Michael",
                "Johnson",
                "michael@example.com",
                "Backend Developer"
        );

        Employee employee2 = new Employee(
                "202",
                "Emily",
                "Davis",
                "emily@example.com",
                "UI Designer"
        );

        newList.add(employee1);
        newList.add(employee2);

        // Act
        employees.setEmployees(newList);

        // Assert
        assertEquals(2, employees.getEmployees().size());

        assertEquals(employee1, employees.getEmployees().get(0));
        assertEquals(employee2, employees.getEmployees().get(1));
    }
}