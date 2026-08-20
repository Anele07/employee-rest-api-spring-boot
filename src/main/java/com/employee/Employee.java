package com.employee;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Employee {
    @JsonProperty("employee_id")
    private String employeeID;
    @JsonProperty("first_name")
    private String firstName;
    @JsonProperty("last_name")
    private String lastName;
    private String email;
    private String title;

    public Employee(){

    }

    public Employee(String employee_id, String first_name, String last_name,
                    String email, String title){
        this.employeeID = employee_id;
        this.firstName = first_name;
        this.lastName = last_name;
        this.email = email;
        this.title = title;
    }

    public String getEmployeeID(){
        return this.employeeID;
    }

    public String getFirstName(){
        return this.firstName;
    }

    public String getLastName(){
        return this.lastName;
    }

    public String getEmail(){
        return this.email;
    }

    public String getTitle(){
        return this.title;
    }

    public void setEmployeeID(String employeeID){
        this.employeeID = employeeID;
    }

    public void setFirstName(String firstName){
        this.firstName = firstName;
    }

    public void setLastName(String lastName){
        this.lastName = lastName;
    }

    public void setEmail(String email){
        this.email = email;
    }

    public void setTitle(String title){
        this.title = title;
    }
}
