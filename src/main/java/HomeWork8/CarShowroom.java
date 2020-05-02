package HomeWork8;

import java.util.*;

public class CarShowroom {
    private List<Car> list = new ArrayList();

    public void addCar(Car car) throws OutOfFreePlaceException {

        if (car.getWidth() >= 1950 || car.getLength() > 5100 || car.getHeight() >= 1400) {
            throw new TooBigCarException();
        }
        if (list.size() > 4) {
            throw new OutOfFreePlaceException();
        }
        list.add(car);
    }

    public void sellCar(Car car) {
        System.out.println(car.getName() + " sold for $" + car.getPrice());
        list.remove(car);
    }

    public void showAll() {
        for (Car car : list) {
            System.out.println(car);
        }
    }
}