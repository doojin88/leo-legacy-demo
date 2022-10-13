package com.example.demo.ch08;

import java.util.ArrayList;
import java.util.List;

public class InstrumentCalculator {
    private List<Double> elements = new ArrayList<>();

    public InstrumentCalculator() {
    }

    public void addElement(double element) {
        this.elements.add(element);
    }

    public double firstMomentAbout(double point) throws InvalidBasisException {

        if (this.elements.size() == 0) {
            throw new InvalidBasisException("no elements");
        }

        double numerator = 0.0;

        for(Double element : elements) {
            numerator += element.doubleValue() - point;
        }

        return numerator / elements.size();
    }
}
