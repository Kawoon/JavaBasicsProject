import java.util.Scanner;

public class X8Project {
        public static void main(String[] args) {
            Scanner find = new Scanner(System.in);
            System.out.print("Enter the size of the array: ");
            int length = find.nextInt();
            int[] nmbs = new int[length];
            System.out.println("Enter the elements of the array:");
            for (int k = 0; k < length; k++) {
                System.out.print("Element " + (k + 1) + ": ");
                nmbs[k] = find.nextInt();
            }
            int maxNmb = findMax(nmbs);
            int minNmb = findMin(nmbs);
            System.out.println("Maximum number: " + maxNmb);
            System.out.println("Minimum number: " + minNmb);
        }
        private static int findMax(int[] array) {
            int max = array[0];
            for (int nmb : array) {
                if (nmb > max) {
                    max = nmb;
                }
            }
            return max;
        }
        private static int findMin(int[] array) {
            int min = array[0];
            for (int nmb : array) {
                if (nmb < min) {
                    min = nmb;
                }
            }
            return min;
        }
    }

