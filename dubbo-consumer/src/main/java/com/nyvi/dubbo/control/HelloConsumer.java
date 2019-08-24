package com.nyvi.dubbo.control;

import com.nyvi.dubbo.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * 服务消费者
 *
 * @author czk
 */
@RestController
public class HelloConsumer {

    private final HelloService helloService;

    @Autowired
    public HelloConsumer(HelloService helloService) {
        this.helloService = helloService;
    }

    @GetMapping("sayHello/{name}")
    public String sayHello(@PathVariable("name") String name) {
        return helloService.sayHello(name);
    }
}
