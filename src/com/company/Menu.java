package com.company;

import java.util.Scanner;
import java.util.InputMismatchException;

public class Menu {

    // Menu to prompt user for Library options
    private Scanner input = new Scanner(System.in);
    public void startMenu() {



        System.out.println(" Welcome to the game library what would you like to do ?  \n" +
                "1.Add a game\n" +
                "2.Remove a game\n" +
                "3.View what is currently in the library\n" +
                "4.Check a game out\n" +
                "5.Check a game in\n" +
                "6.View checked out games\n" +
                "7.Exit the program");

        try {
            switch (input.nextInt()) {
                case 1:
                    // add a gmae
                    break;
                case 2:
                    // remove the game
                    break;
                case 3:
                    //view the library
                    break;
                case 4:
                    // check something out
                    break;
                case 5:
                    // check in game
                    break;
                case 6:
                    // view the checked out games
                    break;
                case 7:
                    // exiting program
                    break;
                default:
                    // prompt the user for a correct numbeer and loop back to menu
                    break;
            }
        } catch (InputMismatchException ime){
            input.nextLine();
            System.out.println("Please select a number that is 1 through 7");
            startMenu(); //calls upon the start Menu method to run again after in the try catch.
        }


    }

}
