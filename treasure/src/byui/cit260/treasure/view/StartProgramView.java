/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.treasure.view;
import byui.cit260.treasure.view.View;
import byui.cit260.treasure.control.GameControl;
import byui.cit260.treasure.model.Player;
import java.io.IOException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Braden
 */
public class StartProgramView extends View{

    public static String Introduction = ("\n Welcome to the game Find the Treasure! \n \n"
            + "\n You have received 50 gold pieces and an old treasure map from your uncle \n"
            + "\n who recently passed away. You see that the map says to start on the beach \n"
            + "\n near the town where he lived. You are to start at the beach then collect items and \n"
            + "\n perform tasks to cross the ocean and get to the island where the treasure is! \n");

    
    //MapView map = new MapView();
    
//MapView map = new MapView();
    public StartProgramView() {
        
        super(Introduction);

    }
    @Override
    //public void doAction(Object obj){
        
    public void display() {
//Display the banner screen
        this.displayBanner();
        

//Get the players name
        String playersName = null;
        try {
            playersName = this.getPlayersName();
        } catch (IOException ex) {
            Logger.getLogger(StartProgramView.class.getName()).log(Level.SEVERE, null, ex);
        }

        //Create and save the player object
        Player player = GameControl.createPlayer(playersName);
//DISPLAY a customized welcome message
         
        this.displayWelcomeMessage(player);
//DISPLAY the main menu
        MainMenuView mainMenu = new MainMenuView();
        mainMenu.display();
        
    }

    public void displayBanner() {
        this.console.println("*******************************************************************"
                + "\n*                                                                 *"
                + "\n*                  Welcome to find the treasure                   *"
                + "\n*                        ___                                      *"
                + "\n*               _       /   |           \\ /                       *"
                + "\n*                \\     /    |     _______X                        *"
                + "\n*                 \\___/     |    /      / \\                       *"
                + "\n*                            \\__/                                 *"
                + "\n*                                                                 *"
                + "\n*                            HAVE FUN!!                           *"
                + "\n*******************************************************************");
this.console.print(Introduction);
    }

    public String getPlayersName() throws IOException {
        boolean valid = false; //indicates if the name has been retrieved
        String playersName = null;
        //playersName = this.keyboard.readLine();
        //(System.in); //keyboard input stream

        while (!valid) {//while a valid name has not been retrieved
            //prompt for the player's name
            
             this.console.println(" \n ENTER THE PLAYER'S NAME BELOW: \n");
             
            //get the name from the keyboard and trim off the blanks
             
            playersName = this.keyboard.readLine();
            playersName = playersName.trim();

            //if the name is invalid (less than two character in length)
            if (playersName.length() < 2) {
                //System.out.println("invalid name - the name must not be blank");
                 ErrorView.display(this.getClass().getName(), "\n invalid name - the name must not be blank");
                continue; // and repeat again
            }
            break; // out of the (exit) the repetition

        }
        return playersName; //return the name
    }

    private void displayWelcomeMessage(Player player) {
         this.console.println("\n \tWelcome to the game " + player.getName() + "! \n");
    }

//    @Override
//    public void doAction(Object obj) {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
//    }

    @Override
    public void doAction(Object obj) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }


}
