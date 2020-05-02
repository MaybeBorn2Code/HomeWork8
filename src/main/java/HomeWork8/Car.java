package HomeWork8;

public class Car extends CarShowroom {
    private String name;
    private String color;
    private String engine;
    private int width;
    private int height;
    private int length;
    private int price;


    public Car(String name, String color, String engine, int width, int length, int height, int price) {
        this.name = name;
        this.color = color;
        this.engine = engine;
        this.width = width;
        this.length = length;
        this.height = height;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
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
                "name='" + name + '\'' +
                ", color='" + color + '\'' +
                ", engine='" + engine + '\'' +
                ", width,mm=" + width +
                ", height,mm=" + height +
                ", length,mm=" + length +
                ", price=" + price + "$" +
                '}';
    }
}
