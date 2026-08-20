package com.employee;

import org.springframework.stereotype.Service;

@Service
public class EmployeeManager {
    private Employees employees;

    public EmployeeManager() {

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

        employees = new Employees();

        employees.addEmployee(employee1);
        employees.addEmployee(employee2);
        employees.addEmployee(employee3);
    }

    public Employees getEmployees() {
        return employees;
    }

    public void addEmployee(Employee employee) {
        employees.addEmployee(employee);
    }
}
