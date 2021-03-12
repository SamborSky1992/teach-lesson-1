package pl.mlopatka.human;

public class MarcinLopatka implements Human {

    private String name;
    private String surname;
    private int age;

    public MarcinLopatka() {
        this.name = "Marcin";
        this.surname = "Lopatka";
        this.age = 28;
    }

    @Override
    public String name() {
        return name + surname;
    }

    @Override
    public int age() {
        return age;
    }
}
