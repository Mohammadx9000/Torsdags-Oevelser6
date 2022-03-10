package Task1;

public class Car {
    private String make;
    private String model;
    private int year;
    private String bodyStyle;
    private Driver drive;

    Car(String make, String model, int year, String bodyStyle){
        this.make = make;
        this.model = model;
        this.year = year;
        this.bodyStyle = bodyStyle;
    }

    public Driver getDrive() {
        return drive;
    }

    public void setDrive(Driver drive) {
        this.drive = drive;
    }

    @Override
    public String toString() {
        return "Make: "+make+". Model: "+model+ " ("+ year + "), BodyStyle: "+bodyStyle;
    }
}
