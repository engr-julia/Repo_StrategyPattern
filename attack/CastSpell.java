package strategyPattern.attack;

public class CastSpell implements strategyPattern.attack.AttackStrategy {

    @Override
    public void attack() {
        System.out.println("Casting a spell!");
    }
}
