package com.event.spring.event.demo;

import org.springframework.context.ApplicationEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

@Component
public class PostListener {

    @EventListener
    public void onApplicationEvent(PostPublishEvent event) {
        System.out.println("------------------------");
        System.out.println("이벤트 발행 ");
        System.out.println(event.getPost().getContent());
        System.out.println("------------------------");
    }
}
