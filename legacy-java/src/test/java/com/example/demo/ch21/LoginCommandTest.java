package com.example.demo.ch21;

import org.apache.commons.codec.binary.Hex;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;

import static org.junit.jupiter.api.Assertions.*;

class LoginCommandTest {

    @Test
    void write() throws Exception {
        LoginCommand cmd = new LoginCommand("name","address");

        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();

        cmd.write(outputStream);

        assertEquals("dead13016e616d65006164647265737300beef",
                Hex.encodeHexString( outputStream.toByteArray() ) );
    }
}