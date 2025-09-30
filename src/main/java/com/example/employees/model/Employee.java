package com.example.employees.model;

import java.util.Date;

public class Employee {
    private long id;
    private String name;
    private String email;
    private double salary;

    public Employee() {
    }

    public Employee(long id, double salary, String email, String name) {
        this.salary = salary;
        this.email = email;
        this.name = name;
        this.id = id;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
