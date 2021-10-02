package com.programming;

public class EmployeeWageBuilder {
    public static final int isFullTime = 1;
    public static final int isPartTime = 2;
    static final int wagePerHour = 20;

    public static void main(String[] args) {
        System.out.println("Welcome to employee wage computation");

        int employeeCheck = (int) Math.floor((Math.random() * 10) % 3);
            /*switch case statement is used  for
            checking his presence to duty*/
        int workingHrs = 0;
        switch (employeeCheck) {

            case isFullTime:

                workingHrs = 8;
                break;

            case isPartTime:
                workingHrs = 4;
                break;

            default:
                System.out.println("Employee is absent");
                workingHrs = 0;
                break;
        }
        int wage = (wagePerHour * workingHrs);
        System.out.println("The employee has worked for " + workingHrs + " hrs ,and earned " + wage);
    }
}
