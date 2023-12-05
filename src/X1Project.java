public class X1Project {
    public static void main(String[] args) {
        int[] temps = {33, 17, 76, 32, 13, 34};

        int highestTemp = Integer.MIN_VALUE;
        int lowestTemp = Integer.MAX_VALUE;
        for (int temp : temps) {
            if (temp > highestTemp) {
                highestTemp = temp;
            }
            if (temp < lowestTemp) {
                lowestTemp = temp;
            }
        }

        System.out.println("The Highest Temperature is " + highestTemp + "°C");
        System.out.println("The Lowest Temperature is " + lowestTemp + "°C");
    }
}

