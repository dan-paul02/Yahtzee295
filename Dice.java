import java.util.Random;
public class Dice {
    private int sides = 6;
    private Random randInt;
    private int diceNumberResult;
    public Dice(){
         randInt = new Random();
    }

    public int rollDice(){
        diceNumberResult = randInt.nextInt(sides - 1 + 1) + 1;
        //System.out.println(diceNumberResult);
        return diceNumberResult;
    }

}