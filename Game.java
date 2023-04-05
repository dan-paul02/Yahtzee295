public class Game {
    public static void main(String[] args){
        int currentRollResult1, currentRollResult2, currentRollResult3,
        currentRollResult4, currentRollResult5 = 0;
        Dice playerDice = new Dice();
        Player player1 = new Player();
       
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

        player1.addDiceToSheet();
        
        
    }
}
