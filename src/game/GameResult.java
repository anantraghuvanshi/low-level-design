package game;

public class GameResult {
    boolean isOVer;
    String winner;

    public GameResult(boolean isOVer, String winner) {
        this.isOVer = isOVer;
        this.winner = winner;
    }

    public boolean isOVer() {
        return isOVer;
    }

    public String getWinner() {
        return winner;
    }
}
