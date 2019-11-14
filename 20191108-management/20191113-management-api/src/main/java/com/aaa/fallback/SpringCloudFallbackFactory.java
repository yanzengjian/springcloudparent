package com.aaa.fallback;

import com.aaa.model.User;
import com.aaa.service.ISpringCloudService;
import feign.hystrix.FallbackFactory;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class SpringCloudFallbackFactory implements FallbackFactory<ISpringCloudService> {

    @Override
    public ISpringCloudService create(Throwable throwable) {
        return new ISpringCloudService() {
            @Override
            public List<User> selectAllUsers() {
                System.out.println("熔断方法，我被访问了！");
                return null;
            }
        };
    }
}
