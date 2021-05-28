package lambda.app;

import java.util.List;
import java.util.function.Consumer;

public class ForEachApp {
    public static void main(String[] args) {
        List<String> names = List.of("Edho", "Dwi", "Tirwanda");

        // For Loop
        for (var name : names) {
            System.out.println(name);
        }

        // Foreach anonymous class
        names.forEach(new Consumer<String>() {
            @Override
            public void accept(String name) {
                System.out.println(name);
            }
        });

        // Lambda Function
//        Consumer<String> lambda = value -> System.out.println(value);
        names.forEach(value -> System.out.println(value));

        // Lambda methode reference
        names.forEach(System.out::println);
    }
}
