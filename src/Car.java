public class Car extends Vehicle implements Vehicle.Driveable {

    double gasTankSize, mpg;

    public Car(String make, String model, int year, double tankSize, double fuelEconomy) {
        super(make, model, year);
        gasTankSize = tankSize;
        mpg = fuelEconomy;
    }

    public double getRange() {
        return gasTankSize * mpg;
    }

    public String toString {
        return super.toString() + "Gas Tank Size: " + gasTankSize + "\nMpg: " + mpg + "\n";
    }
}
