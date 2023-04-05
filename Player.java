//import Dice.java;
//import Sheet.java;
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

    // public void playerRollDice(){
    //     currentRollResult1 = playerDice.rollDice();
    //     currentRollResult2 = playerDice.rollDice();
    //     currentRollResult3 = playerDice.rollDice();
    //     currentRollResult4 = playerDice.rollDice();
    //     currentRollResult5 = playerDice.rollDice();
    //     System.out.println(currentRollResult1);
    //     System.out.println(currentRollResult2);
    //     System.out.println(currentRollResult3);
    //     System.out.println(currentRollResult4);
    //     System.out.println(currentRollResult5);
    // }

    public void addDiceToSheet(Dice diceToSheet){
        playerSheet.addToSheet(diceToSheet);
    }
}
