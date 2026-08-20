package com.employee;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class EmployeeTest {
    @Test
    public void shouldStoreEmployeeInformation(){
        // Arrange & Act
        Employee employee = new Employee(
                "101",
                "Sarah",
                "Smith",
                "sarah@example.com",
                "Software Developer"
        );

        // Assert
        assertEquals("101", employee.getEmployeeID());
        assertEquals("Sarah", employee.getFirstName());
        assertEquals("Smith", employee.getLastName());
        assertEquals("sarah@example.com", employee.getEmail());
        assertEquals("Software Developer", employee.getTitle());
    }

    @Test
    void shouldUpdateEmployeeID() {

        // Arrange
        Employee employee = new Employee(
                "101",
                "Sarah",
                "Smith",
                "sarah@example.com",
                "Software Developer"
        );

        // Act
        employee.setEmployeeID("200");

        // Assert
        assertEquals("200", employee.getEmployeeID());
    }

    @Test
    void shouldUpdateFirstName() {

        // Arrange
        Employee employee = new Employee(
                "101",
                "Sarah",
                "Smith",
                "sarah@example.com",
                "Software Developer"
        );

        // Act
        employee.setFirstName("Michael");

        // Assert
        assertEquals("Michael", employee.getFirstName());
    }

    @Test
    void shouldUpdateLastName() {

        // Arrange
        Employee employee = new Employee(
                "101",
                "Sarah",
                "Smith",
                "sarah@example.com",
                "Software Developer"
        );

        // Act
        employee.setLastName("Johnson");

        // Assert
        assertEquals("Johnson", employee.getLastName());
    }

    @Test
    void shouldUpdateEmail() {

        // Arrange
        Employee employee = new Employee(
                "101",
                "Sarah",
                "Smith",
                "sarah@example.com",
                "Software Developer"
        );

        // Act
        employee.setEmail("newemail@example.com");

        // Assert
        assertEquals("newemail@example.com", employee.getEmail());
    }

    @Test
    void shouldUpdateTitle() {

        // Arrange
        Employee employee = new Employee(
                "101",
                "Sarah",
                "Smith",
                "sarah@example.com",
                "Software Developer"
        );

        // Act
        employee.setTitle("Senior Software Developer");

        // Assert
        assertEquals(
                "Senior Software Developer",
                employee.getTitle()
        );
    }

}
