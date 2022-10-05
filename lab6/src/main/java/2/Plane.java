public class Plane extends Vehicle implements Flyable {

    private String airline;
    private String boeing;
    private static final int MAX_FLYER = 2;

    public Plane() {
        this.setFuel(0.0);
        this.airline = "";
        this.boeing = "";
    }

    public Plane(double fuel, String airline, String boeing) {
        this.setFuel(fuel);
        this.airline = airline;
        this.boeing = boeing;
    }

    public String getAirline() {
        return airline;
    }

    public void setAirline(String airline) {
        this.airline = airline;
    }

    public String getBoeing() {
        return boeing;
    }

    public void setBoeing(String boeing) {
        this.boeing = boeing;
    }

    public void startEngine() {
        if (this.fuel >= 20) {
            setFuel(getFuel() - 20);
            System.out.println("Plane’s Engine starts");
        } else {
            System.out.println("Fuel is not enough.");
        }
    }

    public void stopEngine() {
        System.out.println("Plane’s Engine stops");
    }
    
    public void honk() {
        System.out.println("Weeeeeee");
    }

    public void fly() {
        if (this.getFuel() >= 20) {
            this.setFuel(getFuel() - 20);
            System.out.println("Plane Fly");
        } else {
            System.out.println("Fuel is nearly empty.");
        }
    }

    public void takeOff() {
        if (this.getFuel() >= 10) {
            this.setFuel(getFuel() - 0.5);
            System.out.println("Plane Already to Take Off");
        } else {
            System.out.println("Fuel is nearly empty.");
        }
    }
    
    public void landing() {
        if (this.getFuel() >= 10) {
            this.setFuel(getFuel() - 0.5);
            System.out.println("Plane Already to Landing");
        } else {
            System.out.println("Fuel is nearly empty.");
        }
    }
}