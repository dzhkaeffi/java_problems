package problem1;

public class reverseString {
    public static void main(String[] args) {
        String originalString = "Hello";

    }
    public static String reverse(String str) {
        String reversedString = new String();
        for (int i = str.length()-1; i >= 0; i--) {
            reversedString = reversedString + str.toCharArray()[i];
        }
        return reversedString;
    }
}
