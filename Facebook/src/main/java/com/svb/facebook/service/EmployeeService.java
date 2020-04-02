package com.svb.facebook.service;

import com.svb.facebook.domain.Employee;

import java.util.List;

/**
 * Interface for the EmployeeService
 */
public interface EmployeeService {

    /**
     * This method used to getEmployees
     * @return list of employee
     */
    List<Employee> getEmployees();
}
