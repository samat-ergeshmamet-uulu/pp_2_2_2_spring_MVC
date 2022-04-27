package model;

public class Car {
    private int id;
    private String engine;
    private String model;

    public Car() {
    }

    public Car(int id, String engine, String model) {
        this.id = id;
        this.engine = engine;
        this.model = model;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getEngine() {
        return engine;
    }

    public void setEngine(String engine) {
        this.engine = engine;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    @Override
    public String toString() {
        return "Car{" +
                "id=" + id +
                ", engine='" + engine + '\'' +
                ", model='" + model + '\'' +
                '}';
    }
}
