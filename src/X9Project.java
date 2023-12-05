import java.util.Scanner;

public class X9Project {
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
            int scndLargest = findSecondLargest(nmbs);
            if (scndLargest != Integer.MIN_VALUE) {
                System.out.println("Second Largest number: " + scndLargest);
            } else {
                System.out.println("There is no second largest number.");
            }
        }
        private static int findSecondLargest(int[] array) {
            int max = Integer.MIN_VALUE;
            int scndMax = Integer.MIN_VALUE;

            for (int nmb : array) {
                if (nmb > max) {
                    scndMax = max;
                    max = nmb;
                } else if (nmb > scndMax && nmb < max) {
                    scndMax = nmb;
                }
            }

            return scndMax;
        }
    }

