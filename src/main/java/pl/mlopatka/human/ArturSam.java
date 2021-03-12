package pl.mlopatka.human;

public class ArturSam implements Human {
    private String name;
    private String surname;
    private int age;
    private String nickname;

    public ArturSam(){
        this.name = "Artur";
        this.surname = "Sam";
        this.age = 11;
        this.nickname = "Wichajster";
    }

    @Override
    public String name() {
        return name+surname;
    }

    @Override
    public int age() {
        return age;
    }

    @Override
    public String nickname() {
        return nickname;
    }
}
