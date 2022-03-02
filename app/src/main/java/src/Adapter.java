package src;

public class Adapter implements FlightControl {

    Rocket r;

    public Adapter(Rocket r) {
        this.r = r;
    }

    
    @Override
    public void thrustForward() {
        r.increaseThruster();
        
    }

    @Override
    public void land() {
        r.dropParachutes();
        
    }
    
}
