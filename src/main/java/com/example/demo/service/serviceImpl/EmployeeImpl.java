package com.example.demo.service.serviceImpl;

import com.example.demo.entity.Employee;
import com.example.demo.service.EmployeeService;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;

@Service
public class EmployeeImpl implements EmployeeService {
    @Override
    public Flux<Employee> lstEmployee() {
        return Flux.just(new Employee(1L,"thinhnv"), new Employee(2L,"anhlt"));
    }
}
