package com.hellokoding.springboot;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.amqp.rabbit.core.RabbitTemplate;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.rabbitmq.client.ConnectionFactory;
import com.rabbitmq.client.Connection;
import com.rabbitmq.client.Channel;

import java.lang.Math;

@Controller
@RequestMapping("/")
public class IndexController {

    private static final Logger LOGGER = LoggerFactory.getLogger(IndexController.class);
    private final static String QUEUE_NAME = "hello";
    
    @Autowired
    private RabbitTemplate rabbitTemplate;

    @GetMapping
    public String index(Model model){
      LOGGER.info("inside index()");
      send();
      return "index";
    }

    public void send () {
      LOGGER.info("inside send()");
      rabbitTemplate.convertAndSend(WebApplication.topicExchangeName, "foo.bar.baz", "Hello from RabbitMQ!"+ Math.random());
      LOGGER.info("exiting send()");
    }
}
