package Adventure;

public class Food extends Item {
  private int health;
  Food(String name, String description, boolean isEdible, int health) {
    super(name, description, isEdible);
    this.health = health;

  }

  public int getHealth() {
    return health;
  }
}
