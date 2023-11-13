package com.example.demo.model;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
@Table(name = "Employees")
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String maEmployee;
    private String nameEmployee;
    private int age;
    private int money;
    @ManyToOne
    private PhongBan phong;
}
