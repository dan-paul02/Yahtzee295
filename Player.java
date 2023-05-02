//import Dice.java;
//import Sheet.java;
import java.util.ArrayList;
import java.util.Scanner;
public class Player {
    //Player needs to have access to the dice and sheet.
    //

    Dice playerDice;
    int currentRollResult1, currentRollResult2, currentRollResult3,
        currentRollResult4, currentRollResult5 = 0;
    //Change this into an array with a size of 5 and make sure to add the numbers to the specific spots corresponding to the dice.
    //Array setAsideDice;
    //Sheet playerSheet;

    public Player(){
        playerDice = new Dice();
        //setAsideDice = new Array<Integer>();
        //playerSheet = new Sheet();
    }

     public void playerRollDice(){
         currentRollResult1 = playerDice.rollDice();
         currentRollResult2 = playerDice.rollDice();
         currentRollResult3 = playerDice.rollDice();
         currentRollResult4 = playerDice.rollDice();
         currentRollResult5 = playerDice.rollDice();
         System.out.println(currentRollResult1);
         System.out.println(currentRollResult2);
         System.out.println(currentRollResult3);
         System.out.println(currentRollResult4);
         System.out.println(currentRollResult5);
     }

    public void addDiceToSheet(Sheet playerSheet){
        Scanner choice = new Scanner(System.in);
        boolean finished = false;
        System.out.println("Please choose a dice to add to your sheet.");
        System.out.println("Press any number from 1-5 to choose a die or 0 if you don't want to pick any.");
        System.out.println("If you want to revert a choice you made, type the same number to remove the dice from the sheet.");
        int dieNumberChoice = choice.nextInt();
        while(finished == false){
            if(dieNumberChoice == 0){
                finished = true;
                break;
            }
            else if(dieNumberChoice == 1){
                if(currentRollResult1 == 0){
                    playerSheet.removeFromSheet(currentRollResult1);

                    
                }
                else{
                    playerSheet.addToSheet(currentRollResult1);
                    //setAsideDice.add(currentRollResult1);
                    currentRollResult1 = 0;
                    System.out.println("You have added " + currentRollResult1 + " to your sheet.");
                }

            }
            else if(dieNumberChoice == 2){
                playerSheet.addToSheet(currentRollResult2);
                //setAsideDice.add(currentRollResult2);
                currentRollResult2 = 0;
                System.out.println("You have added " + currentRollResult2 + " to your sheet.");
            }
            else if(dieNumberChoice == 3){
                playerSheet.addToSheet(currentRollResult3);
                //setAsideDice.add(currentRollResult3);
                currentRollResult3 = 0;
                System.out.println("You have added " + currentRollResult3 + " to your sheet.");
            }
            else if(dieNumberChoice == 4){
                playerSheet.addToSheet(currentRollResult4);
                //setAsideDice.add(currentRollResult4);
                currentRollResult4 = 0;
                System.out.println("You have added " + currentRollResult4 + " to your sheet.");
            }   
            else if(dieNumberChoice == 5){
                if(currentRollResult5 == 0){
                    System.out.println("You");
                }
                playerSheet.addToSheet(currentRollResult5);
                //setAsideDice.add(currentRollResult5);
                currentRollResult5 = 0;
                System.out.println("You have added " + currentRollResult5 + " to your sheet.");
            }
            else{
                System.out.println("Please pick a valid number from 0-5!");
            }
            System.out.println("If you are finished enter 0.");
            dieNumberChoice = choice.nextInt();
        }
    }
}
