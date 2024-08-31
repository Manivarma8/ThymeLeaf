package com.example.ThymeleafDemo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.ThymeleafDemo.Model.Student;

public interface Repository extends JpaRepository<Student, Long>{

}