package com.aaa.controller;

import com.aaa.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@RestController
public class UserController {
    private static final String URL ="http://USER-PROVIDER/";
    @Autowired
    private RestTemplate restTemplate;
    @GetMapping("/userAll")
    public List<User> selectAll(){
        return restTemplate.getForObject(URL+"userAll",List.class);
    }
}
