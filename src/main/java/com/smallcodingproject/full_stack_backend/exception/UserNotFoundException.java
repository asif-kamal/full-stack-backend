package com.smallcodingproject.full_stack_backend.exception;

public class UserNotFoundException extends RuntimeException {

    public UserNotFoundException(Long id) {
        super("No user with the id " + id + " was found");
    }
}
