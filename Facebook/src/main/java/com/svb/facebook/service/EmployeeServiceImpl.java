package com.svb.facebook.service;

import com.svb.facebook.domain.Employee;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * Implementation for the EmployeeServiceImpl
 */
@Service
public class EmployeeServiceImpl implements EmployeeService{

    /**
     * Get the list of SVB Employees
     * @return list of Employee
     */
    @Override
    public List<Employee> getEmployees() {
       List<Employee> employees = new ArrayList<>();
                      employees.add(getEmployeeOne());
                      employees.add(getEmployeeTwo());
                      employees.add(getEmployeeThree());
                      employees.add(getEmployeeFour());
                      employees.add(getEmployeeFive());
                      employees.add(getEmployeeSix());
                      employees.add(getEmployeeSeven());
                      employees.add(getEmployeeEight());
                      employees.add(getEmployeeNine());
                      employees.add(getEmployeeTen());
       return employees;
    }

    private Employee getEmployeeOne() {
        return Employee.builder()
                       .name("Sander Bruggerman")
                       .gender("M")
                       .role("Front-end Engineer")
                       .work("Werkt het liefst aan mobiele-en webapplicaties")
                       .hobbies("Heeft bovendien een voorliefde voor muziek & festivals")
                       .build();
    }

    private Employee getEmployeeTwo() {
        return Employee.builder()
                        .name("Nick Bolink")
                        .gender("M")
                        .role("Front-end Engineer")
                        .work("Werkt het liefst aan mobiele")
                        .hobbies("Heeft bovendien een voorliefde voor muziek & dancen")
                        .build();
    }

    private Employee getEmployeeThree() {
        return Employee.builder()
                        .name("Max Derneden")
                        .gender("M")
                        .role("Office Manager")
                        .work("Werkt het liefst aan Office Manager")
                        .hobbies("Heeft bovendien een voorliefde voor Sproten")
                        .build();
    }

    private Employee getEmployeeFour() {
        return Employee.builder()
                        .name("Rosanne Geersten")
                        .gender("F")
                        .role("UX-desiner")
                        .work("Werkt het liefst aan UX designer")
                        .hobbies("Heeft bovendien een voorliefde voor design")
                        .build();
    }

    private Employee getEmployeeFive() {
        return Employee.builder()
                        .name("Zillah Calle")
                        .gender("F")
                        .role("Fullstack-Developer")
                        .work("Werkt het liefst aan Java en Angular")
                        .hobbies("Heeft bovendien een voorliefde voor fiesten")
                        .build();
    }

    private Employee getEmployeeSix() {
        return Employee.builder()
                        .name("Timo Wentink")
                        .gender("M")
                        .role("UX-designer")
                        .work("Werkt het liefst aan UX designer")
                        .hobbies("Heeft bovendien een voorliefde voor muziek")
                        .build();
    }

    private Employee getEmployeeSeven() {
        return Employee.builder()
                        .name("Caroline La")
                        .gender("F")
                        .role("Product Owner")
                        .work("Werkt het liefst aan functie manager")
                        .hobbies("Heeft bovendien een voorliefde voor sporten")
                        .build();
    }

    private Employee getEmployeeEight() {
        return Employee.builder()
                            .name("Bob Heartsink")
                            .gender("M")
                            .role("Business Analysit")
                            .work("Werkt het liefst aan functie manager")
                            .hobbies("Heeft bovendien een voorliefde voor fiesten")
                            .build();
    }

    private Employee getEmployeeNine() {
        return Employee.builder()
                            .name("Eline Frances")
                            .gender("F")
                            .role("Project Manger")
                            .work("Werkt het liefst aan project manager")
                            .hobbies("Heeft bovendien een voorliefde voor fiesten")
                            .build();
    }

    private Employee getEmployeeTen() {
        return Employee.builder()
                            .name("Thibbesh N")
                            .gender("M")
                            .role("backend Developer")
                            .work("Werkt het liefst aan backend developer")
                            .hobbies("Heeft bovendien een voorliefde voor sporten")
                            .build();
    }

}
