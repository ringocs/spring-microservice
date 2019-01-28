package com.example.restfulws.user;

public class User {
    private String name;
    private String email;

    public User() {
    }

    public User(String email, String name) {
        this.email = email;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return String.format("Name: %s -- Email: %s", name, email);
    }
}
