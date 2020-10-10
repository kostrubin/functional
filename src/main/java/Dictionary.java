import java.util.List;

public class Dictionary {
    private final List<String> dictionary;

    public Dictionary(List<String> dictionary) {
        this.dictionary = dictionary;
    }

    public List<String> getDictionary() {
        return dictionary;
    }
}
