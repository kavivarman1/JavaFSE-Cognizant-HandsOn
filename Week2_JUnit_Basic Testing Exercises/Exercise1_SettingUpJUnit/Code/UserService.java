package com.example;

import java.util.HashMap;
import java.util.Map;

public class UserService {

    private Map<String, String> users = new HashMap<>();

    public boolean register(String username, String password) {
        if (username == null || password == null || users.containsKey(username)) {
            return false;
        }
        users.put(username, password);
        return true;
    }

    public boolean login(String username, String password) {
        return password != null && password.equals(users.get(username));
    }

    public int getUserCount() {
        return users.size();
    }
}
