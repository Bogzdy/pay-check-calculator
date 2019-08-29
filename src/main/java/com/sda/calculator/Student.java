package com.sda.calculator;

import java.util.Objects;

public class Student extends Entity {
    private double scholarShip;

    public Student(String city, double scholarShip) {
        super(city);
        if (scholarShip > 0) {
            this.scholarShip = scholarShip;
        } else {
            throw new InvalidDataExeption("Negative number exception");
        }
    }

    @Override
    public double amountReceived() {
        return this.scholarShip;
    }

}
