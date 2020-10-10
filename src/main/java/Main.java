import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите слова на вашем языке через пробел:");
        String input = scanner.nextLine();

        // Использование функционального интерфейса и Stream API
        DictionaryGenerator dictionaryGenerator = string -> Arrays
            .stream(string
            .split(" "))
            .sorted()
            .collect(Collectors.toList());

        // Использование Immutable-объекта
        Dictionary dictionary = new Dictionary(dictionaryGenerator.generateDictionary(input));

        dictionary.getDictionary().forEach(System.out::println);
    }
}
