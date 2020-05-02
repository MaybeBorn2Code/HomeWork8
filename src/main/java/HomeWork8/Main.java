package HomeWork8;

public class Main {
    public static void main(String[] args) {
        Car car1 = new Car("Chevrolet Camaro", "yellow", "V8", 1918, 4841, 1377, 25000);
        Car car2 = new Car("Dodge Charger", "blue", "V8", 1905, 5077, 1382, 34250);
        Car car3 = new Car("Ford Mustang", "silver", "V8", 1816, 3784, 1381, 37650);
        Car car4 = new Car("Chevrolet Impala IX", "black", "V8", 1851, 5091, 1487, 48000);
        Car car5 = new Car("Ford GT", "white", "V12", 1955, 4645, 1125, 78000);
        Car car6 = new Car("Ferrari 458", "red", "V8", 1937, 4527, 1213, 125000);
        CarShowroom autoWorld = new CarShowroom();
        try {
            autoWorld.addCar(car1);
            autoWorld.addCar(car2);
            autoWorld.addCar(car3);
            autoWorld.addCar(car4);
            autoWorld.addCar(car5);
            autoWorld.addCar(car6);

        } catch (TooBigCarException d) {
            System.out.println("that car is huge for that garage");
        } catch (OutOfFreePlaceException e) {
            System.out.println("no more free space for another car (only 5 cars required)");
        }

        System.out.println("");
        autoWorld.showAll();
    }
}