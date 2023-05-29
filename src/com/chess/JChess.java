package com.chess;

import com.chess.engine.board.Board;
import com.chess.gui.Table;

// Checking for commit and push

public class JChess {
    public static void main(String[] args) {
        Board board = Board.createStandardBoard();
        System.out.println(board);

        Table table = new Table();
    }
}

// Commented some lines in the Move Class and BoardUtils class in the board folder
