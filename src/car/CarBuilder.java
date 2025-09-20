package car;

import java.util.ArrayList;
import java.util.List;

public class CarBuilder {
    private String make;
    private String model;
    private String color;
    private Car.EngineType engineType;
    private Car.Transmission transmission;
    private final List<String> options = new ArrayList<>();

    public CarBuilder setMake(String make) {
        this.make = make;
        return this;
    }

    public CarBuilder setModel(String model) {
        this.model = model;
        return this;
    }

    public CarBuilder setColor(String color) {
        this.color = color;
        return this;
    }

    public CarBuilder setEngineType(Car.EngineType engineType) {
        this.engineType = engineType;
        return this;
    }

    public CarBuilder setTransmission(Car.Transmission transmission) {
        this.transmission = transmission;
        return this;
    }

    public CarBuilder addOption(String option) {
        this.options.add(option);
        return this;
    }

    public Car build() {
        return new Car(make, model, color, engineType, transmission, options);
    }
}
