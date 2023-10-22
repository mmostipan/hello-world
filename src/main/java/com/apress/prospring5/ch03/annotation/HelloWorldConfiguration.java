package com.apress.prospring5.ch03.annotation;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@ComponentScan(basePackages = {"com.apress.prospring5.ch03.annotation"})
@Configuration
public class HelloWorldConfiguration {
    
}
