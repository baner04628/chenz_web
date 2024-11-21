package com.chenz.website.service;

import org.springframework.stereotype.Service;

/**
 * @author czy
 * @version 1.0
 * {@code @description} demo service
 * {@code @date} 2024/11/21
 */
@Service
public class HelloWorldAppService {

    /**
     * demo响应
     * @return 响应参数
     */
    public String sayHello() {
        return "Hello World";
    }

}
