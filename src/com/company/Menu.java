package com.company;


// VALIN SHORT

import java.util.Scanner;
import java.util.InputMismatchException;

public class Menu {
    private final Library library;


    // Game game = new Game();


    // Menu to prompt user for Library options
    private Scanner input = new Scanner(System.in);
    protected Scanner title = new Scanner(System.in);
    // private Library library = new Library(this);

    public Menu(Library library) {
        this.library = library;
    }

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
                    System.out.println("you have chosen to add a a game \n what is the title of the game ?");
                    input.nextLine();
                    Game game = new Game(input.nextLine());
                    System.out.println("You chose the game " + game.getTitle() + " to your library , it can be checked out");
                    library.addGame(game);
                    library.startMenu();
                    break;
                case 2:
                    // remove the game
                    System.out.println("you've chosen to remove a game form your library\n here is a list of games type in the number of the game you want to keep1");
                    for (Game game1 : library.getGamelibrary()) {
                        System.out.println(game1.getTitle());
                    }
                    library.removeGame(input.nextInt());

                    break;
                case 3:
                    //view the library
                    System.out.println("here is what is in your game Library");
                    for (Game game1 : library.getGamelibrary()) {
                        System.out.println(game1.getTitle());
                    }
                    library.startMenu();
                    break;
                case 4:
                    // check something out
                    System.out.println("you have chosen to check something out\n Here is a list of games you can check out.");
                    for (Game game1 : library.getGamelibrary()) {

                        System.out.println(game1.getTitle());
                    }
                        library.checkedoutGame(input.nextInt());


                    break;
                case 5:
                    // check in game
                    System.out.println("You want to check in a game  select the number of the game you want to check in.\n here are the list of yur games that you have checked out ");

                    for (Game game2 : library.getGamelibrary()) {
                        System.out.println(game2.getTitle());

                        library.checkInGame(input.nextInt());
                        System.out.println("Thanks for retuuning your game!");
                    }

                    library.startMenu();
                    //library.startMenu();
                    break;
                case 6:
                    // view the checked out games
                    System.out.println("Here is your checked out games");
                    for (Game game2 : library.getGamelibrary()) {
                        System.out.println(game2.getTitle());

                    }
                    library.startMenu();
                    break;
                case 7:
                    // exiting program
                    System.out.println("you have exited the program");
                    System.exit(0);
                    break;
                default:
                    // prompt the user for a correct number and loop back to menu
                    break;
            }
        } catch (InputMismatchException ime) {
            input.nextLine();
            System.out.println("Please select a number that is 1 through 7");
            startMenu(); //calls upon the start Menu method to run again after in the try catch.


        }

    }
}
