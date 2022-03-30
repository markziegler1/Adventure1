package Adventure;

import java.util.ArrayList;

public class Room {
  private Room north;
  private Room south;
  private Room east;
  private Room west;
  final private String name;
  private String roomDescription;
  private boolean isEdible;
  private ArrayList<Item> items;


  Room(String name) {
    this.name = name;
    items = new ArrayList<>();
  }

  public void setNorth(Room north) {
    this.north = north;
  }

  public void setSouth(Room south) {
    this.south = south;
  }

  public void setEast(Room east) {
    this.east = east;
  }

  public void setWest(Room west) {
    this.west = west;
  }

  public void setRoomDescription(String description) {
    this.roomDescription = description;
  }


  public Room getNorth() {
    return north;
  }

  public Room getSouth() {
    return south;
  }

  public Room getEast() {
    return east;
  }

  public Room getWest() {
    return west;
  }

  public String getRoomDescription() {
    return roomDescription;
  }

  public ArrayList<Item> getItems() {
    return items; // Maybe String
  }


  public String getName() {
    return name;
  }

  public void addItem(Item item){
    items.add(item);
  }

  public Item itemPlacedInRoom(String itemName) {
    for (int i = 0; i < items.size(); i++) {
      Item check = items.get(i);
      if(itemName.equals(check.getName())) {
        items.add(check);
        return check;
      }
    }
    return null;
  }

  public Item itemTakenFromRoom(String itemName) {
    for (int i = 0; i < items.size(); i++) {
      Item check = items.get(i);
      if(itemName.equalsIgnoreCase(check.getName())) {
        items.remove(i);
        return check;
      }
    }
    return null;
  }
}