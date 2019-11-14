package com.aaa.service;

import com.aaa.fallback.SpringCloudFallbackFactory;
import com.aaa.model.User;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;
@FeignClient(value = "USER-PROVIDER",fallbackFactory = SpringCloudFallbackFactory.class)
public interface ISpringCloudService {
    @RequestMapping("/userAll")
    List<User> selectAllUsers();
}
