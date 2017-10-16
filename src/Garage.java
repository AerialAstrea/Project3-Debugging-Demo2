public class Garage {
    Vehicle[] vehicles = new Vehicle[20];
    int numVehicles = 0;

    public void addVehicle(Vehicle vehicle) {
        vehicles[numVehicles++] = vehicle;
    }

    public String toString() {
        String garageString = "";
        for ( int i=0; i < numVehicles; i++ ) {
            garageString += vehicles[i].toString();
        }

        return garageString;
    }
}
