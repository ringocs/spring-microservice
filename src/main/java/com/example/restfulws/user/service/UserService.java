package com.example.restfulws.user.service;

import com.example.restfulws.user.User;

import java.util.List;

public interface UserService {
    List<User> getAll();
    void addUser(User user);
    User findByEmail(String email);
}
