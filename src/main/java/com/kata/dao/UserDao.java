package com.kata.dao;

import com.kata.model.User;

import java.util.List;

public interface UserDao {
    List<User> getAllUsers();
    void saveUser (User user);
    User getUserById(int id);
    void updateUser(User user);
    void deleteUserById(int id);
}
