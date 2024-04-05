/*
    The JChess class creates a standard chess board and displays it using a graphical user interface.
*/

package com.chess;
import com.chess.engine.board.Board;
import com.chess.gui.Table;

// Checking for commit and push

public class JChess {
    public static void main(String[] args) {
        Board board = Board.createStandardBoard();
        System.out.println(board);
        Table.get().show();
    }
}