package com.pluralsight.hotel;

public class Reservation {
    private String roomType;
    private int numOfNights;
    private boolean weekend;

    public Reservation(String roomType, int numOfNights, boolean weeknd) {
        this.roomType = roomType;
        this.numOfNights = numOfNights;
        this.weekend = weekend;
    }

    public void setRoomType(String roomType) {
        this.roomType = roomType;
    }

    public double getPrice() {
        double price = 0.0;

        if (roomType.equalsIgnoreCase("Queen")) {
            return weekend ? 115.00 * 2.20 : 115.00;

        } else if (roomType.equalsIgnoreCase("King")) {
            return weekend ? 150.00 * 2.20 : 150.00;
        }

        return price;
    }

    public int getNumOfNights() {
        return numOfNights;
    }

    public void setNumOfNights(int numOfNights) {
        this.numOfNights = numOfNights;
    }

    public boolean weekend() {
        this.weekend = weekend;
        return weekend;
    }

    public double getReservationAmount() {
        return getPrice() * getNumOfNights();
    }
}



