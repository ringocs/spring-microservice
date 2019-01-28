package com.example.restfulws.user.dao;

import com.example.restfulws.user.User;

import java.util.List;

public interface UserDao {
    List<User> getAll();
    User getUserByEmail(String email);
    void addUser();
}
