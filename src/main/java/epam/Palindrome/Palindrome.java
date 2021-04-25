package epam.Palindrome;

import java.util.ArrayList;

public class Palindrome {
    private ArrayList<String> palindromes = new ArrayList<>();

    public ArrayList<String> getPalindromes() {
        return palindromes;
    }

    public void setPalindromes(String word) {
        if(isPalindrome(word)) {
            palindromes.add(word);
        }
    }

    public boolean isPalindrome(String word) {
        if(word.length() <= 1) {
            return true;
        } else {
            StringBuilder sBuilder = new StringBuilder(word);
            return word.equals(sBuilder.reverse().toString());
        }
    }
}
