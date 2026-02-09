package strategyPattern.defense;

public class Dodge implements DefenseStrategy {

    @Override
    public void defend() {
        System.out.println("Dodging the attack!");
    }
}
