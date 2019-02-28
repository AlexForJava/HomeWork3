package com.gmail.chernii.oleksii;

import java.time.LocalDate;

/**
 * Created by Space on 28.02.2019.
 */
public class Main {
    public static void main(String[] args) {
        Car car = new Car(LocalDate.now(), "diesel", 150, 7.8, 4, 2, 100);
        car.print();
    }
}
