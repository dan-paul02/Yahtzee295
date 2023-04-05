//import Dice.java;
import java.util.ArrayList;
public class Sheet {
    
    ArrayList<Dice> dice;

    public Sheet(){
        dice = new ArrayList<Dice>();
    }

    public void addToSheet(Dice diceToSheet){
        dice.add(diceToSheet);
    }

    public void printSheet(){
        for(int i = 0; i<dice.size(); i++){
            //System.out.println(dice[i]);
        }
    }

}
