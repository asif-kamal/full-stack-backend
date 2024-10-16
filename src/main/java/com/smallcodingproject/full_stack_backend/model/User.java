package com.smallcodingproject.full_stack_backend.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "users") // added @Table to distinguish from user keyword in postgreSQL
public class User {
    @Id
    @GeneratedValue
    private Long id;
    private String username;
    private String name;
    private String email;

    
}
