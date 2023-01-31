package problem3;

public class checkForVowels {
    public static void main(String[] args) {
        doesContainVowel("Igor");
    }
    public static boolean doesContainVowel(String inputString) {
        boolean containsVowel = inputString.toLowerCase().matches(".*[aeiou].*");
        System.out.println(containsVowel);
        return containsVowel;
    }
}
