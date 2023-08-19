public class ServiceStation {
    public void checkCar(Car[] cars){
        for (int i = 0; i < cars.length; i++) {
            System.out.println("Обслуживаем " + cars[i].getModelName());
            for (int z = 0; z < cars[i].getWheelsCount(); z++) {
                Transport.updateTyre();
            }
            Transport.checkEngine();
        }
    }

    public void checkTruck(Truck[] trucks){
        for (int z = 0; z < trucks.length; z++) {
            System.out.println("Обслуживаем " + trucks[z].getModelName());
            for (int i = 0; i < trucks[z].getWheelsCount(); i++) {
                Transport.updateTyre();
            }
            Transport.checkEngine();
            Transport.checkTrailer();
        }
    }
    public void checkBicycle(Bicycle[] bicycles) {
        for (int z = 0; z < bicycles.length; z++) {
            System.out.println("Обслуживаем " + bicycles[z].getModelName());
            for (int i = 0; i < bicycles[z].getWheelsCount(); i++) {
                Transport.updateTyre();
            }
        }
    }

    public void check(Car[] cars, Truck[] trucks, Bicycle[] bicycles){
        for (int z = 0; z < cars.length; z++) {
            System.out.println("Обслуживаем " + cars[z].getModelName());
            for (int i = 0; i < cars[z].getWheelsCount(); i++) {
                Transport.updateTyre();
            }
            Transport.checkEngine();
        }
        for (int z = 0; z < trucks.length; z++) {
            System.out.println("Обслуживаем " + trucks[z].getModelName());
            for (int i = 0; i < trucks[z].getWheelsCount(); i++) {
                Transport.updateTyre();
            }
            Transport.checkEngine();
            Transport.checkTrailer();
        }
        for (int z = 0; z < bicycles.length; z++) {
            System.out.println("Обслуживаем " + bicycles[z].getModelName());
            for (int i = 0; i < bicycles[z].getWheelsCount(); i++) {
                Transport.updateTyre();
            }
        }

    }
}