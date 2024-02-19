 class Driver {
    private String name;
    public Driver(String name) {
        this.name = name;
    }
    public String toString() {
        return "Driver{" + "name=" + name + '}';
    }
}
 class Engine{
    private double speed;
    private String type;
    public Engine(double speed, String type) {
        this.speed = speed;
        this.type = type;
    }
    public String toString() {
        return "Engine{" + "speed=" + speed + ", type=" + type +'}';
    }
}
 class Car {
    private String model;
    private int capacity;
    private Engine engine;
    private Driver driver;
    public Car(String model, int capacity) {
        Engine engine = new Engine(450,"V8");
        this.model = model;
        this.capacity = capacity;
        this.engine = engine;
    }
    public void assignDriver(Driver driver){
        this.driver = driver;
    }
    public Driver getDriver(){
        return driver;
    }
    public String toString() {
        return "Car{" + "model=" + model + ", capacity=" + 
        capacity + ",engine=" + engine + ", driver=" + driver + '}';
    }
}
public class MainProgram {
    public static void main(String args[]) {
        Driver man1 = new Driver("Irmuun");
        Driver man2 = new Driver("John");
        
        Car car = new Car("Ford Mustang", 4);
        
        car.assignDriver(man1);
        
        
        man2 = car.getDriver();
        System.out.println(car);
        System.out.println(man2);
    }
}