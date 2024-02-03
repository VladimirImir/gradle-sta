package com.dev.dao;

import com.dev.model.User;

import java.util.List;

public class UserDao {

    public List<User> findAll() {
        return List.of(
                new User(10, "Ivan"),
                new User(11, "Petr"),
                new User(12, "Sveta")
        );
    }
}
