package car;

import java.util.List;

public class Car {
    private final String make;
    private final String model;
    private final String color;
    private final EngineType engineType;
    private final Transmission transmission;
    private final List<String> options;

    public Car(String make, String model, String color, EngineType engineType, Transmission transmission, List<String> options) {
        this.make = make;
        this.model = model;
        this.color = color;
        this.engineType = engineType;
        this.transmission = transmission;
        this.options = options;
    }

    public void printSpecs() {
        System.out.println("=== Car Specifications ===");
        System.out.println("Make        : " + make);
        System.out.println("Model       : " + model);
        System.out.println("Color       : " + color);
        System.out.println("Engine Type : " + engineType);
        System.out.println("Transmission: " + transmission);
        if (options != null && !options.isEmpty()) {
            System.out.println("Options     : ");
            options.forEach(opt -> System.out.println(" - " + opt));
        }
    }

    public enum EngineType {
        GASOLINE, DIESEL, ELECTRIC, HYBRID
    }

    public enum Transmission {
        MANUAL, AUTOMATIC
    }
}
