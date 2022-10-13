package com.example.demo.ch21;

import org.apache.commons.codec.binary.Hex;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;

import static org.junit.jupiter.api.Assertions.*;

class AddEmployeeCmdTest {

    @Test
    void write() throws Exception {
        AddEmployeeCmd cmd = new AddEmployeeCmd("name","address","city","state", 40000);

        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();

        cmd.write(outputStream);

        assertEquals("dead24026e616d650061646472657373006369747900737461746500343030303000beef",
                Hex.encodeHexString( outputStream.toByteArray() ) );
    }

}