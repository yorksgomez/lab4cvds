package hangman.model;

public class OriginalScore implements GameScore {

    /**
    * Basic calculation, is not bonified by correct assertiosn,
    * incorrect assertions reduces scores
    * minimum score is 0
    * @param correctCount number of correct assertions
    * @param incorrectCount number of incorrect assertions
    * @return calculated score 
    **/
    @Override
    public int calculateScore(int correctCount, int incorrectCount) {
        int score = 100;

        score -= incorrectCount * 10;

        if(score < 0) score = 0;

        return score;
    }

}
