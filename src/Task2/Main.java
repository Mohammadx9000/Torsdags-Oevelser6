package Task2;

import java.util.ArrayList;

public class Main {
    static ArrayList<Room> rooms = new ArrayList<Room>();
    static Building building;
    public static void main(String[] args) {
        rooms.add(new Room(4,1,1,2));
        rooms.add(new Room(6,2,2,3));
        rooms.add(new Room(3,1,4,1));
        building = new Building(rooms, 3,2,false);
        int numberOfLamps = 0;
        for (Room r: rooms) {
            numberOfLamps += r.getNumberOfLamps();
        }
        System.out.println(numberOfLamps);
        if (building.getNumberOfFloors() > building.getRooms().size()){
            System.out.println("This is an odd building");
        }
    }
}
