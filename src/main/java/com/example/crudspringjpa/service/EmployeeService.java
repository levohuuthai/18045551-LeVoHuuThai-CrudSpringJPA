package com.example.crudspringjpa.service;

import com.example.crudspringjpa.entity.Employee;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public interface EmployeeService {
    List<Employee> findAll();

    Employee getEmployee(int id);

    void createEmployee(Employee employee);

    void updateEmployee(Employee employee);

    void deleteEmployee(int id);

}
