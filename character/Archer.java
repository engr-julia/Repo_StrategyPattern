package strategyPattern.character;

import strategyPattern.attack.ShootArrow;
import strategyPattern.defense.Dodge;
import java.util.Arrays;

public class Archer extends Character {

    public Archer() {
        attackStrategy = new ShootArrow();
        defenseStrategies = Arrays.asList(
                new Dodge()
        );
    }
}
