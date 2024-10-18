package com.smallcodingproject.full_stack_backend.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.smallcodingproject.full_stack_backend.model.User;
import com.smallcodingproject.full_stack_backend.repository.UserRepository;

import lombok.AllArgsConstructor;

@AllArgsConstructor
@RestController
@RequestMapping("/users")
public class UserController {

    private UserRepository userRepository;

    @PostMapping("/register")
    public User registerNewUser(@RequestBody User newUser) {
        return userRepository.save(newUser);
    }

    
}
