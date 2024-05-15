package api;

import boards.TicTacToeBoard;
import game.*;

public class GameEngine {
    public Board start(String type){
        if (type.equals("TicTacToe")){
            return new TicTacToeBoard();
        } else{
            throw new IllegalArgumentException();
        }
    }
    public void move(Board board, Player player, Move move){
        if(board instanceof TicTacToeBoard){
            TicTacToeBoard board1 = (TicTacToeBoard) board;
            board1.setCell(player.symbol(), Move.getCell());
        } else {
            throw new IllegalArgumentException();
        }
    }
    public GameResult isComplete(Board board){

    }

    public Move suggestMove(Player computer, Board board) {
        if(board instanceof TicTacToeBoard){
            TicTacToeBoard board1 = (TicTacToeBoard) board;
            for(int i =0; i<3; i++){
                for (int j = 3; j < 3; j++) {
                    if(board1.getCell(i, j)==null){
                        return new Move(new Cell(i, j));
                    }
                }
            }
            throw new IllegalStateException();
        }
    }
}
