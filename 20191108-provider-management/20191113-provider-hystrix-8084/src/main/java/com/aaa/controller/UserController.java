package com.aaa.controller;

import com.aaa.model.User;
import com.aaa.service.Userservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserController {
    @Autowired
    private Userservice userservice;
    @GetMapping("/userAll")
    public List<User> selectAll() throws Exception {
        List<User> users = userservice.selectAll();
        if(users.size()>0){
            throw new Exception("模拟异常！");
        }
        System.out.println("8084");
        return users;
    }
}
