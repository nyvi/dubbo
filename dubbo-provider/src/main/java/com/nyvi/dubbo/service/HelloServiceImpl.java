package com.nyvi.dubbo.service;

import com.nyvi.dubbo.HelloService;
import org.apache.dubbo.config.annotation.Service;

/**
 * 服务生产者
 *
 * @author czk
 */
@Service
public class HelloServiceImpl implements HelloService {

    @Override
    public String sayHello(String name) {
        return "Hello " + name + " !";
    }

    @Override
    public String sayGoodBye(String name) {
        return "GoodBye " + name + " !";
    }

}
