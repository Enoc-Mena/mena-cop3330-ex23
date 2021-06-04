/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Enoc Mena
 */

package com.troubleshootcars;
import java.util.Scanner;
import java.lang.*;

public class Main {

    public static void main(String[] args) {

        //Variables
        String userChoice;
        String yes = "Yes";
        String no = "No";

        //Menu
        System.out.println("");
        System.out.print("                  ---Welcome to car troubleshooter v1.0---                   ");
        System.out.println("\n");
        System.out.print("We are going to ask you to answer a series of questions in order to help you");
        System.out.println("");
        System.out.print("-----------------------------------------------------------------------------\n");

        //Questions
        Scanner choice = new Scanner(System.in);
        System.out.print("Is the car silent when you turn the key? ");
        userChoice = choice.nextLine();

        if(userChoice.equalsIgnoreCase(yes)) {

            choice = new Scanner(System.in);
            System.out.print("Are the battery terminals corroded? ");
            userChoice = choice.nextLine();

            if(userChoice.equalsIgnoreCase(yes)) {

                System.out.print("Clean terminals and try starting again.");

            }

        }

        if(userChoice.equalsIgnoreCase(no)) {

            choice = new Scanner(System.in);
            System.out.print("Does the car make a sickling sound? ");
            userChoice = choice.nextLine();

            if(userChoice.equalsIgnoreCase(yes)) {

                System.out.print("Replace the battery.");

            }

            if(userChoice.equalsIgnoreCase(no)) {

                choice = new Scanner(System.in);
                System.out.print("Does the car crank up but fail to start? ");
                userChoice = choice.nextLine();

                if(userChoice.equalsIgnoreCase(yes)) {

                    System.out.print("Check spark plug connections.");

                }

                if(userChoice.equalsIgnoreCase(no)) {

                    choice = new Scanner(System.in);
                    System.out.print("Does the engine start and then die? ");
                    userChoice = choice.nextLine();

                    if(userChoice.equalsIgnoreCase(yes)) {

                        choice = new Scanner(System.in);
                        System.out.print("Does your car have fuel injection? ");

                        if(userChoice.equalsIgnoreCase(yes)) {

                            System.out.print("Get it in for service.");

                        }

                        if(userChoice.equalsIgnoreCase(no)) {

                            System.out.print("Check to ensure the choke is opening and closing.");

                        }

                    }

                }


            }

        } //End of questions

        //--------------------------------------------------------------------------------------------------------------

        //Asks if the person solved the problem or not and gives response based on the users input
        //to simulate a real life troubleshooter like the type apple, microsoft etc. use
        String newQuestion;

        System.out.println("");

        Scanner question = new Scanner(System.in);
        System.out.print("Did this help you out today? ");
        newQuestion = question.nextLine();

        if(newQuestion.equalsIgnoreCase(yes)) {

            System.out.print("Have a nice day!");

        } else {

            System.out.println("We recommend you come into our shop in person in order to further troubleshoot.");

        }

    }
}
