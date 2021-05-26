package lambda.app;

import java.util.function.Function;

public class FunctionApp {
    public static void main(String[] args) {
        Function<String, Integer> functionLength = new Function<String, Integer>() {
            @Override
            public Integer apply(String s) {
                return s.length();
            }
        };

        Function<String, Integer> functionLength2 = s -> s.length();

        Integer value = functionLength.apply("Edho");
        Integer value2 = functionLength2.apply("Dwi");

        System.out.println(value);
        System.out.println(value2);
    }
}
