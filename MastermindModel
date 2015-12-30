/*
- Written by Chelsea Callan
- Due on 6/28/15
- Program Description: Mastermind game
 */
public class MastermindModel {
    public static String correctAnswer;
    
    public static String getAnswer(){
        return correctAnswer;
    }
    public void setAnswer(){
        correctAnswer = "";
    
        //Generates the correct answer in the form of a string of four colors
        while(correctAnswer.length() < 4){
            char color;
            //generates a random number from 1 - 6
            int randomNumber = (int)(Math.random() * 6 + 1);
            switch(randomNumber){
                case 1: color = 'r';
                        break;
                case 2: color = 'o';
                        break;
                case 3: color = 'y';
                        break;
                case 4: color = 'g';
                        break;
                case 5: color = 'b';
                        break;
                case 6: color = 'p';
                        break;
                default: color = 'x';
                        break;
            }
            correctAnswer += color;
            
            }
    }
    
}
