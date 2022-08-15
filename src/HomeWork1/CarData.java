package HomeWork1;

public class CarData{
    private int years;
    private String model;
    private String color;
    private int price;

    public CarData(int years, String model, String color, int price) {
        this.years = years;
        this.model = model;
        this.color = color;
        this.price = price;
    }

    @Override
    public String toString() {
        return "CarData{" +
                "years=" + years +
                ", model='" + model + '\'' +
                ", color='" + color + '\'' +
                ", price=" + price +
                '}';
    }
}


