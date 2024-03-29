package com.quarkus.example.repository;

import com.quarkus.example.model.User;

import javax.enterprise.context.ApplicationScoped;
import java.util.List;

@ApplicationScoped
public interface UserRepository {

    public List<User> getAllUsers();

    public User getUserById(int userId);

    public User addNewUser(User user);

    public void updateUserById(int userId, User user);

    public void deleteUserById(int userId);

}
