package com.programming;

public class EmployeeWageBuilder {
    public static final int isPresent = 1;
    static final int wagePerHour = 20;
    static final int fullDayHour = 8;

    public static void main(String[] args) {
        System.out.println("Welcome to employee wage computation");

        int employeeCheck = (int) Math.floor((Math.random() * 10) % 2);
            /*switch case statement is used  for
            checking his presence to duty*/
        switch (employeeCheck) {

            case isPresent:
                System.out.println("Employee is present");
                int wage = (wagePerHour * fullDayHour);
                System.out.println("Employee has earned " + wage );
                break;

            default:
                System.out.println("Employee is absent");
                break;
        }
    }
}
