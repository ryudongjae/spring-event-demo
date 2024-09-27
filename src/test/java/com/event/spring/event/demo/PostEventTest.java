package com.event.spring.event.demo;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationEventPublisher;

@SpringBootTest
public class PostEventTest {

    @Autowired
    ApplicationEventPublisher applicationEventPublisher;
    @Test
    void ListenerTest(){
        Post post = new Post("이벤트다 이벤트");
        PostPublishEvent postPublishEvent = new PostPublishEvent(post);
        applicationEventPublisher.publishEvent(postPublishEvent);
    }
}
