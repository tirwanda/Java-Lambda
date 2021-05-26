package lambda.app;

import java.util.function.Supplier;

public class SuplierApp {
    public static void main(String[] args) {
        Supplier<String> supplier = () -> "Edho Dwi TIrwanda";

        System.out.println(supplier.get());
    }
}
