package com.aaa.controller;

import com.aaa.model.User;
import com.aaa.service.Userservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserController {
    @Autowired
    private Userservice userservice;
    @GetMapping("/userAll")
    public List<User> selectAll() throws Exception {

        System.out.println("8081");
        return userservice.selectAll();
    }
}
