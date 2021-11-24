package com.example.studentbootdb.controller;

import com.example.studentbootdb.model.User;
import com.example.studentbootdb.service.UserService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UserController {
    
    private final UserService userService;

    public UserController(UserService userService) {
        this.userService=userService;
    }

    @GetMapping("/getAllUsers")
    public List<User> getAllUsers() {
        return userService.getAllUsers();
    }

    @GetMapping("/get/{id}")
    public User getUser(@PathVariable Integer id) {
        return userService.getUser(id);
    }

    @PostMapping("/createUser")
    public User createUser(@RequestBody User user) {
        return userService.create(user);
    }

    @PutMapping("/updateUser/{id}")
    public User updateUser(@RequestBody User user, @PathVariable Integer id) {
        return userService.update(user, id);
    }

    @DeleteMapping("/deleteUser/{id}")
    public String deleteUser(@PathVariable Integer id) {
        userService.delete(id);
        return "Deleted";
    }

    @DeleteMapping("/deleteAll")
    public String deleteAll() {
        userService.deleteAll();
        return "All records deleted";
    }
}