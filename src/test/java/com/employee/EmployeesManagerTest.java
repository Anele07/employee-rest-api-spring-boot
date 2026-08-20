package com.employee;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class EmployeesManagerTest {

    @Test
    void shouldInitializeEmployees() {

        // Arrange
        EmployeeManager employeeManager = new EmployeeManager();

        // Act
        Employees employees = employeeManager.getEmployees();

        // Assert
        assertNotNull(employees);
        assertNotNull(employees.getEmployees());
        assertEquals(3, employees.getEmployees().size());
    }

    @Test
    void shouldReturnEmployees() {

        // Arrange
        EmployeeManager employeeManager = new EmployeeManager();

        // Act
        Employees employees = employeeManager.getEmployees();

        // Assert
        assertNotNull(employees);

        assertEquals(
                3,
                employees.getEmployees().size()
        );

        assertEquals(
                "101",
                employees.getEmployees().get(0).getEmployeeID()
        );

        assertEquals(
                "Sarah",
                employees.getEmployees().get(0).getFirstName()
        );

        assertEquals(
                "102",
                employees.getEmployees().get(1).getEmployeeID()
        );

        assertEquals(
                "103",
                employees.getEmployees().get(2).getEmployeeID()
        );
    }

    @Test
    void shouldAddEmployee() {

        // Arrange
        EmployeeManager employeeManager = new EmployeeManager();

        Employee newEmployee = new Employee(
                "104",
                "Michael",
                "Johnson",
                "michael@example.com",
                "Backend Developer"
        );

        // Act
        employeeManager.addEmployee(newEmployee);

        // Assert
        assertEquals(
                4,
                employeeManager.getEmployees()
                        .getEmployees()
                        .size()
        );

        Employee addedEmployee =
                employeeManager.getEmployees()
                        .getEmployees()
                        .get(3);

        assertEquals(
                "104",
                addedEmployee.getEmployeeID()
        );

        assertEquals(
                "Michael",
                addedEmployee.getFirstName()
        );

        assertEquals(
                "Johnson",
                addedEmployee.getLastName()
        );

        assertEquals(
                "michael@example.com",
                addedEmployee.getEmail()
        );

        assertEquals(
                "Backend Developer",
                addedEmployee.getTitle()
        );
    }
}