public class Garage {
    Vehicle[] vehicles = new Vehicle[20];
    int numVehicles = 0;

    public void addVehicle(Vehicle vehicle) {
        vehicles[numVehicles++] = vehicle;
    }

    public String toString() {
        String garageString = "Your garage contains the following vehicles:\n";
        for ( int i=0; i < numVehicles; i++ ) {
            garageString += (i + 1) + ")";
            garageString += vehicles[i].toString();
            garageString += "\n";
        }

        return garageString;
    }
}
