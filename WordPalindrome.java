public class WordPalindrome {
    public static void main(String[] args) {
        String testString = "ahha";
        System.out.println(isPalindrome(testString));
    }

    public static boolean isPalindrome(String testString){
        boolean check = true;
        int lastIndex = testString.length() - 1;
        if (testString.length() == 0 || testString.length() == 1){
            return check;
        }
        if (testString.charAt(0) != testString.charAt(lastIndex)){
            return !check;
        }
        testString = testString.substring(1, lastIndex);
        return isPalindrome((testString));
    }
}
