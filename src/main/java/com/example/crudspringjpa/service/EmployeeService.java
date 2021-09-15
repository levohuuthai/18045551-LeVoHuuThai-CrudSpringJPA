package com.example.crudspringjpa.service;

import com.example.crudspringjpa.entity.Employee;
import com.example.crudspringjpa.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
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
