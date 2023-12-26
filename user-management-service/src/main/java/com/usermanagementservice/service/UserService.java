package com.usermanagementservice.service;

import com.usermanagementservice.model.userEntity.UserEntity;
import com.usermanagementservice.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    UserRepository userRepository;

    @Autowired
    private BCryptPasswordEncoder passwordEncoder;

    public UserEntity createUser(UserEntity userEntity) {

        // Check if the username is unique
        if (userRepository.findByUserName(userEntity.getUserName()) != null) {
            throw new RuntimeException("Username already exists");
        }

        // Check if the email is unique
        if (userRepository.findByEmail(userEntity.getEmail()) != null) {
            throw new RuntimeException("Email already exists");
        }

        // Encrypt the password before saving
        userEntity.setPassword(passwordEncoder.encode(userEntity.getPassword()));

        return userRepository.save(userEntity);
    }
}
