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

import com.sarpkansavaskan.student.model.User;
import com.sarpkansavaskan.student.service.UserService;

@RestController
@RequestMapping("/user")
@CrossOrigin
public class UserController {
	
	private final UserService userService;

	public UserController(UserService userService) {
		this.userService = userService;
	}
	
	@PostMapping("/add")
	public ResponseEntity<User> add(@RequestBody User user){
		return ResponseEntity.ok(userService.add(user));
	}
	
	@PutMapping("/{id}")
	public ResponseEntity<User> update(@RequestBody User user){
		return ResponseEntity.ok(userService.update(user));
	}
	
	@DeleteMapping("/{id}")
	public void delete(@PathVariable Long id) {
		userService.delete(id);
	}
	
	@GetMapping("/getAll")
	public ResponseEntity<List<User>> getAll(){
		return ResponseEntity.ok(userService.getAll());
	}
	

}
