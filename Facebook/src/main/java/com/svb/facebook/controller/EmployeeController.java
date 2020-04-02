package com.svb.facebook.controller;

import com.svb.facebook.domain.Employee;
import com.svb.facebook.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * EmployeeController Class to get list of Employees
 */
@RestController
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;

    /**
     * this method will get all employees
     * @return list of employees
     */
    @GetMapping("employees")
    public ResponseEntity<List<Employee>> getEmployees() {
        List<Employee> employees = employeeService.getEmployees();
        return ResponseEntity.status(HttpStatus.OK).body(employees);
    }

}
