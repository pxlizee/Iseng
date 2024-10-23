package Java.Iseng.src;

import java.util.Scanner;

public class Tictactoe {

    private char[][] board;
    private char currentPlayer;

    public  Tictactoe() {
        board = new char[3][3];
        currentPlayer = 'X';
        initializeBoard();

}

    public  void initializeBoard() {
        for (int i = 0; i < 3; i++)
            for (int j = 0; j < 3; j++)
                board[i][j] = '-';
            }
        
    

    public void displayBoard() {
        for (int i = 0; i < 3; i++) {
            for (int j  = 0; j < 3; j++) {
                System.out.print(board[i][j] + " ");
                }
                System.out.println();
}
}

    public void playerMove() {
        Scanner scanner = new Scanner(System.in);
        int row, col;
        do {
            System.out.println("Pemain" + currentPlayer + ",masukkan baris dan kolom (0, 1, atau 2)");
            row = scanner.nextInt();
            col = scanner.nextInt();
        } while (row < 0 || row > 2 ||  col < 0 || col > 2 || board[row][col] != '-');
        board[row][col] = currentPlayer;
        }
        

        public boolean checkWin() {
            for (int i = 0; i < 3; i++) {
                if ((board[i][0] == currentPlayer && board [i][1]  == currentPlayer && board[i][2] == currentPlayer) || 
                    (board[0][i] == currentPlayer && board[1][i] == currentPlayer && board[2][i] == currentPlayer)) {
                        return true;
                    
                }
        }

            return (board[0][0] == currentPlayer && board[1][1] == currentPlayer && board[2][2] == currentPlayer) ||
                   (board[0][2] == currentPlayer && board[1][1] == currentPlayer && board[2][0] == currentPlayer);
    }
    
    
        public void changePlayer() {
            currentPlayer = (currentPlayer == 'X') ?  'O' : 'X';
            }
        
            public static void main(String[] args) {
                Tictactoe game = new Tictactoe();
                boolean gameEnded = false;

                while (!gameEnded) {
                    game.displayBoard();
                    game.playerMove();
                    if (game.checkWin()) {
                        game.displayBoard();
                        System.out.println("Pemain " + game.currentPlayer + " menang!");
                        gameEnded = true;
                    } else {
                        game.changePlayer();
                    }
                        
                    }
                    
                }
            }