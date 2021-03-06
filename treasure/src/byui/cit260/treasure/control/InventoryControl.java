/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.treasure.control;

import byui.cit260.treasure.model.Game;
import byui.cit260.treasure.model.InventoryItem;
import byui.cit260.treasure.view.ErrorView;
import byui.cit260.treasure.view.View;
import treasure.Treasure;

/**
 *
 * @author andrew
 */
public class InventoryControl {
    
    private Game game;
    private InventoryItem[] inventory;
    private View console;
    
    public InventoryControl() {
        inventory = Treasure.getCurrentGame().getInventoryItem();
    }
    //GetInput getinput = new GetInput();
    
    public void dropItem(String selection) {
        
        
        
//        switch (selection) {
//            case "l":
//                inventory[0].setAmount(inventory[0].getAmount() - 1);
//                break;
//            case "s":
//                inventory[1].setAmount(inventory[1].getAmount() - 1);
//                break;
//            default:
//                System.out.println("\ninvalid selection");
//            
//        }
    }
    
    public void addItem(String selection) {
        switch (selection) {
            case "l":
                inventory[0].setAmount(inventory[0].getAmount() + 1);
                break;
            case "s":
                inventory[1].setAmount(inventory[1].getAmount() + 1);
                break;
            default:
                System.out.println("\ninvalid selection");
                ErrorView.display(this.getClass().getName(), "\nInvalid Selection");
                
            
        }
        
    }
    int colCount = 3;
   // int rowCount = i;
    
    public void displayInventory() {

//
        //
        for (int i = 0; i <= colCount; i++) {//print header line

            displayColDiv();
            if (i == 0) {
                System.out.print("item name ");
            } else if (i == 1) {
                System.out.print("item quantity");
            } else if (i == 2) {
                System.out.print("required amount");
            }
        }
        
        for (int i = 0; !(inventory.length == i); i++) {//loop through rows

            displayRowDiv();
            for (int j = 1; j <= colCount; j++) {//loop through columns
                displayColDiv();
                if (j == 1) {
                    String buff = inventory[i].getDescription().toString();
                    while ((buff.length() < 10)) {
                        buff += " ";
                    }
                    
                    System.out.print(buff);
                } else if (j == 2) {
                    System.out.print("      " + inventory[i].getAmount() + "      ");
                } else if (j == 3) {
                    System.out.print("       " + inventory[i].getRequiredAmount() + "       ");
                }
            }
            displayColDiv();
            
        }
        displayRowDiv();
        System.out.print("\n\n");
    }
    
    private void displayRowDiv() {
        String string = ("\n  ");
        for (int i = 1; i <= colCount; i++) {
            string = string.concat("------------------");
        }
        System.out.println(string + "");
    }
    
    private void displayColDiv() {
        
        System.out.print("  |  ");
        
    }

    public int getLength() {
        return(inventory.length);
    }
    
}
