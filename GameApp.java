import strategyPattern.character.Archer;
import strategyPattern.character.Knight;
import strategyPattern.character.Wizard;
import strategyPattern.character.Character;

public class GameApp {

    public static void main(String[] args) {

        Character knight = new Knight();
        Character wizard = new Wizard();
        Character archer = new Archer();

        System.out.println("=== Knight ===");
        knight.performAttack();
        knight.performDefense();

        System.out.println("\n=== Wizard ===");
        wizard.performAttack();
        wizard.performDefense();

        System.out.println("\n=== Archer ===");
        archer.performAttack();
        archer.performDefense();
    }
}
