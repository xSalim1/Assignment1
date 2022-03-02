package src;

public class Plane implements FlightControl {

    String name;

    public Plane(String name) {
        this.name = name;
    }

    @Override
    public void thrustForward() {
        
        System.out.println(name + " is now going faster!");
    }

    @Override
    public void land() {
        
        System.out.println(name + " has deployed there wheels!");
    }
    
}
