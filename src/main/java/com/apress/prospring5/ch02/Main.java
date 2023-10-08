package com.apress.prospring5.ch02;

import com.apress.prospring5.ch02.decoupled.HelloWorldMessageProvider;
import com.apress.prospring5.ch02.decoupled.MessageProvider;
import com.apress.prospring5.ch02.decoupled.MessageRenderer;
import com.apress.prospring5.ch02.decoupled.MessageSupportFactory;
import com.apress.prospring5.ch02.decoupled.StandardOutMessageRenderer;

public class Main {
    public static void main(String[] args) {
       /* MessageRenderer mr = new StandardOutMessageRenderer();
        MessageProvider mp = new HelloWorldMessageProvider();
        mr.setMessageProvider(mp);
        mr.render();
        */
        
       MessageRenderer mr = MessageSupportFactory.getInstance().getMessageRenderer();
       MessageProvider mp = MessageSupportFactory.getInstance().getMessageProvider();
       mr.setMessageProvider(mp);
       mr.render();
    }
}