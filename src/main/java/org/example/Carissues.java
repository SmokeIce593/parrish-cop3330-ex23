/*
 *  UCF COP3330 Fall 2021 Assignment 23 Solution
 *  Copyright 2021 Cameron Parrish
 */

package org.example;
import java.util.Scanner;


public class Carissues {
    public static void main(String[] args) {
        Carissues App = new Carissues();


        System.out.print("Is the car silent when you turn the key? ");
        String currentanswer = input();



        if (currentanswer.equals("y")) {
            System.out.print("Are the battery terminals corroded?");
            currentanswer = input();
            if (currentanswer.equals("y")){
                System.out.print("Clean terminals and try starting again.");
            }

            else if (currentanswer.equals("n")){
                System.out.print("Replace cables and try again.");
            }
        }
        else if (currentanswer.equals("n")){
            System.out.print("Does the car make a slicking noise?");
            currentanswer = input();

            if (currentanswer.equals("y")){
                System.out.print("Replace the battery.");
            }
            else if (currentanswer.equals("n")) {
                System.out.print("Does the car crank up but fail to start?");
                currentanswer = input();

                if (currentanswer.equals("y")) {
                    System.out.print("Check spark plug connections.");

                } else if (currentanswer.equals("n")) {
                    System.out.print("Does the engine start and then die?");
                    currentanswer = input();

                    if (currentanswer.equals("y")) {
                        System.out.print("Does your car have fuel injection?");
                        currentanswer = input();
                        if (currentanswer.equals("y")) {
                            System.out.print("Get it in for service.");
                        } else if (currentanswer.equals("n")) {
                            System.out.print("Check to ensure the choke is opening and closing.");
                        }

                    } else if (currentanswer.equals("n")) {
                        System.out.print("This should not be possible.");
                    }

                }
            }
            }
        }

    private static String input() {
        Scanner input = new Scanner(System.in);
        String answer = input.nextLine();
        answer = answer.toLowerCase();

        return answer;
    }
}


