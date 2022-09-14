import java.util.Scanner;
public class Game {
    public static void main(String[] args){
        
        Board newBoard = new Board();
        
        while (true) {
            System.out.println("p1's turn:");
            Scanner scan = new Scanner(System.in);
            int row = scan.nextInt();
            int col = scan.nextInt();
            // while (!checkEmpty(row, col, newBoard)) {
            //     System.out.println("Invalid");
            //     //Scanner scan;
            //     row = scan.nextInt() ;
            //     col = scan.nextInt() ;
            // }
            newBoard.setState(row,col,CellStatus.X);
            newBoard.printBoard();
            if (newBoard.checkWinner(CellStatus.X)){
                System.out.println("p1 Win");
                break;
            }
            System.out.println("p2's turn:");
            // int row1 = scan.nextInt();
            // int col1 = scan.nextInt();
            // while (!checkEmpty(row1, col1, newBoard)) {
            //     System.out.println("Invalid, Try again");
            //     //Scanner scan;
            //     row1 = scan.nextInt() ;
            //     col1 = scan.nextInt() ;
            // }
            int row1 = scan.nextInt();
            int col1 = scan.nextInt();
            newBoard.setState(row1, col1, CellStatus.O);
            newBoard.printBoard();
            if (newBoard.checkWinner(CellStatus.O)){
                System.out.println("p2 Win");
                break;
            }
            scan.close();
        }
        
    }
    // static boolean checkEmpty(int row, int col, Board newBoard) {
    //     if (row >= 3 || row < 0 || col >= 3 || col < 0) {
    //         return false ;
    //     }

    //     if (newBoard.board[row][col].getState() != CellStatus.EMPTY ) {
    //         return false ;
    //     }

    //     return true ;
    // }


   
}
