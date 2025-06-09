package com.thakurindustries.employee_mangement_app.service.impl;

import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.thakurindustries.employee_mangement_app.entity.EmployeeEntity;
import com.thakurindustries.employee_mangement_app.repository.EmployeeRepository;
import com.thakurindustries.employee_mangement_app.service.EmployeeService;

@Service
public class EmployeeServiceImpl implements EmployeeService {
    @Autowired
    private EmployeeRepository employeeRepository;

    @Override
    public List<EmployeeEntity> readAllEmployees() {
        return employeeRepository.findAll();
    }

    @Override
    public EmployeeEntity readEmployeeId(Integer id) {
        return employeeRepository.findById(id).orElse(null);
    }

    @Override
    public String createEmployees(List<EmployeeEntity> listemp) {
        for (EmployeeEntity emp : listemp) {
            employeeRepository.save(emp);
        }
        return "Employees created successfully";

    }

    @Override
    public Boolean deleteEmployee(Integer id) {
        employeeRepository.deleteById(id);
        return true;

    }

    @Override
    public String UpdateEmployee(Integer id, EmployeeEntity entity) {
        EmployeeEntity emp = employeeRepository.findById(id).orElse(null);
        if (emp != null) {
            System.out.println(emp);
            System.out.println(entity);
            BeanUtils.copyProperties(entity, emp, "id");

            // emp.setName(entity.getName());
            // emp.setAge(entity.getAge());
            // emp.setSalary(entity.getSalary());
            // emp.setDepartment(entity.getDepartment());
            // emp.setPosition(entity.getPosition());
            // emp.setEmail(entity.getEmail());
            // emp.setPhone(entity.getPhone());
            // emp.setAddress(entity.getAddress());
            // System.out.println(emp);
            employeeRepository.save(emp);
            return "Employee updated successfully";
        } else {
            return "Employee not found with id: " + id;
        }
    }

}
