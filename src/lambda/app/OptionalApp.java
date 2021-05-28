package lambda.app;

import java.util.Optional;
import java.util.function.Consumer;
import java.util.function.Function;

public class OptionalApp {
    public static void main(String[] args) {
        sayHello("Edho");
        sayHello(null);
    }

    public static void sayHello(String name) {
        // Tidak Error Jika name = null
//        Optional<String> optionalName = Optional.ofNullable(name);
//        Optional<String> optionalNameUpperCase = optionalName.map(value -> value.toUpperCase());
//        optionalNameUpperCase.ifPresent(value -> System.out.println("Hello, " + value));

//        Optional.ofNullable(name)
//                .map(value -> value.toUpperCase())
//                .ifPresent(value -> System.out.println("Hello, " + value));

//        Optional.ofNullable(name)
//                .map(String::toUpperCase)
//                .ifPresentOrElse(value -> System.out.println("Hello, " + value),
//                        () -> System.out.println("Hello"));

        String upperName = Optional.ofNullable(name)
                .map(String::toUpperCase)
                .orElse("Teman");

        System.out.println("Hello, " + upperName);
        
        // if Check null
//        if (name != null) {
//            System.out.println("Hello, " + name.toUpperCase());
//        }
    }
}
