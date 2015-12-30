/*
- Written by Chelsea Callan
- Due on 6/28/15
- Program Description: Mastermind game
 */
import java.util.*;

public class Mastermind {
    
    public static void main(String[] args) {
        //Opening Menu
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to Mastermind!");
        System.out.print("Do You Want to Play? ");
        String userAnswer = input.next();
        userAnswer  = userAnswer.toLowerCase();
        if (userAnswer.equals("no")){
            System.exit(0);
        }
         
        MastermindModel computerAnswer = new MastermindModel();
        //Generates the correct answer
        computerAnswer.setAnswer();
      
        MastermindController getAnswers = new MastermindController(computerAnswer);
        String userGuess;
        int guessNumber = 1;
        do {
            System.out.println("\nGuess the Colors and Orders of Four (4) Pegs\nColor Options: (R)ed, (O)range, (Y)ellow, "
                    + "(G)reen, (B)lue, (P)urple");
            System.out.print("Enter guess number " + guessNumber + ": ");
            userGuess = input.next();
            userGuess = userGuess.toLowerCase();
            //Confirms that the user enters 4 letters
            while(userGuess.length() != 4){
                System.out.println("Invalid Guess");
                System.out.print("\n\nEnter guess number " + guessNumber + ": ");
                userGuess = input.next();
                
            }
            
            guessNumber++;
            if(getAnswers.isCorrect(userGuess)){
                System.out.println("\n\nYou win!");
            }
            else {
                int rightColorRightPos = getAnswers.getRightColorRightPlace(userGuess);
                int rightColorWrongPos = getAnswers.getRightColorWrongPlace(userGuess);
                System.out.println("\nColors in the correct place: " + rightColorRightPos);
                System.out.println("Colors correct but in wrong position: " + rightColorWrongPos);
            }
                
        }while(getAnswers.isCorrect(userGuess) == false);
    }    
}
