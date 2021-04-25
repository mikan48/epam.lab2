package epam.Text;

import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PhoneNumbers {
    private ArrayList<String> phoneNumbers = new ArrayList<>();

    public ArrayList<String> getPhoneNumbers() {
        return phoneNumbers;
    }

    public void setPhoneNumbers(String text) {
        Pattern phonePattern =  Pattern.compile("[+]\\d{3}[(]\\d{2}[)]\\d{3}[-]\\d{2}[-]\\d{2}");
        Matcher matcher = phonePattern.matcher(text);

        while (matcher.find()) {
            phoneNumbers.add(matcher.group());
        }
    }
}
