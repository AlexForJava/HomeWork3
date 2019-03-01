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
        this.produceDate = LocalDate.of(1992, 5, 31);
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

    public void dropPassanger() {
        if (this.passengers > 0) {
            this.passengers--;
        }
    }

    public void dropAllPassangers() {
        this.passengers = 0;
        this.speed = 0;
    }

    public CarDoor getDoor(int index) {
        if (index < 0 && index > this.carDoors.length - 1) {
            return null;
        }
        return carDoors[index];
    }

    public CarWheel getWheel(int index) {
        if (index < 0 && index > this.carWheels.length - 1) {
            return null;
        }
        return carWheels[index];
    }

    public CarWheel[] dropWheels() {
        CarWheel[] temp = this.carWheels;
        this.carWheels = null;
        return temp;
    }

    public void setWheels(int wheelAmount) {
        CarWheel[] temp = new CarWheel[this.carWheels.length + wheelAmount];
        for (int i = 0; i < temp.length; i++) {
            if (i < this.carWheels.length) {
                temp[i] = this.carWheels[i];
            } else {
                temp[i] = new CarWheel(1.0);
            }
        }
        this.carWheels = temp;
    }

    public double maxPossibleSpeed() {
        if (this.passengers == 0 || this.produceDate == null) {
            return 0;
        }
        return this.maxSpeed * maxErasedWheel();
    }

    private double maxErasedWheel() {
        double temp = carWheels[0].getState();
        for (int i = 0; i < this.carWheels.length; i++) {
            temp = (temp < this.carWheels[i].getState()) ? temp : this.carWheels[i].getState();
        }
        return temp;
    }

    public void print() {
        System.out.println("Produce date = " + this.produceDate);
        System.out.println("Engine type = " + this.engineType);
        System.out.println("Max speed = " + this.maxSpeed);
        System.out.println("Acceleration time = " + this.accelerationTime);
        System.out.println("Passenger capacity = " + this.passengerCapacity);
        System.out.println("There're " + passengers + " in the car");
        System.out.println("Car speed = " + this.speed);
        for (CarWheel carWheel : this.carWheels) {
            carWheel.print();
        }
        for (CarDoor carDoor : this.carDoors) {
            carDoor.print();
        }
        System.out.println("Max possible car speed " + maxPossibleSpeed());
    }
}
