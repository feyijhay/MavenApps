package com.mystack.usermanagementapplication.repository;

import com.mystack.usermanagementapplication.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Integer> {
}
