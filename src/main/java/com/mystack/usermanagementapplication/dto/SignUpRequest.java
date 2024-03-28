package com.mystack.usermanagementapplication.dto;

import lombok.Data;

@Data
public class SignUpRequest {
    public String firstName;
    private String lastName;
    private String email;
    private String password;
}
