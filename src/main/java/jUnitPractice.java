import java.util.Arrays;

public class jUnitPractice {

    //  1)
    public static String helloWorld() {
        return "Hello World";
    }

    //  2)
    public static int addInt(int num1, int num2) {
        return num1 + num2;
    }

    //  3)
    public static long intToLong(int num) {
        return num;
    }

    //  4)
    public static double numericStringToDouble(String num) {
        return Double.parseDouble(num);
    }

    //  5)
    public static float doubleToFloat(double num) {
        return (float) num;
    }

    //  6)
    public static char firstChar(String s) {
        return s.charAt(0);
    }

    //  7)
    public static char lastChar(String s) {
        return s.charAt(s.length() - 1);
    }

    //  8)
    public static char capFirst(String s) {
        return Character.toUpperCase(s.charAt(0));
    }

    //  9)
    public static boolean sameFirstAndLast(String s) {
        char first = s.charAt(0);
        char last = s.charAt(s.length() - 1);
        return (first - last == 0);

    }

//    public static boolean sameCase(String s1, String s2) {
//        return Arrays.equals(s1, s2);
//        }

}
