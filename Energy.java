abstract class EnergySource {
    int sourceId;
    String sourceName;
    double energyGenerated;

    EnergySource(int sourceId, String sourceName, double energyGenerated) {
        this.sourceId = sourceId;
        this.sourceName = sourceName;
        this.energyGenerated = energyGenerated;
    }

    abstract double calculateEfficiency();

    void displayDetails() {
        System.out.println("Source ID: " + sourceId);
        System.out.println("Source Name: " + sourceName);
        System.out.println("Energy Generated: " + energyGenerated + " kWh");
        System.out.println("Efficiency: " + calculateEfficiency() + "%");
    }
}

class SolarEnergy extends EnergySource {

    SolarEnergy(int sourceId, String sourceName, double energyGenerated) {
        super(sourceId, sourceName, energyGenerated);
    }

    double calculateEfficiency() {
        return (energyGenerated / 5000) * 100;
    }
}

class WindEnergy extends EnergySource {

    WindEnergy(int sourceId, String sourceName, double energyGenerated) {
        super(sourceId, sourceName, energyGenerated);
    }

    double calculateEfficiency() {
        return (energyGenerated / 8000) * 100;
    }
}

public class Energy {
    public static void main(String[] args) {

        // Dynamic Method Dispatch
        EnergySource source;

        source = new SolarEnergy(101, "Solar Panel", 4000);

        System.out.println("----- Solar Energy -----");
        source.displayDetails();

        source = new WindEnergy(102, "Wind Turbine", 6400);

        System.out.println("\n----- Wind Energy -----");
        source.displayDetails();
    }
}