package com.apress.prospring5.ch03.annotation;

import org.springframework.stereotype.Component;

import com.apress.prospring5.ch02.decoupled.MessageProvider;

@Component("provider")
public class HelloWorldMessageProvider implements MessageProvider{

    @Override
    public String getMessage() {
        return "Hello World!";
    }
    
}
