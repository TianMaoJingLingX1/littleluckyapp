package com.baihuionline.user.entity.dbo;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

/**
 * Description: {功能简述}
 *
 * @author: baihui
 * @date :2021年02月07日 23时58分
 * Note: 真正的大师，永远怀着一颗学徒的心。
 */
@Data
@TableName("tb_user")
public class User {

    /**
     * PK
     */
    private Long id;

    /**
     * 名字
     */
    private String name;

    /**
     * 年龄
     */
    private Integer age;

    /**
     * 邮箱
     */
    private String email;
}
