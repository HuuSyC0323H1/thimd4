package com.example.demo.service;

import com.example.demo.model.Employee;

import java.util.Optional;

public interface IGenerateService<T>{
    Iterable<T> findAll();
    Optional<T> findById(Long id);
    void save(T t);
    void delete(Long id);
}
