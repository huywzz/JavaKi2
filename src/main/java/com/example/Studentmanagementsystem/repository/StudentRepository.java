package com.example.Studentmanagementsystem.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.example.Studentmanagementsystem.entity.Student;
@Repository
public interface StudentRepository extends JpaRepository<Student, Long>{
	@Query(value = "select * from sms.students where first_name like %:keyword%",nativeQuery = true)
	List<Student> findByKeyword(@Param("keyword") String keyword);
}
