/**
 * Java 1. HomeWork 2.
 *
 * @author Pavel
 * @version 08.10.2021
 */

public class Main {

    public static void main(String[] args) {
        within10and20(7, 8);
        isPositiveOrNegative(10);
        isNegative(7);
        printWordNTimes("Word", 5);
    }

    static boolean within10and20(int a, int b){
        int result = a + b;
        if (result > 10 && result <= 20){
            System.out.println("true");
            return true;
        }   else {
            System.out.println("false");
            return false;
        }

    }

    static void isPositiveOrNegative(int x) {
        if (x >= 0) {
            System.out.println("Positive");
        } else {
            System.out.println("Negative");
        }
    }

    static boolean isNegative(int x) {
        if (x >= 0) {
            return true;
        }
        return false;
    }

    static void printWordNTimes(String word, int times) {
        for (int i = 0; i < times; i++) {
            System.out.println(word);
        }
    }




}
