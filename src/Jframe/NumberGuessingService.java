package Jframe;

import Jframe.Exception.OutOfRangeException;
import java.util.Random;


public class NumberGuessingService {

    private int minimumVal;
    private int maximumVal;
    private int val;
    private Random random;
    
    public static final int STARTING_MINIMUM_VALUE = 1;
    public static final int STARTING_MAXIMUM_VALUE = 10;

    public NumberGuessingService() {
        this(STARTING_MINIMUM_VALUE, STARTING_MAXIMUM_VALUE);
    }
    
    public NumberGuessingService(int minimumVal, int maximumVal) {
        if (minimumVal < maximumVal) {
            this.minimumVal = minimumVal;
            this.maximumVal = maximumVal;
        }
        this.random = new Random();
        newRandomNumber();
    }

    public int getMinimumVal() {
        return minimumVal;
    }
    
    public final void setMinimumVal(int minimumVal) {
        if (minimumVal > maximumVal) {
            throw new IllegalArgumentException();
        }
        this.minimumVal = minimumVal;
    }
    
    public int getMaximumVal() {
        return maximumVal;
    }

    public final void setMaximumVal(int maximumVal) {
        if (maximumVal < minimumVal) {
            throw new IllegalArgumentException();
        }
        this.maximumVal = maximumVal;
    }
    
    public final void setRange(int minimumVal, int maximumVal) {
        if (minimumVal > maximumVal) {
            throw new IllegalArgumentException();
        }
        this.minimumVal = minimumVal;
        this.maximumVal = maximumVal;
    }
    
    public final void newRandomNumber() {
        val = minimumVal + random.nextInt(maximumVal - minimumVal + 1);
    }
    
    public final int checkGuess(int guess) throws OutOfRangeException {
        if (guess < minimumVal || guess > maximumVal) {
            throw new OutOfRangeException(
                String.format("Guess %d is outside of range [%d, %d].",
                    guess, minimumVal, maximumVal)
            );
        }
        return guess - val;
    }
    
}
