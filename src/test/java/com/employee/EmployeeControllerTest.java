package com.employee;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
public class EmployeeControllerTest {

    @Mock
    private EmployeeManager employeeManager;

    private EmployeeController employeeController;

    @BeforeEach
    void setUp() {
        employeeController = new EmployeeController(employeeManager);
    }

    @Test
    void shouldReturnEmployees() {

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

        when(employeeManager.getEmployees())
                .thenReturn(employees);

        // Act
        Employees result = employeeController.getEmployees();

        // Assert
        assertNotNull(result);
        assertEquals(employees, result);
        assertEquals(1, result.getEmployees().size());

        verify(employeeManager).getEmployees();
    }

    @Test
    void shouldAddEmployee() {

        // Arrange
        Employee employee = new Employee(
                "104",
                "Michael",
                "Johnson",
                "michael@example.com",
                "Backend Developer"
        );

        Employees employees = new Employees();
        employees.addEmployee(employee);

        when(employeeManager.getEmployees())
                .thenReturn(employees);

        // Act
        Employees result = employeeController.addEmployee(employee);

        // Assert
        assertNotNull(result);

        assertEquals(
                1,
                result.getEmployees().size()
        );

        assertEquals(
                "104",
                result.getEmployees().get(0).getEmployeeID()
        );

        assertEquals(
                "Michael",
                result.getEmployees().get(0).getFirstName()
        );

        assertEquals(
                "Johnson",
                result.getEmployees().get(0).getLastName()
        );

        assertEquals(
                "michael@example.com",
                result.getEmployees().get(0).getEmail()
        );

        assertEquals(
                "Backend Developer",
                result.getEmployees().get(0).getTitle()
        );

        verify(employeeManager).addEmployee(employee);
        verify(employeeManager).getEmployees();
    }
}