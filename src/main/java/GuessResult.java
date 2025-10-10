public class GuessResult {
    private final boolean correct;
    private final String baseMessage;
    private final int attempts;
    private int remainingAttempts = -1;  // -1 means not applicable
    private String hint = "";             // Empty string means no hint

    public GuessResult(boolean correct, String baseMessage, int attempts) {
        this.correct = correct;
        this.baseMessage = baseMessage;
        this.attempts = attempts;
    }

    public boolean isCorrect() {
        return correct;
    }

    public String getMessage() {
        StringBuilder msg = new StringBuilder(baseMessage);
        if (remainingAttempts >= 0 && !correct) {
            msg.append(" ").append(remainingAttempts).append(" attempts remaining.");
        }
        if (!hint.isEmpty()) {
            msg.append(hint);
        }
        return msg.toString();
    }

    public int getAttempts() {
        return attempts;
    }

    public int getRemainingAttempts() {
        return remainingAttempts;
    }

    public void setRemainingAttempts(int remainingAttempts) {
        this.remainingAttempts = remainingAttempts;
    }

    public String getHint() {
        return hint;
    }

    public void setHint(String hint) {
        this.hint = hint;
    }
}
