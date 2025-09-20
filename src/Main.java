import car.Car;
import car.CarBuilder;

public class Main {
    public static void main(String[] args) {
        Car myCar = new CarBuilder()
                .setMake("Tesla")
                .setModel("Model S")
                .setColor("Midnight Silver")
                .setEngineType(Car.EngineType.ELECTRIC)
                .setTransmission(Car.Transmission.AUTOMATIC)
                .addOption("Autopilot")
                .addOption("Panoramic Roof")
                .build();

        myCar.printSpecs();
    }
}
