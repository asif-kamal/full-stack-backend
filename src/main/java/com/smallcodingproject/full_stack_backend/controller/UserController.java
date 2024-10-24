package com.smallcodingproject.full_stack_backend.controller;

import java.util.List;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.smallcodingproject.full_stack_backend.exception.UserNotFoundException;
import com.smallcodingproject.full_stack_backend.model.User;
import com.smallcodingproject.full_stack_backend.repository.UserRepository;

import lombok.AllArgsConstructor;

@CrossOrigin("http://localhost:3000")
@AllArgsConstructor
@RestController
@RequestMapping("/users")
public class UserController {

    private UserRepository userRepository;

    @PostMapping("/register")
    public User registerNewUser(@RequestBody User newUser) {
        return userRepository.save(newUser);
    }

    @GetMapping()
    public List<User> getAllUsers() {
        return userRepository.findAll();
    }

    @GetMapping("/{id}")
    public User getUserById(@PathVariable Long id) {
        return userRepository.findById(id).orElseThrow(() -> new UserNotFoundException(id));
    }
}
