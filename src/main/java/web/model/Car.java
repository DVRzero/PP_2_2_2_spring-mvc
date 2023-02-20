package web.model;

public class Car {

    private String model;
    private String engine;
    private int price;

    public Car() {
    }
    public Car(String model, String engine, int price) {
        this.model = model;
        this.engine = engine;
        this.price = price;
    }

    public String getModel() {
        return model;
    }
    public void setModel(String model) {
        this.model = model;
    }

    public String getEngine() {
        return engine;
    }
    public void setEngine(String engine) {
        this.engine = engine;
    }

    public int getPrice() {
        return price;
    }
    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                ", engine='" + engine + '\'' +
                ", price=" + price +
                '}';
    }
}
