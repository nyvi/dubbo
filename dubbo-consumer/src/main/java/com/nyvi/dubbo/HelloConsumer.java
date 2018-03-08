package com.nyvi.dubbo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.alibaba.dubbo.config.annotation.Reference;

@RestController
public class HelloConsumer {

	@Reference
	private IHelloService helloService;

	@GetMapping("sayHello/{name}")
	public String sayHello(@PathVariable("name") String name) {
		return helloService.sayHello(name);
	}
}
