package com.rabbitlistener.rabbitlistenerdemo;

import org.springframework.amqp.core.Queue;
import org.springframework.amqp.core.QueueBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class RabbitMqQueueConfiguration {

    @Bean
    Queue exampleQueue() {
        return new Queue("exampleQueue", true);
    }

    @Bean
    Queue example2ndQueue(){
        return QueueBuilder.durable("example2ndQueue")
                .autoDelete()
                .exclusive()
                .build();
    }
}
