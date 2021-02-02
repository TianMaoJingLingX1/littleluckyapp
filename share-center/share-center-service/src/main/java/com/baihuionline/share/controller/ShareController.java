package com.baihuionline.share.controller;

import com.baihuionline.user.client.UserClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Description: {功能简述}
 *
 * @author: baihui
 * @date :2021年02月03日 01时01分
 * Note: 真正的大师，永远怀着一颗学徒的心。
 */
@RestController
@RequestMapping("/share")
public class ShareController {

    @Autowired
    UserClient userClient;

    @GetMapping("/{id}")
    public String getById(@PathVariable String id) {
        return userClient.getById(id);
    }
}
