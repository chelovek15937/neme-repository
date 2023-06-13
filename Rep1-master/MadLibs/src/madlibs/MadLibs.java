package madlibs;
//aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa
//aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa
//aaaaaaaaaaaaaaaaaaaaaaaaaaa
import java.util.Scanner;

public class MadLibs {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String playAgain = "";
        int numberOfTries = 0;
        do {
            int theText = (int) (Math.random() * 3 + 1);
            //System.out.println(theText);
            if (theText == 1) {
                String theWord1 = "";
                String theWord2 = "";
                String theWord3 = "";
                System.out.println("Write name");
                theWord1 = (String) scan.next();
                System.out.println("Write item");
                theWord2 = (String) scan.next();
                System.out.println("Write place");
                theWord3 = (String) scan.next();
                System.out.println(theWord1 + " dropped " + theWord2 + " " + theWord3);
                numberOfTries++;
                System.out.println("Would you like to play again (y/n)?");
                playAgain = scan.next();
            }
            if (theText == 2) {
                String theWord1 = "";
                String theWord2 = "";
                String theWord3 = "";
                System.out.println("Write item");
                theWord1 = (String) scan.next();
                System.out.println("Write item");
                theWord2 = (String) scan.next();
                System.out.println("Write name");
                theWord3 = (String) scan.next();
                System.out.println(theWord1 + " сlosed " + theWord2 + " " + theWord3);
                numberOfTries++;
                System.out.println("Would you like to play again (y/n)?");
                playAgain = scan.next();
            }
            if (theText == 3) {
                String theWord1 = "";
                String theWord2 = "";
                String theWord3 = "";
                System.out.println("Write name");
                theWord1 = (String) scan.next();
                System.out.println("Write item");
                theWord2 = (String) scan.next();
                System.out.println("Write place");
                theWord3 = (String) scan.next();
                System.out.println(theWord1 + " hold " + theWord2 + " in " + theWord3);
                numberOfTries++;
                System.out.println("Would you like to play again (y/n)?");
                playAgain = scan.next();
            }
        } while (playAgain.equalsIgnoreCase("y"));
        System.out.println("Thank you for playing! Your tries: " + numberOfTries + " Goodbye.");
    }//1213
}