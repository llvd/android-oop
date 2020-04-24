package com.asgar.oop;

public class Mercedes extends Car implements Engine {
    private final String seatColor;
    private final String roofTop;
    private String bodyColor;

    public Mercedes(String name, int speed, int maxSpeed, int maxFuelTank, int numberOfWheels, boolean hasAdvancedBrakeSystem, String engineType, String seatColor, String roofTop, String bodyColor) {
        super(name, speed, maxSpeed, maxFuelTank, numberOfWheels, hasAdvancedBrakeSystem, engineType);
        this.seatColor = seatColor;
        this.roofTop = roofTop;
        this.bodyColor = bodyColor;
    }

    public String getSeatColor() {
        return seatColor;
    }

    public String getRoofTop() {
        return roofTop;
    }

    public String getBodyColor() {
        return bodyColor;
    }

    public void setBodyColor(String bodyColor) {
        this.bodyColor = bodyColor;
    }

    public String toString() {
        return String.format("%s \n%s %s \n%s %s \n%s %s", super.toString(),
                "Seat Color: ", getSeatColor(),
                "Roof: ", getRoofTop(),
                "Body: ", getBodyColor());
    }

    public String sound() {
        return "VRUUM";
    }

    @Override
    public String goFast() {
        return "GOING FAST";
    }

    @Override
    public String goSlow() {
        return "GOING SLOW";
    }

    @Override
    public String startEngine() {
        return "STARTING";
    }
}
