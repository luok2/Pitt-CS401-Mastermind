/*
- Written by Chelsea Callan
- Written on on 6/28/15
- Program Description: Mastermind game controller: Determines how many colors are correct and in the correct position
 */

public class MastermindController {
    private MastermindModel computerAnswer;
    
    public  MastermindController(MastermindModel model){
            computerAnswer = model;
    }
    public boolean isCorrect(String guess){
        String correctAnswer = computerAnswer.getAnswer();
        int counter = 0;
        for( int i = 0; i < 4; i++){
            if (guess.charAt(i) == correctAnswer.charAt(i)){
                counter++;
            }
        }
        if (counter == 4) {
            return true;
        }
        else {
            return false;
        }
    }
    public int getRightColorRightPlace(String guess){
        int counter = 0;
        String correctAnswer = computerAnswer.getAnswer();
        for (int i = 0; i < 4; i++) {
            if (guess.charAt(i) == correctAnswer.charAt(i)){
                counter++;
            }
        }
        return counter;
    }
    public int getRightColorWrongPlace(String guess){
        int counter = 0;
        String correctAnswer = computerAnswer.getAnswer();
        //creates a 2D array to compare the guess to the actual
        char[][] colorsArray;
        colorsArray = new char[4][2];
        
        for (int i = 0; i < 4; i++){
            //Stops it from counting when it is correct color correct place
            if (guess.charAt(i) == correctAnswer.charAt(i)) {
                colorsArray[i][0] = 'x';
                colorsArray[i][1] = 'z';
            }
            else {
                colorsArray[i][0] = correctAnswer.charAt(i);
                colorsArray[i][1] = guess.charAt(i);
            }
        }
        
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                if (colorsArray[j][1] == colorsArray[i][0]) {
                    counter++;
                    break;
                }
            }
        }
        
        return counter;
    }
}
