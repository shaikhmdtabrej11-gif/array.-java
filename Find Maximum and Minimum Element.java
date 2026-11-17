public class Main {

    public static void main(String[] args) {

        int[][] matrix = {
            {10, 50, 30},
            {5, 90, 20},
            {70, 15, 40}
        };

        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        for (int[] row : matrix) {

            for (int value : row) {

                max = Math.max(max, value);
                min = Math.min(min, value);
            }
        }

        System.out.println("Maximum: " + max);
        System.out.println("Minimum: " + min);
    }
}
