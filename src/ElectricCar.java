public class ElectricCar extends Car {

    double batterySize, mpkh;

    public ElectricCar(String make, String model, int year, double battery, double batteryEconomy) {
        super(make, model, year, 0, 0);
        batterySize = battery;
        mpkh = batteryEconomy;
    }

    public double getrange() {
        return batterySize * mpkh;
    }

    public String toString() {
        return make.toUpperCase() + ", " + model.toUpperCase() + ", " + year + "\n" + "Range: " + getRange() + "\n";
    }
}
