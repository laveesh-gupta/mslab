package com.example.studentbootdb.service;

import com.example.studentbootdb.model.User;
import com.example.studentbootdb.repository.UserRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    private final UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository=userRepository;
    }

    public List<User> getAllUsers() {
        return userRepository.findAll();
    }

    public User getUser(Integer id) {
        return userRepository.findById(id).orElse(null);
    }

    public User create(User user) {
        return userRepository.save(user);
    }

    public void delete(Integer id) {
        userRepository.deleteById(id);
    }

    public void deleteAll() {
        userRepository.deleteAll();
    }

    public User update(User user, Integer id) {
        User user1=userRepository.findById(id).get();
        user1.setName(user.getName());
        user1.setEmail(user.getEmail());
        return userRepository.save(user1);
    }
}