package org.example.dubbo.provider.impl;

import org.example.dubbo.api.HelloService;

public class HelloServiceImpl implements HelloService {

    @Override
    public String sayHello(String name) {
        return "Hello " + name;
    }
}
