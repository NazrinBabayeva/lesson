package com.example.projectdemonezrin.entityUser;


import java.util.List;
import java.util.ArrayList;


public class userList {
    private static List<User>  UserList= new ArrayList<>();


    public List<User> getuserList() {
        if (UserList == null) {
            UserList = new ArrayList<>();
        }
        return UserList;
    }

    public void setuserList(List<User> userList) {
        this.UserList = userList;
    }

    public User findById(Long id) {
        return null;
    }

    public User saveUser(User user) {
        return user;
    }
}
