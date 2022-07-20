package com.example.demo.service;

import com.example.demo.entity.Employee;
import reactor.core.publisher.Flux;

public interface EmployeeService {
    Flux<Employee> lstEmployee ();
}
