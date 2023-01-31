package problem2;

public class swapNumbers {
    public static void main(String[] args) {
        swapTwoNums(10,5);
    }
    public static void swapTwoNums(int a, int b) {
        System.out.println("Before swap: A = " + a + " B = " + b);
//      a = 10, b = 5;
        b = b + a;
        a = b - a;
        b = b - a;
        System.out.println("After swap: A = " + a + " B = " + b);
    }
}
