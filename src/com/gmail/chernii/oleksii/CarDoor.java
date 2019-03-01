package com.gmail.chernii.oleksii;

/**
 * Created by Space on 28.02.2019.
 */
public class CarDoor {
    private boolean isDoorOpen;
    private boolean isWindowOpen;

    public CarDoor() {
    }

    public CarDoor(boolean doorOpen, boolean windowOpen) {
        this.isDoorOpen = doorOpen;
        this.isWindowOpen = windowOpen;
    }
    public void openDoor() {
        this.isDoorOpen = true;
    }

    public void closeDoor() {
        this.isDoorOpen = false;
    }

    public void openCloseDoor() {
        this.isDoorOpen = (this.isDoorOpen) ? false : true;
    }
    public void openWindow() {
        this.isWindowOpen = true;
    }

    public void closeWindow() {
        this.isWindowOpen = false;
    }

    public void openCloseWindow() {
        this.isWindowOpen = (this.isWindowOpen) ? false : true;
    }

    public void print() {
        System.out.println("== Door - " + ((isDoorOpen) ? "opened" : "closed"));
        System.out.println("== Window - " + ((isWindowOpen) ? "opened" : "closed"));
    }
}
