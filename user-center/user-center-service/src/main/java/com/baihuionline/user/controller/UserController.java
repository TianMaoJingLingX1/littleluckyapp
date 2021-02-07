package com.baihuionline.user.controller;

import com.baihuionline.user.entity.dbo.User;
import com.baihuionline.user.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

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

    @Autowired
    UserMapper userMapper;

    @GetMapping("/{id}")
    public String getById(@PathVariable String id) {
        User user = userMapper.selectById(id);
        List<User> users = userMapper.selectList(null);
        if (user != null) {
            System.out.println(user);
        }
        return id;
    }
}
