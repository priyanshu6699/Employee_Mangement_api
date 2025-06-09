package com.thakurindustries.employee_mangement_app.controller;

import com.thakurindustries.employee_mangement_app.entity.EmployeeEntity;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;

import java.util.List;

@RestController
public interface EmployeeController {
    @GetMapping("/hello")
    public String hello();

    @GetMapping("/employees")
    public List<EmployeeEntity> readAllEmployees();

    @GetMapping("/employees/{id}")
    public EmployeeEntity readEmployeeId(Integer id);

    @PostMapping("/employees")
    public String createEmployees(List<EmployeeEntity> listemp);

    @DeleteMapping("/employees/{id}")
    public Boolean deleteEmployee(Integer id);

    @PutMapping("/employees/{id}")
    public String UpdateEmployee(Integer id, EmployeeEntity entity);
}
