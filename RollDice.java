public class RollDice {
    public static void main(String[] args) {
        int score1 = rollDice();
        int score2 = rollDice(); 
        System.out.println(score1 + "\n" + score2);
    }
    public static int rollDice(){
        double randomScore = Math.random() * 6;
        randomScore += 1;
        return (int)randomScore;
    }
}
