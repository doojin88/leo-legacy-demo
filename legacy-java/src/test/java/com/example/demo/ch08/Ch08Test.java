package com.example.demo.ch08;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

public class Ch08Test {

    private static final double TOLERANCE = 0.1;

    @Test
    void testFirstMoment() {
        InstrumentCalculator calculator = new InstrumentCalculator();
        calculator.addElement(1.0);
        calculator.addElement(2.0);

        assertEquals(-0.5, calculator.firstMomentAbout(2.0), TOLERANCE);
    }

    @Test
    void testFirstMomentWhenSize_zero() {
        try {
            new InstrumentCalculator().firstMomentAbout(0.0);
            fail("expected InvalidBasisException");
        }
        catch (InvalidBasisException e) {

        }
    }
}
