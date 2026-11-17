public class Main {

    public static void main(String[] args) {

        int[][] a = {
            {10, 20, 30},
            {40, 50, 60},
            {70, 80, 90}
        };

        int[][] b = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        int rows = a.length;
        int cols = a[0].length;

        int[][] result = new int[rows][cols];

        for (int i = 0; i < rows; i++) {

            for (int j = 0; j < cols; j++) {

                result[i][j] = a[i][j] + b[i][j];
            }
        }

        System.out.println("Matrix Addition:");

        for (int[] row : result) {
            for (int value : row) {
                System.out.print(value + " ");
            }
            System.out.println();
        }
    }
}
