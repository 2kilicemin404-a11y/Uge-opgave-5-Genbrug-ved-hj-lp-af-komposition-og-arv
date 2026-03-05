
import java.util.ArrayList;

public class Room {
    String name;

   ArrayList<Lamp> Lamp;

   ArrayList<Window> Window;

   Room(String name){
       this.name = name;
       this.Lamp = new ArrayList<>();
       this.Window = new ArrayList<>();
   }

   void addLamp(Lamp lamp){
       Lamp.add(lamp);
   }

   void addWindow(Window window){
       Window.add(window);

   }
int getLampCount(){

}
int getTotalWatt(){

}
}
