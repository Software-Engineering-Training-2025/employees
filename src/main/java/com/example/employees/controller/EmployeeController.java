package com.example.employees.controller;

import com.example.employees.dto.EmployeeRequestDto;
import com.example.employees.model.Employee;
import com.example.employees.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class EmployeeController {
    @Autowired
    private EmployeeService employeeService;

    @GetMapping("/employees")
    public List<Employee> getEmployees(){
        return employeeService.getAllEmployees();
    }

    @PostMapping("/employee")
    public void createEmployee(@RequestBody EmployeeRequestDto employeeRequestDto){
        employeeService.createEmployee(employeeRequestDto.getName(),
                employeeRequestDto.getEmail(),
                employeeRequestDto.getSalary());
    }
}
