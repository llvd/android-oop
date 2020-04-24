package com.asgar.oop;

import androidx.annotation.NonNull;

public class Motorcycle extends Vehicle {
    private final int totalSeats;

    public Motorcycle(String name, int speed, int maxSpeed, int maxFuelTank, int numberOfWheels, boolean hasAdvancedBrakeSystem, int totalSeats) {
        super(name, speed, maxSpeed, maxFuelTank, numberOfWheels, hasAdvancedBrakeSystem);
        this.totalSeats = totalSeats;
    }

    public int getTotalSeats() {
        return totalSeats;
    }

    @NonNull
    @Override
    public String toString() {
        return String.format("%s \n%s %s", super.toString(), "Total Seats: ", getTotalSeats());
    }

    public String sound() {
        return "b";
    }
}
