package Adventure;

public class Item {
private String name;
private String description;
private boolean isEdible;
private int health;

Item(String name, String description, boolean isEdible){
  this.name = name;
  this.description = description;
  this.isEdible = isEdible;
}
  @Override
  public String toString() {
    return "item: " + name + " " + description;
  }
  public String getName() {
  return name;
  }

  public boolean getIsEdible() {
  return isEdible;
  }

  public int getHealth() {
  return health;
  }
}
