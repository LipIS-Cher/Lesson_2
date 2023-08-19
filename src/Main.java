public class Main implements Transport{
    public static void main(String[] args) {
        Car[] cars = {
                new Car("car1", 4),
                new Car("car2", 4),
        };

        Truck[] trucks = {
                new Truck("truck1", 6),
                new Truck("truck2", 8),
        };


        Bicycle[] bicycles = {
                new Bicycle("bicycle1", 2),
                new Bicycle("bicycle2", 2),
        };



        ServiceStation station = new ServiceStation();
        station.checkCar(cars);
        station.checkTruck(trucks);
        station.checkBicycle(bicycles);
//        station.check(cars, trucks, bicycles);
    }
}