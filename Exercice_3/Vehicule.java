//Base Vehicle class
class Vehicle {

    protected String model;
    protected int speed;

    public Vehicle() {
    }

    public Vehicle(String model, int speed) {
        this.model = model;
        this.speed = speed;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

}

// Derived Class
class Car extends Vehicle {

    // Name of a Car

    // Default Constructor
    /**
    * 
    */
    private String name;

    public Car() {
        super();

    }

    public Car(String name) {
        super();
        this.name = name;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    // This function sets the name of the car
    public void setDetails(String name) { // Setter Function

        this.setName(name);

    }

    // This function calls the Base class functions and appends the result with the
    // input
    public String getDetails(String carName) {
        // calling Base Class Function
        return "Car [name=" + carName + ", model = " + model + "  speed  " + speed + "]";

    }

    public static void main(String[] args) {

        Car car = new Car();

        car.setModel("Tesla");

        car.setSpeed(100);

        car.setDetails("Roadster");

        System.out.println(car.getDetails(car.getName()));
    }

}