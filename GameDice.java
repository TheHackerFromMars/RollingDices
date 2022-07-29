import java.util.Scanner;

public class GameDice {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter two numbers between 1 and 6: ");
        int choice1 = scan.nextInt();
        int choice2 = scan.nextInt();
        int sumChoice = choice1 + choice2;
        int score1 = rollDice();
        int score2 = rollDice(); 
        int sumScore = score1 + score2;

        System.out.println("Dice: " + score1 + ", " + score2 + "\nUser: " + choice1 + ", " + choice2);
        /**
         * This game will take two inputs from user.
         * And then it will roll two dices.
         * If sum of user's inputs stays between the range of sum of the outcomes of rolling dices'
         * two higher or two lower values.
         * User wins
         * or else User loses.
         */

        if (sumChoice > sumScore + 2 || sumChoice < sumScore - 2)
        System.out.println("You Lose!!");
        else
        System.out.println("Congratulation!! You WON");
        scan.close();
    }
    public static int rollDice(){
        double randomScore = Math.random() * 6;
        randomScore += 1;
        return (int)randomScore;
    }
}