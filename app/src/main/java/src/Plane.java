package src;

// Our plane class, implements our FlightControl interface
public class Plane implements FlightControl {

    // Name of the plane
    String name;

    public Plane(String name) {
        this.name = name;
    }

    @Override
    //This method will show the plane is now going faster
    public void thrustForward() {
        
        System.out.println(name + " is now going faster!");
    }

    @Override
    //This method will show the plane is landing
    public void land() {
        
        System.out.println(name + " has deployed there wheels!");
    }
    
}
