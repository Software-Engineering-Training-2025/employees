package com.example.employees.repository;

import com.example.employees.mapper.EmployeeMapper;
import com.example.employees.model.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class EmployeeRepository {
    @Autowired
    private JdbcTemplate jdbcTemplate;
    @Autowired
    private EmployeeMapper employeeMapper;

    public List<Employee> getEmployees() {
        return jdbcTemplate.query("select * from employee",
                employeeMapper);
    }

    public void createEmployee(String name, String email, double salary) {
        jdbcTemplate.update(
                "INSERT INTO EMPLOYEE(name, email, salary) values(?, ?, ?)",
                name,
                email,
                salary
        );
    }


}
