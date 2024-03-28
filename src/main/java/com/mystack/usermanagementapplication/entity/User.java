package com.mystack.usermanagementapplication.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;

import lombok.Data;
import lombok.RequiredArgsConstructor;

@Data
//@AllArgsConstructor
@RequiredArgsConstructor
@Entity
@Table(name = "users_table")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    private String firstName;
    private String lastName;
    private String email;
    private String password;
    private Role role;


}
