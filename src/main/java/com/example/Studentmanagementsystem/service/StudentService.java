package com.example.Studentmanagementsystem.service;

import java.util.List;

import com.example.Studentmanagementsystem.entity.Student;

public interface StudentService {
	List<Student> getAllStudents();

	Student saveStudent(Student student);

	Student getStudentById(Long id);

	Student updateStudent(Student student);
	
	void deleteStudentById(Long id);
	
	List<Student> getByKeyword(String keyword);
}
