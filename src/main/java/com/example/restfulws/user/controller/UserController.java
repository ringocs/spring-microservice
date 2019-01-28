package com.example.restfulws.user.controller;

import com.example.restfulws.user.User;
import com.example.restfulws.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;
import java.util.List;

@RestController
public class UserController {
    @Autowired
    private UserService userService;

    @GetMapping("/users")
    public List<User> retrieveAllUsers() {
        return userService.getAll();
    }

    @GetMapping("/users/{email}")
    public User retrieveUser(@PathVariable String email) {
        return userService.findByEmail(email);
    }

    @RequestMapping(method = RequestMethod.POST, path = "/users/create")
    public ResponseEntity<Object> createUser(@RequestBody User user) {
        userService.addUser(user);

        URI location = ServletUriComponentsBuilder.fromCurrentRequest()
                .path("/{email}")
                .buildAndExpand(user.getEmail())
                .toUri();
        return ResponseEntity.created(location).build();
    }
}
