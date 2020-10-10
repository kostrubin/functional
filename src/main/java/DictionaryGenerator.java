import java.util.List;

@FunctionalInterface
public interface DictionaryGenerator {
    List<String> generateDictionary(String string);
}
