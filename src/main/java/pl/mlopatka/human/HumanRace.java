package pl.mlopatka.human;

import java.util.List;

public class HumanRace {

    private final static List<Human> HUMANS = List.of(
            new MarcinLopatka(),
            new DawidSamborski(),
            new ArturSam()
    );

    public static void displayAllHumans() {
        HUMANS.forEach(
                human ->  {
                    System.out.print("My human name is: " + human.name() + ". My age: " + human.age());
                    if (human.nickname()!= null ){
                        System.out.print(". My nickname is : " + human.nickname());
                    } else {
                        System.out.print(". Human without a nickname!");
                    }
                    System.out.println();

                }
        );
    }
}
