package hangman.model;

public class BonusScore implements GameScore {

    /**
    * Starts at 0 points
    * Adds 10 points after correct assertions
    * reduces 5 points after incorrect assertions
    * minimum score is 0
    * @param correctCount number of correct assertions
    * @param incorrectCount number of incorrect assertions
    * @return calculated score 
    **/
    @Override
    public int calculateScore(int correctCount, int incorrectCount) {
        int score = 0;

        score = correctCount * 10;
        score -= incorrectCount * 5;

        if(score < 0) score = 0;

        return score;
    }

}
