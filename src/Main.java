public class Main {
    public static void main(String[] args) {
          Player p1 = new Player("Satvik", Symbol.X);
         Player p2 = new Player("Aditya", Symbol.O);
        Game game = new Game(p1, p2);
         game.start();
    }
}
/***
 * INPUT and SAMPLE OUTPUT
 * - - -
 * - - -
 * - - -
 * Satvik's turn. Enter row and column (0-2):
 * 0 3
 * Invalid move. Try again.
 * - - -
 * - - -
 * - - -
 * Satvik's turn. Enter row and column (0-2):
 * 0 0
 * X - -
 * - - -
 * - - -
 * Aditya's turn. Enter row and column (0-2):
 * 1 0
 * X - -
 * O - -
 * - - -
 * Satvik's turn. Enter row and column (0-2):
 * 0 2
 * X - X
 * O - -
 * - - -
 * Aditya's turn. Enter row and column (0-2):
 * 1 2
 * X - X
 * O - O
 * - - -
 * Satvik's turn. Enter row and column (0-2):
 * 0 1
 * X X X
 * O - O
 * - - -
 * Satvik wins!
 */