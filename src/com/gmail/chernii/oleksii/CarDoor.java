package com.gmail.chernii.oleksii;

/**
 * Created by Space on 28.02.2019.
 */
public class CarDoor {
    private boolean doorOpen;
    private boolean windowOpen;

    public CarDoor() {
        this.doorOpen = false;
        this.doorOpen = false;
    }

    public CarDoor(boolean doorOpen, boolean windowOpen) {
        this.doorOpen = doorOpen;
        this.windowOpen = windowOpen;
    }
    public void openDoor() {
        this.doorOpen = true;
    }

    public void closeDoor() {
        this.doorOpen = false;
    }

    public void openCloseDoor() {
        this.doorOpen = (this.doorOpen) ? false : true;
    }
}
