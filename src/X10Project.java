import java.util.HashSet;
import java.util.Set;

public class X10Project {
        public static void main(String[] args) {
            String[] str = {"USA", "AFGHANISTAN", "SINGAPORE", "SWITZERLAND", "GREECE", "MALDIVES", "PORTUGAL"};
            System.out.println("Duplicate elements in the array:");
            printDuplicateStrings(str);
        }
        private static void printDuplicateStrings(String[] array) {
            Set<String> uniqueSet = new HashSet<>();
            Set<String> duplicateSet = new HashSet<>();
            for (String str : array) {
                if (!uniqueSet.add(str)) {
                    duplicateSet.add(str);
                }
            }
            for (String duplicate : duplicateSet) {
                System.out.println(duplicate);
            }
        }
    }

