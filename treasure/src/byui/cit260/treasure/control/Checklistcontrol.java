/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.treasure.control;

import java.util.Random;
import java.util.Scanner;
import byui.cit260.treasure.control.Mathcontrol;

/**
 *
 * @author andrew
 */
public class Checklistcontrol {

    public static Mathcontrol math = new Mathcontrol();
    Random random = new Random();

    public void SetSail() {
        // TODO - implement Checklistcontrol.SetSail
        
        boolean valid = true;
    }

    public void PassWhirlpool() {
        // TODO - implement Checklistcontrol.PassWhirlpool
        
        boolean valid = true;
    }

    public static boolean FixBridge(boolean input) {
        System.out.println("Good Job! Now you need to complete this equation to fix the bridge...");
        if (math.math()){ 
            System.out.println("Congratulations");
            boolean complete = input;
            return true;
            } 
        else {
            System.out.println("You Fail.");
            return false;
            }
    }

    public static boolean OpenChest(boolean input) {
        // TODO - implement Checklistcontrol.OpenChest
        
        boolean complete = input;
        return complete;
    }

    public boolean GetLumber(boolean input) {
        // TODO - implement Checklistcontrol.GetLumber
        throw new UnsupportedOperationException();
    }

    public static boolean BuildBoat(boolean input) {
        boolean complete = input;        
       return complete;        
    }

    public void HelpTurtle() {
        double weight = random.nextInt(50);
        double counter = weight * (1.05);
        if (math.turtle(weight, counter)) {
            System.out.println("congrats");
             } 
            else {
            System.out.println("you fail");
        }
    }

    public static boolean GetBearings(boolean input){
        boolean complete = input;
        return complete;        
        // TODO - implement Checklistcontrol.GetBearings
        }
}