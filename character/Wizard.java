package strategyPattern.character;

import strategyPattern.attack.CastSpell;
import strategyPattern.defense.CreateMagic;
import java.util.Arrays;

public class Wizard extends Character {

    public Wizard() {
        attackStrategy = new CastSpell();
        defenseStrategies = Arrays.asList(
                new CreateMagic()
        );
    }
}
