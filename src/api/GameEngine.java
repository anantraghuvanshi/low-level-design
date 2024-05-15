package api;

import boards.TicTacToeBoard;
import game.Board;
import game.GameResult;
import game.Move;
import game.Player;

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
}
