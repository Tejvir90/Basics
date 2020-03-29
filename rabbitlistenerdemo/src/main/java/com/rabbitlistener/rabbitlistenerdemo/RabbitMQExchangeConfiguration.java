package com.rabbitlistener.rabbitlistenerdemo;

import org.springframework.amqp.core.Exchange;
import org.springframework.amqp.core.ExchangeBuilder;
import org.springframework.amqp.core.TopicExchange;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class RabbitMQExchangeConfiguration {

    @Bean
    Exchange exampleExchange() {
        TopicExchange topicExchange = new TopicExchange("ExampleExchange");
        return topicExchange;
    }

    @Bean
    Exchange exampl2ndExchange() {
        return ExchangeBuilder.directExchange("Example2ndExchange")
                .autoDelete()
                .internal()
                .build();
    }

    @Bean
    Exchange newTopicExchange(){
        return ExchangeBuilder.topicExchange("TopicTestExchange")
                .durable(true)
                .internal()
                .autoDelete()
                .build();
    }

    @Bean
    Exchange fanoutExchange(){
        return ExchangeBuilder.fanoutExchange("FanoutTestExchange")
                .durable(true)
                .internal()
                .autoDelete()
                .build();
    }

    @Bean
    Exchange headersExchange(){
         return ExchangeBuilder.headersExchange("HeadersTestExchange")
                .durable(false)
                .internal()
                .ignoreDeclarationExceptions()
                .build();

    }

}
