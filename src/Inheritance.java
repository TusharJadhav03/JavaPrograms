public class Inheritance {

    public static class Vehicle {
        private String brand;
        private String model;

        public Vehicle(String brand, String model) {
            this.brand = brand;
            this.model = model;
        }

        public void displayInfo() {
            System.out.println("Brand: " + brand);
            System.out.println("Model: " + model);
        }
    }

    public static class Car extends Vehicle {
        private int numberOfDoors;

        public Car(String brand, String model, int numberOfDoors) {
            super(brand, model);
            this.numberOfDoors = numberOfDoors;
        }

        @Override
        public void displayInfo() {
            super.displayInfo(); // Call displayInfo() method of superclass
            System.out.println("Number of doors: " + numberOfDoors);
        }
    }

    public static class Motorcycle extends Vehicle {
        private boolean hasSideCar;

        public Motorcycle(String brand, String model, boolean hasSideCar) {
            super(brand, model);
            this.hasSideCar = hasSideCar;
        }

        @Override
        public void displayInfo() {
            super.displayInfo(); // Call displayInfo() method of superclass
            System.out.println("Has side car: " + hasSideCar);
        }
    }

    public static void main(String[] args) {
        Car myCar = new Car("Toyota", "Camry", 4);
        Motorcycle myMotorcycle = new Motorcycle("Honda", "CBR1000RR", false);

        System.out.println("Car details:");
        myCar.displayInfo(); // Demonstrates method reuse by inheritance

        System.out.println("\nMotorcycle details:");
        myMotorcycle.displayInfo(); // Demonstrates method reuse by inheritance
    }
}
