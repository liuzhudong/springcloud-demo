/**
 * Copyright (c) 深圳市小牛科技有限公司-版权所有
 */
package com.jelly.liu.spring.demo.eureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @author liuzhudong
 * @description class description
 * <pre>
 *  TODO
 * </pre>
 * @date 2016/7/7 15:35
 * @copyright www.xiaoniuapp.com Inc. All rights reserved.
 */

@SpringBootApplication
@EnableEurekaServer
public class EurekaServer {

    public static void main(String[] args) {
        SpringApplication.run(EurekaServer.class, args);
    }

}
