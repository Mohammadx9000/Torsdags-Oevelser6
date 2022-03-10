package Task1;

public class Main {

    public static void main(String[] args) {
        Driver driver = new Driver(20, "Mohammad");
        Car car1 = new Car("Cadilac", "K22", 1923, "White");
        car1.setDrive(driver);
        System.out.println(car1.toString());
        System.out.println(driver.toString());
        Car car2 = new Car("Cadilac", "CB21", 1985, "Green");
        car2.setDrive(driver);
        System.out.println(car2.toString());
        System.out.println(driver.toString());
    }
}
