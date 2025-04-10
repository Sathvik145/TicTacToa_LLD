import java.util.Scanner;

public class Game {
      Player player1, player2;
      Board board;
      Player currentPlayer;

    public Game(Player p1, Player p2) {
        this.player1 = p1;
        this.player2 = p2;
        this.board = new Board();
        this.currentPlayer = p1;
    }

    public void start() {
        Scanner sc = new Scanner(System.in);
        while (true) {
            board.printBoard();
            System.out.println(currentPlayer.getName() + "'s turn. Enter row and column (0-2): ");
            int row = sc.nextInt();
            int col = sc.nextInt();

            if (!board.makeMove(row, col, currentPlayer.getSymbol())) {
                System.out.println("Invalid move. Try again.");
                continue;
            }

            if (board.checkWin(currentPlayer.getSymbol())) {
                board.printBoard();
                System.out.println(currentPlayer.getName() + " wins!");
                break;
            }

            if (board.isFull()) {
                board.printBoard();
                System.out.println("It's a draw!");
                break;
            }

            currentPlayer = (currentPlayer == player1) ? player2 : player1;
        }
        sc.close();
    }
}
