//import Dice.java;
//import Sheet.java;
import java.util.Scanner;
public class Player {
    //Player needs to have access to the dice and sheet.
    //

    Dice playerDice;
    int currentRollResult1, currentRollResult2, currentRollResult3,
        currentRollResult4, currentRollResult5 = 0;
    Sheet playerSheet;

    public Player(){
        playerDice = new Dice();
        playerSheet = new Sheet();
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

    public void addDiceToSheet(){
        Scanner choice = new Scanner(System.in);
        boolean finished = false;
        System.out.println("Please choose a dice to add to your sheet.");
        System.out.println("Press any number from 1-5 to choose a die or 0 if you don't want to pick any.");
        int dieNumberChoice = choice.nextInt();
        while(finished == false){
            if(dieNumberChoice == 0){
                finished = true;
                break;
            }
            else if(dieNumberChoice == 1){
                playerSheet.addToSheet(currentRollResult1);
                System.out.println("You have added " + currentRollResult1 + " to your sheet.");
            }
            else if(dieNumberChoice == 2){
                playerSheet.addToSheet(currentRollResult2);
                System.out.println();
            }
            else if(dieNumberChoice == 3){
                playerSheet.addToSheet(currentRollResult3);
                System.out.println();
            }
            else if(dieNumberChoice == 4){
                playerSheet.addToSheet(currentRollResult4);
                System.out.println();
            }   
            else if(dieNumberChoice == 5){
                playerSheet.addToSheet(currentRollResult5);
                System.out.println();
            }
            else{
                System.out.println("Please pick a valid number from 0-5!");
            }
            System.out.println("If you are finished enter 0.");
            dieNumberChoice = choice.nextInt();
        }
    }
}
