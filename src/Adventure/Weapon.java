package Adventure;

public abstract class Weapon extends Item {
  private boolean isEquipped;
  private int ammo;


  Weapon(String name, String description, boolean isEdible, boolean isEquipped){
    super(name, description, isEdible);
    this.isEquipped = isEquipped;
  }

  public void attackedWithWeapon(UserInterface ui){
    ui.attackConfirmed();
  }

  public boolean canUse(int ammo) {
    return true;
  }

  public int useAmmo(int ammo) {
   return ammo--;
  }


  public int getAmmo() {
    int ammo = 0;
    return ammo;
  }

  public void setAmmo(int ammo) {
    this.ammo = ammo;

  }


  public void setIsEquipped(boolean isEquipped) {
    this.isEquipped = isEquipped;
  }

  public boolean getIsEquipped() {
    return isEquipped;
  }
}
