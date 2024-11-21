package com.chenz.website;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class WebsiteApplication {

    public static void main(String[] args) {
        SpringApplication.run(WebsiteApplication.class, args);
        System.out.println("       *****************      ");
        System.out.println("       * 网站服务启动成功 *      ");
        System.out.println("       *****************      ");
    }
}
