package Lesson5;

public class DemoApp {
    public static void main(String[] args) {
        Car car = new Car();
        car.model = "Dodge;";
        car.year = 2020;



        System.out.println("Model = " + car.model + " year = " + car.year + "; wasCrashed = " + car.wasCrashed+ ";");


        Car car2 = new Car();
        car2.model = "Ford;";
        car2.year = 1990;



        System.out.println("Model = " + car2.model + " year = " + car2.year + "; wasCrashed = " + car2.wasCrashed +";");

        Car[] cars = new Car[]{car, car2};
    }
}
