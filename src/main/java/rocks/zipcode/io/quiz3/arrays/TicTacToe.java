package rocks.zipcode.io.quiz3.arrays;

/**
 * @author leon on 09/12/2018.
 */
public class TicTacToe {
    private String[][] board;

    public TicTacToe(String[][] board) {
        this.board = board;
    }

    public TicTacToe() {
    }

    public String[] getRow(Integer value) {
        String[] row = new String[3];

        for(int i = 0; i < 3; i++){
            row[i] = board[value][i];
        }
        return row;
    }

    public String[] getColumn(Integer value) {
        String[] column = new String[3];

        for(int i = 0; i < 3; i++){
            column[i] = board[i][value];
        }
        return column;
    }

    public Boolean isRowHomogenous(Integer rowIndex) {
        return board[rowIndex][0].equals(board[rowIndex][1]) && board[rowIndex][1].equals(board[rowIndex][2]);
    }

    public Boolean isColumnHomogeneous(Integer columnIndex) {
        return board[0][columnIndex].equals(board[1][columnIndex]) && board[1][columnIndex].equals(board[2][columnIndex]);

    }

    public String getWinner() {
        ////check rows
        for(int i = 0; i < 3; i++){
            if(board[i][0] == board[i][1] && board[i][1] == board[i][2] && board[i][0] != " "){
                if(board[i][0].equals("X"))
                    return "X";
                else if(board[i][0].equals("O"))
                    return "O";
                else
                    return "";
            }
        }

        //check columns
        for(int i = 0; i < 3; i++){
            if(board[0][i] == board[1][i] && board[1][i] == board[2][i] && board[0][i] != " "){
                if(board[0][i].equals("X"))
                    return "X";
                else if(board[0][i].equals("O"))
                    return "O";
                else
                    return "";

            }
        }
        if(board[0][0].equals(board[1][1] )&& board[1][1].equals(board[2][2])  && board[0][0] != " "){
            if(board[0][0].equals("X"))
                return "X";
            else if(board[0][0].equals("O"))
                return "O";
            else
                return "";
        }
        if(board[2][0] == board[1][1] && board[1][1] == board[0][2] && board[2][0] != " "){
            if(board[2][0].equals("X"))
                return "X";
            else if(board[2][0].equals("O"))
                return "O";
            else
                return "";
        }


        return "";
    }

    public String[][] getBoard() {
        return null;
    }
}
