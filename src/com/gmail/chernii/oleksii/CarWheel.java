package com.gmail.chernii.oleksii;

/**
 * Created by Space on 28.02.2019.
 */
public class CarWheel {
    private double state;

    public CarWheel() {
        this.state = Math.random();
    }

    public CarWheel(double state) {
        this.state = state;
    }

    public void replaceWheel() {
        this.state = 1.0;
    }

    public void changeStateOn(double stateDiff) {
        if (stateDiff > 1. && stateDiff < 0.) {
            return;
        }
        this.state = (this.state - stateDiff > 0) ? (this.state - stateDiff) : 0.;
    }

}
