package com.example.projectdemonezrin.dto;
import ch.qos.logback.classic.spi.ILoggingEvent;
import ch.qos.logback.classic.spi.LoggingEvent;
import com.example.projectdemonezrin.entityUser.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;


@RestController
@RequestMapping("/api/users")
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping
    public void addUser(@RequestBody User user) {
        userService.addUser(user);
    }

    @GetMapping("/{id}")
    public User findById(@PathVariable int id) {
        User user = userService.findById(id);
        if (user != null) {
            return UserDto.ok(user);
        } else {
            return null;
        }

    }

    @GetMapping
    public List<User> getAllUsers() {
        return userService.getAllUsers();
    }




}
