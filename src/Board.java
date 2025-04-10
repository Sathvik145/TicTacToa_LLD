public class Board {
    private final int size = 3;
    private Cell[][] board;

    public Board() {
        board = new Cell[size][size];
        for (int i = 0; i < size; i++)
                for (int j = 0; j < size; j++)
                    board[i][j] = new Cell(i, j);
    }

    public boolean makeMove(int row, int col, Symbol symbol) {
        if(row <size && col< size && row >= 0 && col >= 0) {
            if (board[row][col].getSymbol() == Symbol.EMPTY) {
                    board[row][col].setSymbol(symbol);
                return true;
            }

        }
        return false;
    }

    public boolean checkWin(Symbol symbol) {
        // row, column, diagonals
        for (int i = 0; i < size; i++) {
            if (board[i][0].getSymbol() == symbol &&
                    board[i][1].getSymbol() == symbol &&
                    board[i][2].getSymbol() == symbol) return true;
        }
        for (int j = 0; j < size; j++) {
            if (board[0][j].getSymbol() == symbol &&
                    board[1][j].getSymbol() == symbol &&
                    board[2][j].getSymbol() == symbol) return true;
        }
        if (board[0][0].getSymbol() == symbol &&
                board[1][1].getSymbol() == symbol &&
                board[2][2].getSymbol() == symbol) return true;

        if (board[0][2].getSymbol() == symbol &&
                board[1][1].getSymbol() == symbol &&
                board[2][0].getSymbol() == symbol) return true;

        return false;
    }

    public boolean isFull() {
        for (int i = 0; i < size; i++)
            for (int j = 0; j < size; j++)
                if (board[i][j].getSymbol() == Symbol.EMPTY)
                    return false;
        return true;
    }

    public void printBoard() {
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                Symbol s = board[i][j].getSymbol();
                System.out.print(s == Symbol.EMPTY ? "-" : s);
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}
