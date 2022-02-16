package hangman;

import org.junit.Assert;
import org.junit.Test;
import hangman.model.*;

/**
* Class: GameScoreTest
* Generates the test methods of the classes:
* OriginalScore
* BonusScore
* PowerScore
**/
public class GameScoreTest {
    
    @Test
    public void validateOriginalScoreT1() {
        OriginalScore score = new OriginalScore();

        //Intermediate random case
        Assert.assertEquals(score.calculateScore(10, 5), 50);

    }

    @Test
    public void validateOriginalScoreT2() {
        OriginalScore score = new OriginalScore();

        //More than 10 incorrect assertions
        Assert.assertEquals(score.calculateScore(10, 20), 0);

    }

    @Test
    public void validateOriginalScoreT3() {
        OriginalScore score = new OriginalScore();

        //No incorrect assertions
        Assert.assertEquals(score.calculateScore(7, 0), 100);

    }

    @Test
    public void validateOriginalScoreT4() {
        OriginalScore score = new OriginalScore();

        //Correct assertion independency
        Assert.assertEquals(score.calculateScore(7, 4), score.calculateScore(-24, 4));

    }

    @Test
    public void validateBonusScoreT1() {
        BonusScore score = new BonusScore();

        //Random intermediate case
        Assert.assertEquals(score.calculateScore(10, 5), 75);

    }

    @Test
    public void validateBonusScoreT2() {
        BonusScore score = new BonusScore();

        //Too much incorrect assertions
        Assert.assertEquals(score.calculateScore(1, 120), 0);

    }

    @Test
    public void validateBonusScoreT3() {
        BonusScore score = new BonusScore();

        //No incorrect assertions
        Assert.assertEquals(score.calculateScore(4, 0), 40);

    }

    @Test
    public void validatePowerScoreT1() {
        PowerScore score = new PowerScore();

        //Random intermediate case
        Assert.assertEquals(score.calculateScore(3, 4), 123);

    }

    @Test
    public void validatePowerScoreT2() {
        PowerScore score = new PowerScore();

        //Much Incorrect
        Assert.assertEquals(score.calculateScore(1, 6), 0);

    }

    @Test
    public void validatePowerScoreT3() {
        PowerScore score = new PowerScore();

        //Much Correct
        Assert.assertEquals(score.calculateScore(5, 1), 500);

    }

}