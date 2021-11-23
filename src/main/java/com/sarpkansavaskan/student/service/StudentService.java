package com.sarpkansavaskan.student.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.sarpkansavaskan.student.model.Student;
import com.sarpkansavaskan.student.repository.StudentRepository;

@Service
public class StudentService {
	
	private final StudentRepository studentRepository;

	public StudentService(StudentRepository studentRepository) {
		super();
		this.studentRepository = studentRepository;
	}
	
	
	public Student add(Student student) {
		return studentRepository.save(student);
	}
	
	public Student update(Student student) {
		return studentRepository.save(student);
	}
	
	public void delete(int id) {
	   studentRepository.deleteById(id);
	}
	
	public Student getById(int id) {
		return studentRepository.findById(id).get();
	}
	
	public List<Student> getAll() {
		return this.studentRepository.findAll();
		
	}

}
