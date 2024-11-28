import java.util.Arrays;
import java.util.Scanner;

public class MatrixAdd {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Do you want to input your own matrices? (yes/no): ");
        String response = scanner.nextLine().trim().toLowerCase();

        int[][] matrix1;
        int[][] matrix2;
        int rows = 2, cols = 2;

        if (response.equals("yes")) {
            System.out.print("Enter the number of rows: ");
            rows = scanner.nextInt();
            System.out.print("Enter the number of columns: ");
            cols = scanner.nextInt();

            matrix1 = new int[rows][cols];
            matrix2 = new int[rows][cols];

            System.out.println("Enter elements of first matrix:");
            for (int i = 0; i < rows; i++) {
                for (int j = 0; j < cols; j++) {
                    matrix1[i][j] = scanner.nextInt();
                }
            }

            System.out.println("Enter elements of second matrix:");
            for (int i = 0; i < rows; i++) {
                for (int j = 0; j < cols; j++) {
                    matrix2[i][j] = scanner.nextInt();
                }
            }
        } else {
            matrix1 = new int[][]{{1, 2}, {3, 4}};
            matrix2 = new int[][]{{5, 6}, {7, 8}};
            String m1 = Arrays.deepToString(matrix1);
            String m2 = Arrays.deepToString(matrix2);


            System.out.println("Default matrix will be \n " + m1 + "\n and " + m2);
        }

        int[][] sum = new int[rows][cols];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                sum[i][j] = matrix1[i][j] + matrix2[i][j];
            }
        }

        System.out.println("Sum of the matrices:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(sum[i][j] + " ");
            }
            System.out.println();
        }
    }
}
