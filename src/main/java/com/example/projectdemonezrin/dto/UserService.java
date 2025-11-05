package com.example.projectdemonezrin.dto;

import com.example.projectdemonezrin.entityUser.User;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class UserService {

    public void addUser(User user) {
        GlobalData.users.add(user);
        System.out.println("User added: " + user.getName());
    }


    public User findById(int id) {
        return GlobalData.users.stream()
                .filter(user -> user.getId() == id)
                .findFirst()
                .orElse(null);
    }

    public List<User> getAllUsers() {
        return new ArrayList<>(GlobalData.users);
    }
}

