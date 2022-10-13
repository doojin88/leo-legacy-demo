package com.example.demo.ch15;

import javax.mail.Address;

public interface Roster {
    boolean containsOneOf(Address[] from);

    Address[] getAddresses();
}
