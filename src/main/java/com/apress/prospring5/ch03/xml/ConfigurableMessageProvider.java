package com.apress.prospring5.ch03.xml;

import com.apress.prospring5.ch02.decoupled.MessageProvider;

public class ConfigurableMessageProvider implements MessageProvider {

    private String message;

    public ConfigurableMessageProvider(String message) {
        this.message = message;
    }

    @Override
    public String getMessage() {
        return message;
    }

}
