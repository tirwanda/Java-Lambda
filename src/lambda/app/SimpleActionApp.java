package lambda.app;

import lambda.SimpleAction;

public class SimpleActionApp {
    public static void main(String[] args) {
        SimpleAction simpleAction1 = new SimpleAction() {
            @Override
            public String action(String name) {
                return name;
            }
        };

        System.out.println(simpleAction1.action("Edho"));

        SimpleAction simpleAction2 = name -> {
            return name;
        };

        System.out.println(simpleAction2.action("Edho"));
    }
}
