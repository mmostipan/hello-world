package com.apress.prospring5.ch03;

import org.springframework.context.support.GenericXmlApplicationContext;

import com.apress.prospring5.ch02.decoupled.MessageProvider;
import com.apress.prospring5.ch02.decoupled.MessageRenderer;

public class DeclareSpringComponents {

    public static void main(String[] args) {
        GenericXmlApplicationContext ctx = new GenericXmlApplicationContext();
        ctx.load("classpath:spring/app-context-annotation.xml");
        ctx.refresh();

        // MessageRenderer messageRenderer = ctx.getBean("renderer", MessageRenderer.class);
        // messageRenderer.render();
        // ctx.close();

        MessageProvider messageProvider = ctx.getBean("provider", MessageProvider.class);
        System.out.println(messageProvider.getMessage());
    }
    
}
 