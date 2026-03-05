import java.util.ArrayList;


public class Building {

    String name;
    ArrayList<Room> rooms;

    Building(String name){
        this.name = name;
        this.rooms = new ArrayList<>();

    }
    void addRoom(Room room){
       rooms.add(room);

    }

    int getTotalLampCount(){
        int sum = 0;

        for(Room room : rooms){
sum = sum + room.getLampCount();
        }
        return sum;
    }

    int getTotalWatt(){
        int sum = 0;
        for(Room room : rooms){
            sum = sum + room.getTotalWatt();
        }
        return sum;
    }


    void printBuilding(){

        System.out.println("building name: " + name);
      for(Room room : rooms){
           room.printRoom();
      }

    }
}
