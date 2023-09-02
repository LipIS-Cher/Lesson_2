public class Car extends EngineTransport {

    public Car(String modelName, int wheelsCount) {
        super(modelName, wheelsCount);
    }

    public static void checkCar(Car car){
        System.out.println("Проверяем - " + car.getModelName());
        Transport.service(car.getWheelsCount());
        EngineTransport.checkEngine();
    }
}