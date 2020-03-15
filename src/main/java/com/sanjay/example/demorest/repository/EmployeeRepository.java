package com.sanjay.example.demorest.repository;

import com.sanjay.example.demorest.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;

@Component
public interface EmployeeRepository extends JpaRepository<Employee,Long> {
}
