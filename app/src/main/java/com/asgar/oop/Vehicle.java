package com.asgar.oop;

import androidx.annotation.NonNull;

public class Vehicle {
    private String name;
    private int speed;
    private final int maxSpeed;
    private final int maxFuelTank;
    private int numberOfWheels;
    private final boolean hasAdvancedBrakeSystem;

    public Vehicle(String name, int speed, int maxSpeed, int maxFuelTank, int numberOfWheels, boolean hasAdvancedBrakeSystem) {
        this.name = name;
        this.speed = speed;
        this.maxSpeed = maxSpeed;
        this.maxFuelTank = maxFuelTank;
        this.numberOfWheels = numberOfWheels;
        this.hasAdvancedBrakeSystem = hasAdvancedBrakeSystem;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public int getMaxFuelTank() {
        return maxFuelTank;
    }

    public int getNumberOfWheels() {
        return numberOfWheels;
    }

    public void setNumberOfWheels(int numberOfWheels) {
        this.numberOfWheels = numberOfWheels;
    }

    public boolean isHasAdvancedBrakeSystem() {
        return hasAdvancedBrakeSystem;
    }

    @NonNull
    @Override
    public String toString() {
        return String.format("%s %s \n%s %s \n %s %s \n%s %s \\n%s %s \\n %s %s",
                "Name: ", getName(),
                "Speed", getSpeed(),
                "Max Speed", getMaxSpeed(),
                "Fuel Tank", getMaxFuelTank(),
                "Total Wheels", getNumberOfWheels(),
                "ABS", isHasAdvancedBrakeSystem());
    }

    public String sound() {
        return "Brrrr brrrr";
    }
}
