package org.example.dubbo.consumer;

import org.example.dubbo.api.HelloService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Consumer {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("spring/dubbo-consumer.xml");
        context.start();

        HelloService helloService = (HelloService) context.getBean("helloService");
        String message = helloService.sayHello("World");
        System.out.println(message);
    }
}
