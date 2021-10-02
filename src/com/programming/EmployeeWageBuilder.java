package com.programming;

public class EmployeeWageBuilder {
    public static final int isPresent = 1;

    public static void main(String[] args) {
        System.out.println("Welcome to employee wage computation");

        int employeeCheck = (int) Math.floor((Math.random() * 10) % 3);
            /*switch case statement is used  for
            checking his presence to duty*/
        switch (employeeCheck) {

            case isPresent:
                System.out.println("Employee is present");;
                break;

            default:
                System.out.println("Employee is absent");;
                break;
        }
    }
}
