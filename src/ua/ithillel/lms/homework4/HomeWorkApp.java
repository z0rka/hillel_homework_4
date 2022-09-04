package ua.ithillel.lms.homework4;

public class HomeWorkApp {

    public static void main(String[] args) {

        printThreeWords();
        System.out.println("----------------------------------------");

        checkSumSign();
        System.out.println("----------------------------------------");

        printColor();
        System.out.println("----------------------------------------");

        compareNumbers();
        System.out.println("----------------------------------------");

        System.out.println(sumChecker(5, 4));
        System.out.println("----------------------------------------");

        numberChecker(-5);
        System.out.println("----------------------------------------");

        System.out.println(numberChecker2(4));
        System.out.println("----------------------------------------");

        printer("Hello world", 5);
        System.out.println("----------------------------------------");

        System.out.println(yearChecker(2100));
    }

    public static void printThreeWords() {
        System.out.println("Orange");
        System.out.println("Banana");
        System.out.println("Apple");
    }

    public static void checkSumSign() {
        int a = 5;
        int b = 10;

        if (a + b >= 0) {
            System.out.println("Positive sum");
        } else {
            System.out.println("Sum is negative");
        }
    }

    public static void printColor() {
        int value = 101;

        if (value <= 0) {
            System.out.println("Red");
        } else if (value > 0 && value <= 100) {
            System.out.println("Yellow");
        } else if (value > 100) {
            System.out.println("Green");
        }
    }

    public static void compareNumbers() {
        int a = 10;
        int b = 9;

        if (a >= b) {
            System.out.println("a >= b");
        } else {
            System.out.println("a < b");
        }
    }

    public static boolean sumChecker(int a, int b) {
        if (a + b >= 10 && a + b <= 20) {
            return true;
        } else {
            return false;
        }
    }

    public static void numberChecker(int a) {
        if (a >= 0) {
            System.out.println("Number is positive");
        } else {
            System.out.println("Number is negative");
        }
    }

    public static boolean numberChecker2(int a) {
        if (a < 0) {
            return true;
        } else {
            return false;
        }
    }

    public static void printer(String str, int times) {
        for (int i = 0; i < times; i++) {
            System.out.println(str);
        }
    }

    public static boolean yearChecker(int year) {
        if (year % 4 == 0) {
            if (year % 400 == 0 || year % 100 != 0) {
                return true;
            }
        }
        return false;
    }
}
