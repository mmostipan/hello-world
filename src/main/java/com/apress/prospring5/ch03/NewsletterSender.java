package com.apress.prospring5.ch03;

public interface NewsletterSender {
    void setSmtpServer(String smtpServer);

    String getSmtpServer();

    void setFromAddress(String fromAddress);

    String getFromAddress();

    void send();
}
