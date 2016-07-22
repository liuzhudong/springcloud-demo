/**
 * Copyright (c) 深圳市小牛科技有限公司-版权所有
 */
package com.jelly.liu.spring.demo.service.test.user.impl;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

/**
 * @author liuzhudong
 * @description class description
 * <pre>
 *  TODO
 * </pre>
 * @date 2016/7/7 16:14
 * @copyright www.xiaoniuapp.com Inc. All rights reserved.
 */
@Service
public class UserService {

    @Autowired
    RestTemplate restTemplate;

    final String SERVICE_NAME = "config-client";

    @HystrixCommand(fallbackMethod = "fallbackSearchAll")
    public String getTestMsg() {
        return restTemplate.getForObject("http://" + SERVICE_NAME + "/test", String.class);
    }

    public String fallbackSearchAll() {
        return "获取其他服务消息失败:输出本地消息";
    }

}
