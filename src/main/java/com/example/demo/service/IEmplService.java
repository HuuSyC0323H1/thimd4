package com.example.demo.service;

import com.example.demo.model.Employee;

import java.util.List;

public interface IEmplService extends IGenerateService<Employee> {
    List<Employee> getAllUsersOrderByAgeAsc();
}
