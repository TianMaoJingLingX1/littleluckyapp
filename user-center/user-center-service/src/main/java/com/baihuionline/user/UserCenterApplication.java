package com.baihuionline.user;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * Description: {功能简述}
 *
 * @author: baihui
 * @date :2021年02月03日 01时05分
 * Note: 真正的大师，永远怀着一颗学徒的心。
 */
@SpringBootApplication
@EnableDiscoveryClient
public class UserCenterApplication {
    public static void main(String[] args) {
        SpringApplication.run(UserCenterApplication.class, args);
    }
}
