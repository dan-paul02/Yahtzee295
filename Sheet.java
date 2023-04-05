//import Dice.java;
import java.util.ArrayList;
public class Sheet {
    
    ArrayList<Integer> dice;

    public Sheet(){
        dice = new ArrayList<Integer>();
    }

    public void addToSheet(int diceToSheet){
        dice.add(diceToSheet);
    }

    public void printSheet(){
        for(int i = 0; i<dice.size(); i++){
            //System.out.println(dice[i]);
        }
    }

}
