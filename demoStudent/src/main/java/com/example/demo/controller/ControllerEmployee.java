package com.example.demo.controller;

import com.example.demo.model.dto.Employee;
import com.example.demo.model.dto.Student;
import com.example.demo.model.entity.EmployeeEntity;
import com.example.demo.model.entity.PersonEntity;
import com.example.demo.model.entity.StudentEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

public class ControllerEmployee {
    @Autowired
    PersonRepo personRepo;

    @Autowired
    StudentRepo studentRepo;

    @Autowired
    EmployeeRepo employeeRepo;

    @GetMapping (value = "/getAllPersons")
    public List<PersonEntity> getAllPersons()    {return personRepo.findAll(); }

    @GetMapping (value = "/getAllStudents")
    public List<StudentEntity> getAllStudents() {return studentRepo.findAll(); }

    @GetMapping(value = "/getAllEmployees")
    public List<EmployeeEntity> getAllEmployees() {return employeeRepo.findAll(); }



}
