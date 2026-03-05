
import java.util.ArrayList;

public class Room {
    String name;

    ArrayList<Lamp> Lamp;

    ArrayList<Window> Window;

    Room(String name) {
        this.name = name;
        this.Lamp = new ArrayList<>();
        this.Window = new ArrayList<>();
    }

    void addLamp(Lamp lamp) {
        Lamp.add(lamp);
    }

    void addWindow(Window window) {
        Window.add(window);

    }

    int getLampCount() {
        return Lamp.size();
    }

    int getTotalWatt() {
        int sum = 0;

        for (Lamp lamp : Lamp) {
            sum = sum + lamp.watt;
        }
        return sum;

    }

    int getTotalWindowArea() {
        int sum = 0;
        for (Window window : Window) {
            sum = sum + window.getAreaCm2();


        }
        return sum;
    }
}

