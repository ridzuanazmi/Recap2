public class App {
    public static void main(String[] args) throws Exception {
        Car fredCar = new Car();
        Car steveCar = new Car();

        fredCar.setColor("Red");
        steveCar.setColor("Blue");

        System.out.println("Fred's car is " + fredCar.getColor());
        System.out.println("Steve's car is " + steveCar.getColor());

        Car redCar = new FlyingCar("Red");
        System.out.println("Red car is " + redCar.getColor()); // Red car is Matte Red

        Person fred = new Person();
        WashingMachine washer = new WashingMachine();
        Car car = new Car();
        fred.start(washer);
        fred.start(car);

        Box<String> box = new Box<>();
        box.setGenericContent("Generic content");
        box.setContent("box content");
        System.out.println(box.toString());
    }

}

