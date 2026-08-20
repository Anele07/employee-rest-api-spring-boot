package com.employee;

import java.util.ArrayList;
import java.util.List;

public class Employees {
    private List<Employee> employees = new ArrayList<>();

    public void addEmployee(Employee e){
        employees.add(e);
    }

    public List<Employee> getEmployees(){
        return employees;
    }

    public void setEmployees(List<Employee> employees){
        this.employees = employees;
    }
}
