package com.example.demo.controller;

import com.example.demo.model.Employee;
import com.example.demo.model.PhongBan;
import com.example.demo.service.impl.EmplService;
import com.example.demo.service.impl.PhongBanService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin("*")
@RequestMapping("/phong")
public class PhongController {
    @Autowired
    private PhongBanService phongBanService;

    @GetMapping
    public ResponseEntity<Iterable<PhongBan>> showPhongBan(){
        return new ResponseEntity<>(phongBanService.findAll(), HttpStatus.OK);
    }
}
