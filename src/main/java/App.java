/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Nicholas Pohlmann
 */

import java.util.Scanner;

public class App {
    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        App myApp = new App();

        String silentCar = myApp.readInput("Is the car silent when you turn the key? ");
        String solution = myApp.solveProblem(silentCar);
        myApp.printSolution(solution);
    }

    private void printSolution(String solution) {
        System.out.println(solution);
    }

    private String solveProblem(String silentCar) {
        if (silentCar.equalsIgnoreCase("yes")) {
            String answer1 = readInput("Are the battery terminals corroded? ");
            if (answer1.equalsIgnoreCase("yes")) {
                return "Clean terminals and try starting agian.";
            } else {
                return "Replace cables and try again.";
            }
        } else {
            String answer2 = readInput("Does the car make a slicking noise?");
            if (answer2.equalsIgnoreCase("yes")) {
                return "Replace the battery";
            } else {
                String answer3 = readInput("Does the engine start and then die? ");
                if (answer3.equalsIgnoreCase("yes")) {
                    String answer4 = readInput("Does your car have fuel injection? ");
                    if (answer4.equalsIgnoreCase("Yes")) {
                        return "Get it in for service";
                    } else {
                        return "Check to ensure the choke is opening and closing.";
                    }
                } else {
                    return "This should not be possible";
                }
            }
        }
    }

    private String readInput(String str) {
        System.out.print(str);
        String input = in.nextLine();
        return input;
    }
}