package com.example.demo.ch15;

import javax.mail.Address;

public class FileRoster implements Roster {
    public FileRoster(String filename) {
    }

    @Override
    public boolean containsOneOf(Address[] from) {
        return false;
    }

    @Override
    public Address[] getAddresses() {
        return new Address[0];
    }
}
