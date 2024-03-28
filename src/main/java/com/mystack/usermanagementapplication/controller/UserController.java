package com.mystack.usermanagementapplication.controller;

import com.mystack.usermanagementapplication.dto.SignUpRequest;
import com.mystack.usermanagementapplication.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/v1/user")
@RequiredArgsConstructor
public class UserController {
    @Autowired
    private UserService userService;


    @PostMapping("/signup")
    public String signup(@RequestBody SignUpRequest signUpRequest){
        userService.SignUp(signUpRequest);
        return "success";

    }


}
