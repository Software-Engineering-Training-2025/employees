package com.example.employees.mapper;

import com.example.employees.model.Employee;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

import javax.swing.tree.TreePath;
import java.sql.ResultSet;
import java.sql.SQLException;

@Component
public class EmployeeMapper implements RowMapper<Employee> {

    @Override
    public Employee mapRow(ResultSet resultSet, int rowNum) throws SQLException {
        return new Employee(resultSet.getInt("id"),
                resultSet.getDouble("salary"),
                resultSet.getString("name"),
                resultSet.getString("email"));
    }
}
