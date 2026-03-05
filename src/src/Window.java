public class Window {

    int widthCm;
    int heightCm;

    Window(int widthCm, int heightCm){
        this.widthCm = widthCm;
        this.heightCm= heightCm;

    }


    int getAreaCm2(){
       int areaCm2 = widthCm*heightCm;
        return areaCm2;
    }


   public String toString(){
        return "Window heighCM: " + heightCm + "Window widthCM: " +widthCm;
    }
}


