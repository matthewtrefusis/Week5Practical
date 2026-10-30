
import java.util.Scanner;

public class W05P09 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] order = scanner.nextLine().split(" ");

        int rows = Integer.parseInt(order[0]);
        int cols = Integer.parseInt(order[1]);

        int[][] matrix = new int[rows][cols];

        for (int i = 0; i < rows; i++) {
            String[] row = scanner.nextLine().split(" ");
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = Integer.parseInt(row[j]);
            }
        }

        scanner.close();

        System.out.println("");

        int[][] transposedMatrix = transposeMatrix(matrix, rows, cols);

        for (int[] row : transposedMatrix) {
            for (int element : row) {
                System.out.printf("%5d", element);
            }
            System.out.println(); // New line after each row
        }
    }

    public static int[][] transposeMatrix(int[][] matrix, int rows, int cols) {
        int[][] transposedMatrix = new int[cols][rows];

        for (int i = 0; i < cols; i++) {
            for (int j = 0; j < rows; j++) {
                transposedMatrix[i][j] = matrix[j][i];
            }
        }

        return transposedMatrix;
    }
}
