package com.baihuionline.share;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * Description: {功能简述}
 *
 * @author: baihui
 * @date :2021年02月03日 01时04分
 * Note: 真正的大师，永远怀着一颗学徒的心。
 */
@SpringBootApplication
@EnableFeignClients(basePackages = {"com.baihuionline.*.client"})
@EnableDiscoveryClient
public class ShareCenterApplication {

    public static void main(String[] args) {
        SpringApplication.run(ShareCenterApplication.class, args);
    }
}
