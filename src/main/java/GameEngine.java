public class GameEngine {
    private static final int MAX_ATTEMPTS = 10;

    private final int min;
    private final int max;
    private int target;
    private int attempts;
    private boolean gameWon;
<<<<<<< HEAD
    private boolean userQuit;
=======
    private boolean gameOver;
>>>>>>> 45aa640 (Add maxAttempts constant and game over state)

    public GameEngine(int min, int max) {
        this.min = min;
        this.max = max;
        this.attempts = 0;
        this.gameWon = false;
<<<<<<< HEAD
        this.userQuit = false;
=======
        this.gameOver = false;
>>>>>>> 45aa640 (Add maxAttempts constant and game over state)
        reset();
    }

    public GuessResult makeGuess(int guess) {
        // Check if user wants to quit (negative number)
        if (guess < 0) {
            userQuit = true;
            return new GuessResult(false, "Exiting game...", attempts);
        }

        attempts++;

        if (guess == target) {
            gameWon = true;
            return new GuessResult(true, "Correct! You guessed it in " + attempts + " attempts.", attempts);
        } else if (guess < target) {
            return new GuessResult(false, "Too low! Try a higher number.", attempts);
        } else {
            return new GuessResult(false, "Too high! Try a lower number.", attempts);
        }
    }

    public void reset() {
        target = Utils.randomInt(min, max);
        attempts = 0;
        gameWon = false;
<<<<<<< HEAD
        userQuit = false;
=======
        gameOver = false;
>>>>>>> 45aa640 (Add maxAttempts constant and game over state)
    }

    public boolean isGameWon() {
        return gameWon;
    }

<<<<<<< HEAD
    public boolean hasUserQuit() {
        return userQuit;
=======
    public boolean isGameOver() {
        return gameOver;
>>>>>>> 45aa640 (Add maxAttempts constant and game over state)
    }

    public int getAttempts() {
        return attempts;
    }

    public int getMaxAttempts() {
        return MAX_ATTEMPTS;
    }

    public int getMin() {
        return min;
    }

    public int getMax() {
        return max;
    }

    // For testing purposes only
    protected void setTarget(int target) {
        this.target = target;
    }

    protected int getTarget() {
        return target;
    }
}
