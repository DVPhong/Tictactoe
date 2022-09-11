package Tictactoe;
import java.util.Scanner;
public class Game {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        final int SIZE = 3;
        char[][] board = new char[SIZE][SIZE];
        for (int i=0;i<board.length;i++)
            for (int j=0;j<board[i].length;j++)
                board[i][j] = ' ';
                        
        printBoard(board);

        while (true) {
            System.out.println("p1's turn:");
            int pos1 = scan.nextInt();
            placetoPosition(board, pos1, "p1");
            if (isFinish(board)) break;

            System.out.println("p2's turn:");
            int pos2 = scan.nextInt();
            placetoPosition(board, pos2, "p2");
            if (isFinish(board)) break;
            printBoard(board);

        }
        scan.close();
    }

    public static boolean checkWinner(char symbol,char[][] board){
        if ((board[0][0] == symbol && board[0][1] == symbol && board[0][2] == symbol)||
            (board[1][0] == symbol && board[1][1] == symbol && board[1][2] == symbol)||
            (board[2][0] == symbol && board[2][1] == symbol && board[2][2] == symbol)||
            (board[0][0] == symbol && board[1][0] == symbol && board[2][0] == symbol)||
            (board[0][1] == symbol && board[1][1] == symbol && board[2][1] == symbol)||
            (board[0][2] == symbol && board[1][2] == symbol && board[2][2] == symbol)||
            (board[0][0] == symbol && board[1][1] == symbol && board[2][2] == symbol)||
            (board[0][2] == symbol && board[1][1] == symbol && board[2][0] == symbol))
        return true;
        return false;
    }
    public static boolean isFinish(char[][] board){
        if (checkWinner('X', board)) {
            System.out.println("p1 win");
            return true;
        }
        if (checkWinner('O', board)){
            System.out.println("p2 win");
            return true;
        }
        for (int i=0;i<board.length;i++)
            for (int j = 0;j<board[i].length;j++)
                if (board[i][j] == ' ') return false;
        System.out.println("No one win");
        return true;
    }
    public static void placetoPosition(char[][] boardGame, int pos, String user) {
        char symbol = ' ';
        if (user == "p1")
            symbol = 'X';
        else if (user == "p2")
            symbol = 'O';

        switch (pos) {
            case 1:
                boardGame[0][0] = symbol;
                break;
            case 2:
                boardGame[0][1] = symbol;
                break;
            case 3:
                boardGame[0][2] = symbol;
                break;
            case 4:
                boardGame[1][0] = symbol;
                break;
            case 5:
                boardGame[1][1] = symbol;
                break;
            case 6:
                boardGame[1][2] = symbol;
                break;
            case 7:
                boardGame[2][0] = symbol;
                break;
            case 8:
                boardGame[2][1] = symbol;
                break;
            case 9:
                boardGame[2][2] = symbol;
                break;
            default:
                break;
        }
        printBoard(boardGame);
    }

    public static void printBoard(char[][] board) {
        for (int i=0;i<board.length;i++){
            for (int j=0;j<board[i].length;j++){
                System.out.print("[" + board[i][j] + "]");
            }
            System.out.println();
        }
    }
}
