package Adventure;

public class RangedWeapon extends Weapon{
  private int ammo;

  public RangedWeapon(String name, String description, boolean isEdible, boolean isEquipped, int ammo) {
    super(name, description, isEdible, isEquipped);
    this.ammo = ammo;
  }

  public int useAmmo(int ammo) {
    this.ammo = ammo;
    return ammo;
  }

  public void attackedWithWeapon(UserInterface ui){
    ui.attackConfirmed();
    ui.ammoLeft(ammo);
  }

  public boolean canUse(int ammo) {


    if(ammo > 1) {
      return true;

    } else {

      return false;
    }

    /*
    if(ammo > 20) {
      howMuchAmmo = "You have a decent amount of ammo";
      return  howMuchAmmo;
    }
    if(ammo > 10) {
      howMuchAmmo = "You are starting to run out out of ammo";
      return howMuchAmmo;
    }
    howMuchAmmo = "You have run out of ammo";
    return howMuchAmmo;

     */
  }
  public int getAmmo() {
    return ammo--;
  }
}
