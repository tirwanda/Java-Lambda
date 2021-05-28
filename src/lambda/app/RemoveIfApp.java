package lambda.app;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class RemoveIfApp {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();

        list.addAll(List.of("Edho","Dwi", "Tirwanda"));

        // Remove if using anonymous class
        list.removeIf(new Predicate<String>() {
            @Override
            public boolean test(String value) {
                return value.length() > 5;
            }
        });

        // Remove if using lambda function
        list.removeIf(value -> value.length() > 5);

        System.out.println(list);

    }
}
