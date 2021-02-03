package com.baihuionline.user.client;

import com.baihuionline.user.api.IUserApi;
import com.baihuionline.user.fallback.UserClientFallback;
import org.springframework.cloud.openfeign.FeignClient;

/**
 * Description: {功能简述}
 *
 * @author: baihui
 * @date :2021年02月03日 00时44分
 * Note: 真正的大师，永远怀着一颗学徒的心。
 */
@FeignClient(value = "user-center-service", fallback = UserClientFallback.class)
public interface UserClient extends IUserApi {
}
