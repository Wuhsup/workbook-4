package com.pluralsight.hotel;

public class Employee {
    private int employedID;
    private String name;
    private String department;
    private double payRate;
    private double hoursWorked;
    private double overtimeWorked;

    public Employee(int employedID, String name, String department, double payRate, double hoursWorked) {
        this.employedID = employedID;
        this.name = name;
        this.department = department;
        this.payRate = payRate;
        this.hoursWorked = hoursWorked;
        this.overtimeWorked = overtimeWorked;
    }

    public double getNormalHours() {
        return Math.min(hoursWorked, 40);
    }

    public double getOvertimeHours() {
        return Math.max(0, -40);
    }

    public double getTotalPay() {
        return payRate * hoursWorked;
    }
}



