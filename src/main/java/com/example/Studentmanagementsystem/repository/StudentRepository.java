package com.example.Studentmanagementsystem.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.Studentmanagementsystem.entity.Student;

public interface StudentRepository extends JpaRepository<Student, Long>{

}
