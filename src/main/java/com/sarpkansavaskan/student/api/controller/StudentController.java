package com.sarpkansavaskan.student.api.controller;

import java.util.List;


import org.springframework.http.ResponseEntity;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

import com.sarpkansavaskan.student.model.Student;
import com.sarpkansavaskan.student.service.StudentService;


@RestController
@RequestMapping("/student")
@CrossOrigin
public class StudentController {
	
	private final StudentService studentService;

	public StudentController(StudentService studentService) {
		this.studentService = studentService;
	}
	
	@PostMapping("/add")
	public ResponseEntity<Student> add( @RequestBody Student student){
		return ResponseEntity.ok(studentService.add(student));
	}
	
	@PutMapping("/update")
	public ResponseEntity<Student> update(@RequestBody Student student){
		return ResponseEntity.ok(studentService.update(student));
	}
	
	@DeleteMapping("/delete/{id}")
	public void delete(@PathVariable int id) {
		studentService.delete(id);
	}

	@GetMapping("/getById{id}")
	public ResponseEntity<Student> getById(@PathVariable int id){
		return ResponseEntity.ok(studentService.getById(id));
	}
	
	@GetMapping("/getall")
	public ResponseEntity<List<Student>> getAll(){
		return ResponseEntity.ok(studentService.getAll());
	}
}
