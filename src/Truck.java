public class Truck extends EngineTransport{


    public Truck(String modelName, int wheelsCount) {
        super(modelName, wheelsCount);
    }



    public void service(){
        super.service();
        checkTrailer();
    }

    public void checkTrailer() {
        System.out.println("Проверяем прицеп");
    }

}