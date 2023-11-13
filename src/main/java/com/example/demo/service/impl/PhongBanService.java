package com.example.demo.service.impl;

import com.example.demo.model.Employee;
import com.example.demo.model.PhongBan;
import com.example.demo.repository.EmployeeRepository;
import com.example.demo.repository.PhongBanRepository;
import com.example.demo.service.IEmplService;
import com.example.demo.service.IPhongBanRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class PhongBanService implements IPhongBanRepository {
    @Autowired
    private PhongBanRepository phongBanRepository;
    @Override
    public Iterable<PhongBan> findAll() {
        return phongBanRepository.findAll();
    }

    @Override
    public Optional<PhongBan> findById(Long id) {
        return phongBanRepository.findById(id);
    }

    @Override
    public void save(PhongBan phongBan) {
        phongBanRepository.save(phongBan);
    }

    @Override
    public void delete(Long id) {
        phongBanRepository.deleteById(id);
    }
}
