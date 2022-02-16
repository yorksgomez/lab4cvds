package hangman.model;

public interface GameScore {

    /**
    * generally calculates the game score
    * @param correctCount number of correct assertions
    * @param incorrectCount number of incorrect assertions
    * @return calculated score 
    **/
    public int calculateScore(int correctCount, int incorrectCount);

}
