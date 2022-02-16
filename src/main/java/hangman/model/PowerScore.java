package hangman.model;

public class PowerScore implements GameScore {

    /**
    * Starts at 0
    * i letter is bonified by 5^i
    * incorrect assertions reduce score in 8 points
    * minimum score is 0
    * if previus rules exeeds 500 points, score is 500
    * @param correctCount number of correct assertions
    * @param incorrectCount number of incorrect assertions
    * @return calculated score 
    **/
    @Override
    public int calculateScore(int correctCount, int incorrectCount) {
        int score = 0;

        for(int i = 1; i <= correctCount; i++)
            score += Math.pow(5, i);
        
        score -= incorrectCount * 8;

        if(score > 500) score = 500;
        else if(score < 0) score = 0;

        return score;
    }

}
