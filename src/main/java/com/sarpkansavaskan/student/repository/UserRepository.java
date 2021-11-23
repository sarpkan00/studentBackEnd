package com.sarpkansavaskan.student.repository;


import org.springframework.data.jpa.repository.JpaRepository;

import com.sarpkansavaskan.student.model.User;

public interface UserRepository extends JpaRepository<User, Long> {
	
	User findByUserName(String userName);

}
