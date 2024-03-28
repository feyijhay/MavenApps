package com.mystack.usermanagementapplication.service;

import com.mystack.usermanagementapplication.dto.SignUpRequest;
import com.mystack.usermanagementapplication.entity.User;

public interface UserService {
   String SignUp(SignUpRequest signUpRequest);


}
