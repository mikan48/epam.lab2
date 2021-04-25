package epam.RunApp;

import epam.Palindrome.Palindrome;
import epam.Parser.Parser;
import epam.ReadFile.Reader;
import epam.Text.Mails;
import epam.Text.PhoneNumbers;
import epam.Text.Words;

import java.io.IOException;
import java.util.Collections;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) throws IOException {
        Reader read = new Reader();
        String text = read.Read("file.txt");

        Mails mails = new Mails();
        mails.setMails(text);

        System.out.println("Founded mails:");
        if(mails.getMails() == null) {
            System.out.println("Not found");
        } else {
            for(String mail : mails.getMails()) {
                System.out.println(mail);
            }
        }

        PhoneNumbers phoneNumbers = new PhoneNumbers();
        phoneNumbers.setPhoneNumbers(text);

        System.out.println("Founded phone numbers:");
        if(phoneNumbers.getPhoneNumbers() == null) {
            System.out.println("Not found");
        } else {
            for(String phoneNumber : phoneNumbers.getPhoneNumbers()) {
                System.out.println(phoneNumber);
            }
        }

        Parser parser = new Parser();
        Words words = new Words();
        words.setWords(parser.ParseToWords(text));

        Palindrome palindromes = new Palindrome();
        for(int i = 0; i < words.getWords().length; i++) {
            palindromes.setPalindromes(words.getWords()[i]);
        }

        System.out.println("Founded palindromes:");
        if(phoneNumbers.getPhoneNumbers() == null) {
            System.out.println("Not found");
        } else {
            for(String palindrome : palindromes.getPalindromes()) {
                System.out.print(palindrome + ", ");
            }
            System.out.println();

            String longestPalindrome = Collections.max(palindromes.getPalindromes(),
                                        Comparator.comparing(s -> s.length()));
            System.out.println("Longest palindrome: " + longestPalindrome);
        }
    }
}
