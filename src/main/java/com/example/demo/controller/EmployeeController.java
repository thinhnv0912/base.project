package com.example.demo.controller;

import com.example.demo.entity.Employee;
import com.example.demo.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;

@RestController
public class EmployeeController {
    @Autowired
    private  EmployeeService employeeService;

    @GetMapping("/employees")
    private Flux<Employee> getAllEmployees() {
        return employeeService.lstEmployee();
    }

}
