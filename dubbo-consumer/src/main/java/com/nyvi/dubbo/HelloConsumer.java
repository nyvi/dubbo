package com.nyvi.dubbo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.alibaba.dubbo.config.annotation.Reference;

@RestController
public class HelloConsumer {

	@Reference
	private IHelloService helloService;

	@GetMapping("sayHello")
	public String sayHello() {
		String name = "Dubbo";
		return helloService.sayHello(name);
	}
}
