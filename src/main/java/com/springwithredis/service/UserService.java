package com.springwithredis.service;


import com.springwithredis.model.User;

import java.util.List;

public interface UserService {
    boolean saveUser(User user);

    List<User> fetchAllUser();

    User fetchAllUserById(Long id);

    boolean deleteUser(Long id);
}
