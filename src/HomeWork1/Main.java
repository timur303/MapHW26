package HomeWork1;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Car car1 = new Car(1,777);
        CarData carData = new CarData(2012,"BMW","White",180000);

        Map<Car,CarData> carMap = new HashMap<>();
        carMap.put(car1,carData);

        for (Map.Entry cars: carMap.entrySet()) {
            System.out.println(cars);
           // System.out.println(cars.getKey() + " " + cars.getValue());
        }

    }
}
