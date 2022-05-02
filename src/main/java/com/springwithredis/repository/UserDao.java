package com.springwithredis.repository;
import com.springwithredis.model.User;

import java.util.List;

public interface UserDao {


    boolean saveUser(User user);

    List<User> fetchAllUser();

    User fetchUserById(Long id);

    boolean deleteUser(Long id);
}
