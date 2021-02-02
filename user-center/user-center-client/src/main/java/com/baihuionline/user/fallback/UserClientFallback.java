package com.baihuionline.user.fallback;

import com.baihuionline.user.client.UserClient;

/**
 * Description: {功能简述}
 *
 * @author: baihui
 * @date :2021年02月03日 00时58分
 * Note: 真正的大师，永远怀着一颗学徒的心。
 */
public class UserClientFallback implements UserClient {
    @Override
    public String getById(String id) {
        return "调用失败";
    }
}
