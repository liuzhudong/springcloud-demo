/**
 * Copyright (c) 深圳市小牛科技有限公司-版权所有
 */
package com.jelly.liu.spring.demo.service.test.user;

import com.jelly.liu.spring.demo.service.test.user.impl.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author liuzhudong
 * @description class description
 * <pre>
 *  TODO
 * </pre>
 * @date 2016/7/7 16:12
 * @copyright www.xiaoniuapp.com Inc. All rights reserved.
 */
@RestController
public class UserController {

    @Autowired
    private UserService userService;


    @RequestMapping("/user")
    public String test() {
        return "调用其他服务测试消息输出:" + userService.getTestMsg();
    }



}
