package com.example.proje1.controller;

import com.example.proje1.model.Employee;
import com.example.proje1.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/employees")
public class EmployeeController {

    @Autowired
    private EmployeeService service;

    @GetMapping
    public List<Employee> listele() {
        return service.tumPersoneliGetir();
    }

    @PostMapping
    public Employee ekle(@RequestBody Employee employee) {
        return service.personelKaydet(employee);
    }
}