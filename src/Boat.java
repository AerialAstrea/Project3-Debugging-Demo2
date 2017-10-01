public class Boat extends Vehicle {

    public Boat(String make, String model, int year) {
        super(make, model, year);
    }

    public String toString() {
        return make.toUpperCase() + ", " + model.toUpperCase() + ", " + year + "\n" + "Christened: " + name.toUpperCase() + "\n";
    }
}
