public class Oops {
    public static void main(String[] args) {
        Person p1 = new Person();
        p1.age = 24;
        p1.name = "harsh";
        System.out.println(p1.age + " " + p1.name);

        Person p2 = new Person(90, "harshit");
        System.out.println(p2.age + " " + p2.name);
        p2.walk(2);
        p2.walk();

        Developer d1 = new Developer(2, "me");
        d1.walk();
        System.out.println(d1.age + " " + d1.name); // object of base class

        // Encapsulation example
        Encapsulation encapsulation = new Encapsulation();
        encapsulation.setCarDetails("Toyota", "Camry", "Blue", 4);
        encapsulation.printCarDetails();

        // Abstraction example
        Abstraction abstraction = new Abstraction();
        abstraction.startCar();
    }

    static class Developer extends Person { // base class
        public Developer(int age, String name) {
            super(age, name);
        }
    }

    static class Person { // parent class
        String name;
        static int count;
        int age;

        public Person() { // to check the default constructor
            count++;
            System.out.println("object created " + count);
        }

        public Person(int age, String name) { // parametrized constructor
            this.name = name;
            this.age = age;
        }

        // use of polymorphism
        void walk(int steps) {
            System.out.println(name + " walked " + steps + " steps");
        }

        void walk() {
            System.out.println(name + " walked steps");
        }
    }

    static class Encapsulation { // Encapsulation class
        private String make;
        private String model;
        private String color;
        private int doors;

        public void setCarDetails(String make, String model, String color, int doors) {
            this.make = make;
            this.model = model;
            this.color = color;
            this.doors = doors;
        }

        public void printCarDetails() {
            System.out.println("Car Details: " + make + " " + model + ", Color: " + color + ", Doors: " + doors);
        }
    }

    static class Abstraction { // Abstraction class
        public void startCar() {
            Audi audi = new Audi();
            audi.Start();

            Bmw bmw = new Bmw();
            bmw.Start();
        }
    }

    static class Audi extends Car {
        @Override
        void Start() {
            System.out.println("Audi is starting.");
        }
    }

    static class Bmw extends Car {
        @Override
        void Start() {
            System.out.println("BMW is starting.");
        }
    }

    static abstract class Car {
        abstract void Start();

    }
}