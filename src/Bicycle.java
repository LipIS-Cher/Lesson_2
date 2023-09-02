public class Bicycle extends Transport{

    public Bicycle(String modelName, int wheelsCount) {
        super(modelName, wheelsCount);
    }

    public static void checkBicycle(Bicycle bicycle){
        System.out.println("Проверяем - " + bicycle.getModelName());
        Transport.service(bicycle.getWheelsCount());
    }
}
