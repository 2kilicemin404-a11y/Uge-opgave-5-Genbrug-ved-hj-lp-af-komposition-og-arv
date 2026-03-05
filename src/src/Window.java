public class Window {

    int widthCm;
    int heightCm;

    Window(int widthCm, int heightCm){
        this.widthCm = widthCm;
        this.heightCm= heightCm;

    }


    int getAreaCm2(){
       int AreaCm2 = widthCm*heightCm;
        return AreaCm2;
    }


   public String toString(){
        return "Window heighCM: " + heightCm + "Window widthCM: " +widthCm;
    }
}


