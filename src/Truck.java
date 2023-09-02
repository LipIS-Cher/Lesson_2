public class Truck extends EngineTransport{


    public Truck(String modelName, int wheelsCount) {
        super(modelName, wheelsCount);
    }



    public static void checkTruck(Truck truck){
        System.out.println("Обслуживаем - " + truck.getModelName());
        Transport.service(truck.getWheelsCount());
        EngineTransport.checkEngine();
        Truck.checkTrailer();
    }

    static void checkTrailer() {
        System.out.println("Проверяем прицеп");
    }

}