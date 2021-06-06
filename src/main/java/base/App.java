/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Dillon Flaschner
 */

package base;

import java.util.Scanner;

public class App {
    Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        App myApp = new App();

        String monthNumString = myApp.inputNum();

        int monthNum = Integer.parseInt(monthNumString);
        int monthCheck = myApp.checkIfMonth(monthNum);
        if (monthCheck == 1) {
            System.out.print("Terminating program.");
            return;
        }

        String monthName = myApp.checkMonth(monthNum);
        String output = myApp.buildOutput(monthName);

        myApp.printOutput(output);
    }

    public String inputNum() {
        System.out.print("Please enter the number of the month: ");
        return input.nextLine();
    }

    public int checkIfMonth(int monthNum) {
        if (monthNum > 12 || monthNum < 1) {
            System.out.print("Error: " + monthNum + " is not a valid input. Input value must be between 1 and 12.\n");
            return 1;
        }

        return 0;
    }

    public String checkMonth(int monthNum) {
        switch (monthNum) {
            case 1:
                return "January";

            case 2:
                return "February";

            case 3:
                return "March";

            case 4:
                return "April";

            case 5:
                return "May";

            case 6:
                return "June";

            case 7:
                return "July";

            case 8:
                return "August";

            case 9:
                return "September";

            case 10:
                return "October";

            case 11:
                return "November";

            case 12:
                return "December";
        }
        return "ERROR: How did you even cause this to return?";
    }

    public String buildOutput(String monthName) {
        return "The name of the month is " + monthName;
    }

    public void printOutput(String output) {
        System.out.print(output);
    }
}