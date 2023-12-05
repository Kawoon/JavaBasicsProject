public class X7Project {
        public static void main(String[] args) {
            int k = 7;

            System.out.println("First " + k + " numbers in Fibonacci series:");
            printFibonacci(k);
        }
        private static void printFibonacci(int z) {
            int frst = 0, scnd = 1;

            for (int f = 0; f < z; f++) {
                System.out.print(frst + " ");

                int nxt = frst + scnd;
                frst = scnd;
                scnd = nxt;
            }
        }
    }

