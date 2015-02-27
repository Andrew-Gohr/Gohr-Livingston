/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.treasure.view;

import java.util.Scanner;

/**
 *
 * @author andrew
 */
public class GameMenuView {

    void displayMenu() {
        char selection;
        do {
            System.out.println(
                    "\nm = View Map"
                    + "\nb = Open Bag"
                    + "\nc = Checklist"
                    + "\ns = Save Game"
                    + "\nq = Quit");
            String input = this.getInput();
            selection = input.charAt(0);
            this.doAction(selection);
        } while (selection != 'q');
    }

    private String getInput() {
        boolean valid = false; //indicates if the name has been retrieved
        String selection = null;
        Scanner keyboard = new Scanner(System.in); //keyboard input stream

        while (!valid) {//while a valid name has not been retrieved
            //prompt for the player's name
            System.out.println("Enter your selection below;");
            //get the name from the keyboard and trim off the blanks
            selection = keyboard.nextLine();
            selection = selection.trim();
            //if the name is invalid (less thajn two character in length)
            if (selection.isEmpty()) {
                System.out.println("selection cannot be blank");
                continue; // and repeat again
            }
            break; // out of the (exit) the repetition

        }
        return selection; //return the name
    }

    private void doAction(char selection) {
        switch (selection) {
            case 'm':
                System.out.println("display map...");
                break;
            case 'b':
                System.out.println("opening bag..");
                break;
            case 'c':
                System.out.println("viewing checklist...");
                break;
            case 's':
                System.out.println("save game...");
                break;
            case 'q':
                System.out.println("quitting");
                System.exit(0);
                break;
            default:
                System.out.println("\ninvalid selection");
        }
    }

}