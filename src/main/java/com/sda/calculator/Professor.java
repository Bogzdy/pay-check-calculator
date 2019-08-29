package com.sda.calculator;

public class Professor extends Entity {
    private double salary;

    public Professor(String city, double salary) {
        super(city);
        if (salary > 0 ){
            this.salary = salary;
        } else {
            throw new InvalidDataExeption();
        }
    }

    @Override
    public double amountReceived() {
        return this.salary;
    }

}
