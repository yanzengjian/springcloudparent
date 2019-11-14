package com.aaa.controller;

import com.aaa.model.User;
import com.aaa.service.ISpringCloudService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserController {
    @Autowired
    private ISpringCloudService iSpringCloudService;
    @RequestMapping("/userAll")
    public List<User> selectAll(){
        return iSpringCloudService.selectAllUsers();
    }
}
