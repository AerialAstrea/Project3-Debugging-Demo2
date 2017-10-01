public class Main {

    public static void main(String[] args) {
        Vehicle car = new Car("BMW", "M3", 2004, 15.4, 18.2);
        Vehicle electricCar = new ElectricCar("Tesla", "Model X", 2013, 90, 3.1);
        Vehicle boat = new Boat("Mastercraft", "X30", 2012);
        boat.setName("My Fair Lady");

        Garage myGarage = new Garage();
        myGarage.addVehicle(car);
        myGarage.addVehicle(electricCar);
        myGarage.addVehicle(boat);

        System.out.println(myGarage.toString());
    }
}
