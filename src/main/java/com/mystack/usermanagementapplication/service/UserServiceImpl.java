package com.mystack.usermanagementapplication.service;

import com.mystack.usermanagementapplication.dto.SignUpRequest;
import com.mystack.usermanagementapplication.entity.Role;
import com.mystack.usermanagementapplication.entity.User;
import com.mystack.usermanagementapplication.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
//import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
//   private final PasswordEncoder passwordEncoder = new BCryptPasswordEncoder();


   @Autowired
   private  UserRepository userRepository;

    @Override
    public String SignUp(SignUpRequest signUpRequest) {
       User user = new User();
       user.setFirstName(signUpRequest.getFirstName());
       user.setLastName(signUpRequest.getLastName());
       user.setEmail(signUpRequest.getEmail());
//       user.setPassword(passwordEncoder.encode(signUpRequest.getPassword()));
       user.setRole(Role.ADMIN);
       userRepository.save(user);
       return "Successfully Created";

    }
}
