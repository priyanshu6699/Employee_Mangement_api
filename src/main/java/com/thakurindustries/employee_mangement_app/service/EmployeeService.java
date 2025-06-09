package com.thakurindustries.employee_mangement_app.service;

import com.thakurindustries.employee_mangement_app.entity.EmployeeEntity;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public interface EmployeeService {
    public List<EmployeeEntity> readAllEmployees();

    public EmployeeEntity readEmployeeId(Integer id);

    public String createEmployees(List<EmployeeEntity> listemp);

    public Boolean deleteEmployee(Integer id);

    public String UpdateEmployee(Integer id, EmployeeEntity entity);
}
