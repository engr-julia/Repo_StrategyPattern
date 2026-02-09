package strategyPattern.character;

import strategyPattern.attack.SwingSword;
import strategyPattern.defense.Shield;
import strategyPattern.defense.Dodge;
import strategyPattern.defense.CreateMagic;
import java.util.Arrays;

public class Knight extends Character {

    public Knight() {
        attackStrategy = new SwingSword();
        defenseStrategies = Arrays.asList(
                new Shield(),
                new Dodge(),
                new CreateMagic()
        );
    }
}
