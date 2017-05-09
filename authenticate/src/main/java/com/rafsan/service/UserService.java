package com.rafsan.service;

import com.rafsan.entity.User;

public interface UserService {

    public User findByUsername(String username);
}
