package com.sarpkansavaskan.student.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sarpkansavaskan.student.model.Student;

public interface StudentRepository extends JpaRepository<Student, Integer> {

	
}