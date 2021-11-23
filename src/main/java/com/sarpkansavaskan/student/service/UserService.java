package com.sarpkansavaskan.student.service;

import java.util.List;

import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.sarpkansavaskan.student.model.User;
import com.sarpkansavaskan.student.repository.UserRepository;

@Service
public class UserService implements UserDetailsService{
	
	private final UserRepository userRepository;
	

	public UserService(UserRepository userRepository) {
		super();
		this.userRepository = userRepository;
	}
	
	public User add(User user) {
		return userRepository.save(user);
	}
	
	public User update(User user) {
		return userRepository.save(user);
	}
	
	public void delete(Long id) {
		userRepository.deleteById(id);
	}
	
	public List<User> getAll(){
		return userRepository.findAll();
	}

	@Override
	public UserDetails loadUserByUsername(String userName) throws UsernameNotFoundException {
		User user = userRepository.findByUserName(userName);

		if (user == null) {
			throw new UsernameNotFoundException("Kullanıcı adı ve ya parola hatalı!!");
		}

		return new org.springframework.security.core.userdetails.User(user.getUserName(), user.getPassword(), null);
	
	}
	
	
	

}
