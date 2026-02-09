package strategyPattern.attack;

public class ShootArrow implements strategyPattern.attack.AttackStrategy {

    @Override
    public void attack() {
        System.out.println("Shooting an arrow!");
    }
}
