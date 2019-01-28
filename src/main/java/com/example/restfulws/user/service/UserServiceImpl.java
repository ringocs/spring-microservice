package com.example.restfulws.user.service;

import com.example.restfulws.user.User;
import com.example.restfulws.user.exception.UserNotFoundException;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

@Service("userService")
public class UserServiceImpl implements UserService {
    private static Map<String, User> userMap = new HashMap<>();

    static {
        userMap.put("john@sample.com", new User("john@sample.com", "John K"));
        userMap.put("jerry@sample.com", new User("jerry@sample.com", "Jerry Mouse"));
        userMap.put("tom@sample.com", new User("tom@sample.com", "Tom Cat"));
    }

    @Override
    public List<User> getAll() {
        return userMap.values().stream().collect(Collectors.toList());
//        return new ArrayList<>(userMap.values());
    }

    @Override
    public void addUser(User user) {
        userMap.put(user.getEmail(), user);
    }

    @Override
    public User findByEmail(String email) {
        if (!userMap.containsKey(email)) {
            throw new UserNotFoundException("email - " + email);
        }
        return userMap.get(email);
    }
}
