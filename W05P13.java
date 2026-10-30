import java.util.Scanner;

public class W05P13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[][] board = new int[9][9];

        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                if (scanner.hasNextInt()) {
                    board[i][j] = scanner.nextInt();
                }
            }
        }
        scanner.close();

        System.out.printf("%b", isValidSudoku(board));
    }

    static boolean isValidSudoku(int[][] board) {
    // 1. Check every row
    for (int i = 0; i < 9; i++) {
        for (int j = 0; j < 9; j++) {
            if (board[i][j] == 0) continue;
            for (int k = j + 1; k < 9; k++) {
                if (board[i][j] == board[i][k]) return false;
            }
        }
    }

    // 2. Check every column
    for (int j = 0; j < 9; j++) {
        for (int i = 0; i < 9; i++) {
            if (board[i][j] == 0) continue;
            for (int k = i + 1; k < 9; k++) {
                if (board[i][j] == board[k][j]) return false;
            }
        }
    }

    // 3. Check every 3x3 box
    for (int boxRow = 0; boxRow < 9; boxRow += 3) {
        for (int boxCol = 0; boxCol < 9; boxCol += 3) {
            for (int c1 = 0; c1 < 9; c1++) {
                int r1 = boxRow + (c1 / 3);
                int cl1 = boxCol + (c1 % 3);
                if (board[r1][cl1] == 0) continue;

                for (int c2 = c1 + 1; c2 < 9; c2++) {
                    int r2 = boxRow + (c2 / 3);
                    int cl2 = boxCol + (c2 % 3);
                    
                    if (board[r1][cl1] == board[r2][cl2]) return false;
                }
            }
            
        }
    }

    return true;
}

}
