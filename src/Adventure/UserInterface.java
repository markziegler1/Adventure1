package Adventure;

import java.util.Scanner;

public class UserInterface {
  Scanner scan = new Scanner(System.in);
  private String playerName;
  private char movementInput;
  private String itemInput;


  void welcome() {
    System.out.println("Please enter your player name");
    playerName = scan.nextLine();
    System.out.println("Hi " + playerName);
    System.out.println("Welcome to the adventure game!");
  }

  void getHelp() {
    System.out.println("""
        You generally have six actions at any given time you can perform:
        Press n and press enter to go to the room north of your current position.
        Press s and press enter to go to the room south of your current position.
        Press e and press enter to go to the room east of your current position.
        Press w and press enter to go to the room west of your current position.
        Press l and enter to get a description of the room you're standing in.
        Press a and enter to attack the enemy of the room you're standing in.
        Press i and enter to get a list of the items currently on your person.
        Press h and enter to see how much health you currently have. You also get an idea of how close you are to dying.
        Press E and enter to terminate the program.
        You can always press H and enter again to get a list of commands. Hope you have fun! :)""");
  }

  void getWrongDirection() {
    System.out.println("You can't go that direction");
  }

  void getExitMessage() {
    System.out.println("The program is shutting down, Thanks for playing!");
  }

  void fixScannerBug() {
    scan.nextLine();
  }

  void setMovementInput() {
    movementInput = scan.next().charAt(0);
  }

  char getMovementInput() {
    return movementInput;
  }

  void getCommandMessage() {
    System.out.println("Please enter [n]orth, [s]outh, [e]ast, [w]est, [l]ook, [a]ttack, [i]nventory, [h]ealth, [x]equipped, [H]elp or [E]xit");
  }

  void playerGoingNorth() {
    System.out.println("Going north");
  }

  void playerGoingSouth() {
    System.out.println("Going south");
  }

  void playerGoingEast() {
    System.out.println("Going East");
  }

  void playerGoingWest() {
    System.out.println("Going west");
  }


  public void roomName(Room currentRoom) {
    System.out.println(currentRoom.getName());
  }

  public void roomDescription(Room currentRoom) {
    System.out.println(currentRoom.getRoomDescription());
  }

  public void roomItems(Room currentRoom) {
    System.out.println(currentRoom.getItems());
  }

  void looksAround() {
    System.out.println(playerName + " looks around the room.\n\n");
  }

  public void setItemChoice() {
    itemInput = scan.nextLine();
  }

  String getItemChoice() {
    return itemInput;
  }

  void chooseItem() {
    System.out.println("Do you want to take or drop an item? Enter [t]ake, [d]rop or [n]o to do neither.");
  }

  void askWhatItemToTake() {
    System.out.println("Please write the item you would like to take from the room.");
  }

  void askWhatItemToPut() {
    System.out.println("Please write the item you would like to place in the room");
  }

  void displayInventory(PlayerInfo player) {
    System.out.println(player.getInventory());
  }

  void inventoryAction() {
    System.out.println("Would you like to [c]onsume, [e]quip a weapon or [a]ttack ?");
  }

  void whichItemToConsume() {
    System.out.println("Please write the item you would like to consume.");
  }

  public String getItemInput() {
    return itemInput;
  }

  public String getInventoryInput() {
    return itemInput;
  }

  public void setItemInput() {
    itemInput = scan.nextLine();
  }

  public void setInventoryInput() {
    itemInput = scan.nextLine();
  }

  public void eatOrKeep() {
    System.out.println("Do you want to [c]onsume now or [k]eep in inventory?");
  }

  public void itemIsNotEdible() {
    System.out.println("This item is not edible.");
  }

  public void youAteFood(String nameOfFood, int currentHealth) {
    System.out.println("You consumed: " + nameOfFood + " Your health is now " + currentHealth);
  }

  public void setEatOrKeep() {
    itemInput = scan.nextLine();
  }

  public String getEatOrKeep() {
    return itemInput;
  }

  public void whichWeaponToEquip() {
    System.out.println("Please write the weapon you would like to equip");
  }

  public void setEquippedWeapon() {
    itemInput = scan.nextLine();
  }

  public void attackConfirmed(){
    System.out.println("You attacked empty air");
  }

  public void ammoLeft(int ammo){
    System.out.println("This weapons has: " + ammo + " left");
  }

  public void displayHealth(int currentHealth) {
    if (currentHealth >= 90) {
      System.out.println("Health: " + currentHealth + " - You're in good health go for it!");
    }
    if (currentHealth >= 80) {
      System.out.println("Health: " + currentHealth + " - You can still fight!");
    }
    if (currentHealth >= 70) {
      System.out.println("Health: " + currentHealth + " - Your fighting capability is decent!");
    }
    if (currentHealth >= 60) {
      System.out.println("Health: " + currentHealth + " - I would probably hold back!");
    }
    if (currentHealth < 60) {
      System.out.println("Health: " + currentHealth + " - DONT FIGHT!");
    }
  }


}


