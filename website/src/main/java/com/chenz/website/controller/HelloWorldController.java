package com.chenz.website.controller;

import com.chenz.website.domain.entity.WebResponse;
import com.chenz.website.service.HelloWorldAppService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author czy hmc
 * @version 1.0
 * {@code @description} demo controller
 * {@code @date} 2024/11/21
 */
@RestController
@RequestMapping("/hello_world")
@RequiredArgsConstructor
public class HelloWorldController {

    private final HelloWorldAppService helloWorldAppService;

    @GetMapping("/demo")
    public WebResponse<String> helloWorld() {
        return new WebResponse<>(helloWorldAppService.sayHello());
    }

}
