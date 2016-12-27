package com.spring.kafka.example.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.spring.kafka.example.services")
public class SpringRootConfig {
}
