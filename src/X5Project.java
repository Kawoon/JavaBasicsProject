public class X5Project {
        public static void main(String[] args) {
            int nmb1 = 7;
            int nmb2 = 5;

            System.out.println("Before swap: num1 = " + nmb1 + ", num2 = " + nmb2);
            nmb1 = nmb1 + nmb2;
            nmb2 = nmb1 - nmb2;
            nmb1 = nmb1 - nmb2;
            System.out.println("After swap: num1 = " + nmb1 + ", num2 = " + nmb2);
        }
    }

