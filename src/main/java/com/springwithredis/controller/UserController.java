package com.springwithredis.controller;


import com.springwithredis.model.User;
import com.springwithredis.service.UserService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UserController {

    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @PostMapping("/user")
    public ResponseEntity<String> saveUser(@RequestBody User user){
        boolean result = userService.saveUser(user);
        if(result)
            return ResponseEntity.ok("User Created Successfully");
        else
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
    }

    @GetMapping("/user")
    public ResponseEntity<List<User>> fetchAllUser(){
        List<User> users;
        users = userService.fetchAllUser();

        return ResponseEntity.ok(users);

    }

    @GetMapping("/user/{id}")
    public ResponseEntity<User> fetchUserById(@PathVariable("id")Long id){
        User user;
        user = userService.fetchAllUserById(id);
        return ResponseEntity.ok(user);
    }

    @DeleteMapping("/user/{id}")
    public ResponseEntity<String> deleteUser(@PathVariable("id") Long id){
        boolean result = userService.deleteUser(id);
        if(result)
            return ResponseEntity.ok("User Deleted Successfully");
        else
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
    }


}
