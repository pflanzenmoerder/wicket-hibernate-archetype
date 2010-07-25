package ${groupId}.services.impl;

import org.springframework.stereotype.Component;

import ${groupId}.services.HelloWorldService;

@Component
public class HelloWorldServiceImpl implements HelloWorldService{

	public String getHello() {
		return "Hello World";
	}

}
