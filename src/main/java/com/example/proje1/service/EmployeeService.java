package com.example.proje1.service;

import com.example.proje1.model.Employee;
import com.example.proje1.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class EmployeeService {

    @Autowired
    private EmployeeRepository repository;

    public List<Employee> tumPersoneliGetir() {
        return repository.findAll(); // SQL: SELECT * FROM employees
    }

    public Employee personelKaydet(Employee employee) {
        return repository.save(employee);
    }
}