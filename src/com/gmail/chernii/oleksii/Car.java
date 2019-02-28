package com.gmail.chernii.oleksii;


import java.time.LocalDate;

/**
 * Created by Space on 28.02.2019.
 */
public class Car {
    private final LocalDate produceDate;
    private String engineType;
    private int maxSpeed;
    private double accelerationTime;
    private int passengerCapacity;
    private int passengers;
    private int speed;
    private CarWheel[] carWheels;
    private CarDoor[] carDoors;

    public Car() {
        this.produceDate = null;
    }

    public Car(LocalDate produceDate) {
        this.produceDate = produceDate;
    }

    public Car(LocalDate produceDate, String engineType, int maxSpeed, double accelerationTime, int passengerCapacity, int passengers, int speed) {
        this.produceDate = produceDate;
        this.engineType = engineType;
        this.maxSpeed = maxSpeed;
        this.accelerationTime = accelerationTime;
        this.passengerCapacity = passengerCapacity;
        this.passengers = passengers;
        this.speed = speed;
        this.carWheels = new CarWheel[4];
        this.carDoors = new CarDoor[4];
        for (int i = 0; i < 4; i++) {
            this.carDoors[i] = new CarDoor();
            this.carWheels[i] = new CarWheel();
        }

    }

    public void changeSpeed(int speed) {
        this.speed = speed;
    }

    public void putPassanger() {
        if (this.passengerCapacity < this.passengers) {
            return;
        }
        this.passengers++;
    }
}
