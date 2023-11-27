package org.lessons.java.train;

import org.lessons.java.Calculator;

public class Ticket extends Calculator {

    private static final double PRICE_PER_KM = 0.21;

    private double distance;
    private int age;

    public Ticket(double distance, int age) throws Exception {
        // Validazione degli input
        if (distance <= 0 || age < 0) {
            throw new Exception ("La distanza e l'età devono essere numeri positivi.");
        }

        setDistance(distance);
        setAge(age);
    }

    public double getDistance() {
        return distance;
    }

    public void setDistance(double distance) {
        this.distance = distance;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double calculateFinalPrice() {
        double basicPrice = multiply((float) distance, (float) PRICE_PER_KM);
        double finalPrice = basicPrice;

        if (age < 18) {
            finalPrice -= basicPrice * 0.20;
        }

        else if (age > 65) {
            finalPrice -= basicPrice * 0.40;
        }

        return finalPrice;
    }
}
