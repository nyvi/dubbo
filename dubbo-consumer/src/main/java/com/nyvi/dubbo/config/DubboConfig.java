package com.nyvi.dubbo.config;

import com.nyvi.dubbo.HelloService;
import org.apache.dubbo.config.annotation.Reference;
import org.springframework.context.annotation.Configuration;

/**
 * @author czk
 * @date 2019-08-25
 */
@Configuration
public class DubboConfig {

    @Reference
    private HelloService helloService;
}
