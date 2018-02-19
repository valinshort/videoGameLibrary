package com.company;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

public class Library {
private Menu menu;
   // public final Menu menu;
    private List<Game> gamelibrary = new ArrayList<Game>();
    private List<Game> checkedOutGames = new ArrayList<Game>();
    private SimpleDateFormat dateFormat = new SimpleDateFormat("MM/dd/yy/mm");
    private List<Game> checkInGame = new ArrayList<Game>();






    public Library() {
        //this.menu = menu;
        menu = new Menu(this);
    }







    protected void addGame(Game game) {
        gamelibrary.add(game);



        // code goes here to add game to where ever we are saving game things too.
    }

    public List<Game> getGamelibrary() {
        return gamelibrary;

    }

    protected void removeGame(int gameIndex) {
        gameIndex -= gameIndex;
        gamelibrary.remove(gameIndex);
        System.out.println("This game has been removed from your library");
        menu.startMenu();


    }

    protected void checkedoutGame(int gameIndex) {
        System.out.println(gamelibrary);
        gameIndex -= gameIndex;
        Game game = gamelibrary.get(gameIndex);

        checkedOutGames.add(game);
        Calendar calendar = Calendar.getInstance();
        System.out.println("youve checked this game out");
        calendar.add(Calendar.DAY_OF_YEAR, 7);
        System.out.println(" it is due back on" + dateFormat.format(calendar.getTime()));
        game.setDueDate(dateFormat.format(calendar.getTime()));


        menu.startMenu();

    }

    protected void checkInGame(int gameIndex){

        gameIndex -= gameIndex;
        gamelibrary.remove(gameIndex);
        Game game = gamelibrary.get(gameIndex);



    }


    public void startMenu() {
        menu.startMenu();
    }
}
