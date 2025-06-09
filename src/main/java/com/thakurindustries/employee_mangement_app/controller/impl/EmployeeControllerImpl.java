package com.thakurindustries.employee_mangement_app.controller.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.thakurindustries.employee_mangement_app.controller.EmployeeController;
import com.thakurindustries.employee_mangement_app.entity.EmployeeEntity;
import com.thakurindustries.employee_mangement_app.service.EmployeeService;

@RestController
public class EmployeeControllerImpl implements EmployeeController {
    @Autowired
    private EmployeeService employeeService;

    public String hello() {
        System.out.println(employeeService);
        return "Hello from Spring Boot!";
    }

    public List<EmployeeEntity> readAllEmployees() {
        if (employeeService.readAllEmployees() == null) {
            return null;
        } else {
            return employeeService.readAllEmployees();
        }
    }

    public EmployeeEntity readEmployeeId(@PathVariable Integer id) {
        return employeeService.readEmployeeId(id);
    }

    public String createEmployees(@RequestBody List<EmployeeEntity> listemp) {
        return employeeService.createEmployees(listemp);
    }

    public Boolean deleteEmployee(@PathVariable Integer id) {
        return employeeService.deleteEmployee(id);
    }

    public String UpdateEmployee(@PathVariable Integer id, @RequestBody EmployeeEntity entity) {
        return employeeService.UpdateEmployee(id, entity);
    }

}