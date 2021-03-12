package pl.mlopatka.human;

import java.util.List;

public class HumanRace {

    private final static List<Human> HUMANS = List.of(
            new MarcinLopatka()
    );

    public static void displayAllHumans() {
        HUMANS.forEach(
                human -> System.out.println("My human name is: " + human.name() + ". My age: " + human.age())
        );
    }
}
