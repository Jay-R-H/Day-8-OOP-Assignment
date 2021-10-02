package com.programming;

public class EmployeeWageBuilder {
    public static final int isFullTime = 1;
    public static final int isPartTime = 2;
    static final int wagePerHour = 20;
    static final int totalWorkingDays = 20;
    static final int totalWorkingHours = 100;


    public static void main(String[] args) {
        System.out.println("Welcome to employee wage computation");
        employeeWageCompute();
    }

    public static void employeeWageCompute() {

        int workingHrs = 0;
        int workingDays = 0;
        int totalWage = 0;
        /*switch case statement is used  for
        checking his presence to duty*/
        while (totalWorkingDays > workingDays && totalWorkingHours > workingHrs) {

            int employeeCheck = (int) Math.floor((Math.random() * 10) % 3);

            switch (employeeCheck) {

                case isFullTime:
                    workingHrs = 8;
                    System.out.println("The employee has worked for " + workingHrs + " hrs");
                    break;

                case isPartTime:
                    workingHrs = 4;
                    System.out.println("The employee has worked for " + workingHrs + " hrs");
                    break;

                default:
                    System.out.println("Employee is absent");
                    workingHrs = 0;
                    break;
            }
            workingDays++;
            workingHrs += workingHrs;
            int wage = (wagePerHour * workingHrs);
            totalWage += wage;
        }
        System.out.println("The employee has worked for " + totalWorkingHours + " hrs ,and earned " + totalWage + "$");
    }
}



