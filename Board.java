public class Board {
    Cell[][] board = new Cell[3][3];

    // public Board() {
    //     for (int i = 0; i < 3; i++)
    //         for (int j = 0; i < 3; j++)
    //             board[i][j].state = CellStatus.EMPTY;
    // }

    public void setState(int i, int j, CellStatus x) {
        board[i][j].setState(x);
    }

    public void printBoard() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (board[i][j].getState() == CellStatus.EMPTY) {
                    System.out.print("[ ]") ;
                }
                else if(board[i][j].getState() == CellStatus.X){
                    System.out.print("[X]") ;
                }
                else if(board[i][j].getState() == CellStatus.O){
                    System.out.print("[O]") ;
                }
            }
            System.out.println();
        }
    }

    public boolean checkDraw() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (board[i][j].getState() == CellStatus.EMPTY )
                    return false;
            }
        }
        return true;
    }

    public boolean checkWinner(CellStatus state){
        if (state != CellStatus.EMPTY)
        if ((board[0][0].getState() == state && board[0][1].getState() == state && board[0][2].getState()== state)||
            (board[1][0].getState() == state && board[1][1].getState() == state && board[1][2].getState() == state)||
            (board[2][0].getState() == state && board[2][1].getState() == state && board[2][2].getState() == state)||
            (board[0][0].getState() == state && board[1][0].getState() == state && board[2][0].getState() == state)||
            (board[0][1].getState() == state && board[1][1].getState() == state && board[2][1].getState() == state)||
            (board[0][2].getState() == state && board[1][2].getState() == state && board[2][2].getState() == state)||
            (board[0][0].getState() == state && board[1][1].getState() == state && board[2][2].getState() == state)||
            (board[0][2].getState() == state && board[1][1].getState() == state && board[2][0].getState() == state))
        return true;
        return false;
    }


}
