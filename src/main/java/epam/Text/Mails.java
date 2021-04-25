package epam.Text;

import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Mails {
    private ArrayList<String> mails = new ArrayList<>();

    public ArrayList<String> getMails() {
        return mails;
    }

    public void setMails(String text) {
        Pattern mailPattern = Pattern.compile(".+[@]\\w+\\.\\w{2,5}");
        Matcher matcher = mailPattern.matcher(text);

        while (matcher.find()) {
            mails.add(matcher.group());
        }
    }
}
