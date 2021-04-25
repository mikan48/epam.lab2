package epam.Parser;

public class Parser {
    public String[] ParseToSentence(String text) {
        String[] sentence = text.split("[\\t\\n\\.?!]+");
        return sentence;
    }

    public String[] ParseToWords(String text) {
        String[] words = text.split("[\\.\\s\\,;:?!«»—()+\"]+");
        return words;
    }
}
