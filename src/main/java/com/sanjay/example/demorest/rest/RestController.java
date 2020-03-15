package com.sanjay.example.demorest.rest;

import com.sanjay.example.demorest.model.Employee;
import com.sanjay.example.demorest.repository.EmployeeRepository;
import jdk.internal.org.jline.utils.Log;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@org.springframework.web.bind.annotation.RestController
public class RestController {

    @Autowired
    EmployeeRepository employeeRepository;

    @GetMapping("/employee")
    public List<Employee> getAllEmployee(){
        System.out.println("inside getAllEmployee");
            return employeeRepository.findAll();
    }

    @PostMapping("/employee")
    public List<Employee> createEmployee(List<Employee> employee){
        System.out.println("inside getAllEmployee");
        return employeeRepository.saveAll(employee);
    }

}
