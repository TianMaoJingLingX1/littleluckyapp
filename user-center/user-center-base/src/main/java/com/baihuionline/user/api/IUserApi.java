package com.baihuionline.user.api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Description: {功能简述}
 *
 * @author: baihui
 * @date :2021年02月03日 00时40分
 * Note: 真正的大师，永远怀着一颗学徒的心。
 */
@RequestMapping("/user")
public interface IUserApi {

    @GetMapping("/{id}")
    String getById(@PathVariable String id);
}
