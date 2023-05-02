public class Game {
    public static void main(String[] args){
        Player player1 = new Player();
       Sheet player1Sheet = new Sheet();
        player1.playerRollDice();
        player1.addDiceToSheet(player1Sheet);
        player1Sheet.printSheet();
    }
}
