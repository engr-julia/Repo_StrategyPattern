package strategyPattern.character;

import strategyPattern.attack.AttackStrategy;
import strategyPattern.defense.DefenseStrategy;
import java.util.List;

public abstract class Character {

    protected AttackStrategy attackStrategy;
    protected List<DefenseStrategy> defenseStrategies;

    public void performAttack() {
        attackStrategy.attack();
    }

    public void performDefense() {
        for (DefenseStrategy defense : defenseStrategies) {
            defense.defend();
        }
    }
}