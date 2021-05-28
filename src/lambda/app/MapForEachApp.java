package lambda.app;

import java.util.HashMap;
import java.util.Map;
import java.util.function.BiConsumer;
import java.util.function.Consumer;

public class MapForEachApp {
    public static void main(String[] args) {
        Map<String, String> names = new HashMap<>();

        names.put("first", "Edho");
        names.put("middle", "Dwi");
        names.put("last", "Tirwanda");

        for (var entry : names.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }

        // Foreach with anonymous class
        names.forEach(new BiConsumer<String, String>() {
            @Override
            public void accept(String key, String value) {
                System.out.println(key + " : " + value);
            }
        });

        // Foreach with lamda
        names.forEach((key, value) -> System.out.println(key + " : " + value));
    }
}
