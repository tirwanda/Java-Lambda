package lambda.app;

import lambda.util.StringUtil;

import java.util.Locale;
import java.util.function.Function;
import java.util.function.Predicate;

public class MethodeReferenceApp {
    public static void main(String[] args) {
//        Predicate<String> predicateIsLowerCase = s -> StringUtil.isLowerCase(s);
        Predicate<String> predicateIsLowerCase = StringUtil::isLowerCase;

        System.out.println(predicateIsLowerCase.test("Edho"));
        System.out.println(predicateIsLowerCase.test("dwi"));

        Function<String, String> functionUpper = String::toUpperCase;
        System.out.println(functionUpper.apply("edho"));
    }

    public void run() {
        Predicate<String> predicateIsLowerCase = this::isLowerCase;

        System.out.println("Tirwanda");
        System.out.println("tirwanda");
    }

    public void run2() {
        MethodeReferenceApp app = new MethodeReferenceApp();
        Predicate<String> predicateIsLowerCase = app::isLowerCase;

        System.out.println("Tirwanda");
        System.out.println("tirwanda");
    }

    public boolean isLowerCase(String value) {
        for (var c : value.toCharArray()) {
            if (!Character.isLowerCase(c))
                return false;
        }
        return true;
    }
}
