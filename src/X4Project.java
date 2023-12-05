public class X4Project {
    public static void main(String[] args) {
        int[][] nmbs = {
                {7, 5, 9},
                {6, 3, 12},
                {10, 4, 40}
        };
        int eSum = 0;
        int oSum = 0;

        for (int[] row : nmbs) {
            for (int number : row) {
                if (number % 2 == 0) {
                    eSum += number;
                } else {
                    oSum += number;
                }
            }
        }
        System.out.println("2D Array:");
        for (int[] row : nmbs) {
        }

        System.out.println("Sum of Even Numbers: " + eSum);
        System.out.println("Sum of odd Numbers" + oSum);
    }
}



