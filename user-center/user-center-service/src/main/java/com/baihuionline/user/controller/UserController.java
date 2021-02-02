package com.baihuionline.user.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Description: {用户中心基础api}
 *
 * @author: baihui
 * @date :2021年02月03日 00时22分
 * Note: 真正的大师，永远怀着一颗学徒的心。
 */
@RestController
@RequestMapping("/user")
public class UserController {

    @GetMapping("/{id}")
    public String getById(@PathVariable String id) {
        return id;
    }
}
