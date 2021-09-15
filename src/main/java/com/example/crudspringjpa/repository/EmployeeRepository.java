package com.example.crudspringjpa.repository;

import com.example.crudspringjpa.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {
}
