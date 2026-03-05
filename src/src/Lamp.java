public class Lamp {
    int watt;
   boolean isOn;

Lamp(int watt, boolean isOn){

    this.watt = watt;
    this.isOn = false;


}
void turnOn(){
isOn = true;
}

void turnOff(){
isOn = false;
}

public String toString(){
return "lamp: " + watt + "lamp turned on: " + isOn;
}


}
