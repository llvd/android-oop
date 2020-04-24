package com.asgar.oop;

import androidx.annotation.NonNull;

public class Car extends Vehicle {
    private String engineType;

    public Car(String name, int speed, int maxSpeed, int maxFuelTank, int numberOfWheels, boolean hasAdvancedBrakeSystem, String engineType) {
        super(name, speed, maxSpeed, maxFuelTank, numberOfWheels, hasAdvancedBrakeSystem);
        this.engineType = engineType;
    }

    public String getEngineType() {
        return engineType;
    }

    public void setEngineType(String engineType) {
        this.engineType = engineType;
    }

    @NonNull
    @Override
    public String toString() {
        return String.format("%s \n%s %s", super.toString(), "Engine Type: ", getEngineType());
    }

    public String sound() {
        return "vroom";
    }
}
