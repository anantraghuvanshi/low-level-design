package game;

public class Move {
    private Player player;
    private Cell cell;

    public Move(Cell cell, Player player) {
        this.cell = cell;
        this.player = player;
    }

    public static Cell getCell() {
        return cell;
    }

    public Player getPlayer() {
        return player;
    }
}