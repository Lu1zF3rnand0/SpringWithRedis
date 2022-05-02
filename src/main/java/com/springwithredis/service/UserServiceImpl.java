
package com.springwithredis.service;


import com.springwithredis.model.User;
import com.springwithredis.repository.UserDao;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService{

    private final UserDao userDao;

    public UserServiceImpl(UserDao userDao) {
        this.userDao = userDao;
    }

    @Override
    public boolean saveUser(User user) {
        return userDao.saveUser(user);
    }

    @Override
    public List<User> fetchAllUser() {
        return userDao.fetchAllUser();
    }

    @Override
    public User fetchAllUserById(Long id) {
        return userDao.fetchUserById(id);
    }

    @Override
    public boolean deleteUser(Long id) {
        return userDao.deleteUser(id);
    }

}
