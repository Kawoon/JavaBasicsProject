import java.util.Scanner;

public class X6Project {
        public static void main(String[] args) {
            Scanner find = new Scanner(System.in);

            System.out.print("Please Enter a number!");
            int nmbr = find.nextInt();
            if (isPrime(nmbr)) {
                System.out.println(nmbr + " is a prime number.");
            } else {
                System.out.println(nmbr + " is not a prime number.");
            }
        }
        private static boolean isPrime(int nmb) {
            if (nmb <= 1) {
                return false;
            }
            for (int K = 2; K <= Math.sqrt(nmb); K++) {
                if (nmb % K == 0) {
                    return false;
                }
            }
            return true;
        }
    }

