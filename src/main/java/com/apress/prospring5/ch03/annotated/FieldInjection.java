package com.apress.prospring5.ch03.annotated;

import org.springframework.context.support.GenericXmlApplicationContext;

public class FieldInjection {

    public static void main(String... args) {
        GenericXmlApplicationContext ctx = new GenericXmlApplicationContext();
        ctx.load("classpath:spring/app-context-annottated.xml");
        ctx.refresh();
        Singer singerBean = ctx.getBean(Singer.class);
        singerBean.sing();
        ctx.close();
    }
    
}
