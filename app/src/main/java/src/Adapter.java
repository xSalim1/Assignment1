package src;

//Class that will act as an "adapter" and connect the objects
public class Adapter implements FlightControl {

    //Storing Rocket Object
    Rocket r;

    public Adapter(Rocket r) {
        this.r = r;
    }

    
    @Override
    //Our thrustForward for the Rocket is the increase in Thruster
    public void thrustForward() {
        r.increaseThruster();
        
    }

    @Override
    //To land a rocket, we use parachutes instead of wheels
    public void land() {
        r.dropParachutes();
        
    }
    
}
