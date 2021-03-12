package pl.mlopatka.human;

import java.time.LocalDate;
import java.time.Period;

public class DawidSamborski implements Human{
    private String name;
    private String surname;
    private int age;
    private String nickname;
    private LocalDate borndate;

    public DawidSamborski(){
        this.name = "Dawid";
        this.surname = "Samborski";
        this.age = 28;
        this.nickname = "koń";
        this.borndate = LocalDate.parse("1992-07-08");
    }

    @Override
    public String name() {
        return name + surname;
    }

    @Override
    public int age() {
        return Period.between(borndate, LocalDate.now()).getYears();
    }

    @Override
    public String nickname() {
        return nickname;
    }
}
