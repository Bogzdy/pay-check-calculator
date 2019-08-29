package com.sda.calculator;

public abstract class Entity {
    protected String city;

    public Entity(String city) {
        if (city != null && city != " ") {
            this.city = city;
        } else {
            throw new InvalidDataExeption("Null or empty string");
        }
    }

    public String getCity() {
        return city;
    }

    public abstract double amountReceived();

    @Override
    public String toString() {
        return "Entity{" +
                "city='" + city + '\'' +
                amountReceived() +
                '}';
    }
}
