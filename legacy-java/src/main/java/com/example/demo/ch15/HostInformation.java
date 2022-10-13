package com.example.demo.ch15;

public class HostInformation {

    final String pop3Host;
    final String pop3User;
    final String pop3Password;
    final String smtpHost;
    final String smtpUser;
    final String smtpPassword;

    public HostInformation(String pop3Host, String smtpHost, String pop3User, String pop3Password, String smtpUser, String smtpPassword) {
        this.pop3Host = pop3Host;
        this.pop3User = pop3User;
        this.pop3Password = pop3Password;

        this.smtpHost = smtpHost;
        this.smtpUser = smtpUser;
        this.smtpPassword = smtpPassword;
    }
}
