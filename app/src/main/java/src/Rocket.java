package src;

//Rocket method. Will be used to show as an adapter later
public class Rocket {
    // Name of the rocket
    String name;

    public Rocket(String name) {
        this.name = name;
    }

    // Increasing the speed of the rocket
    public void increaseThruster() {
        System.out.println(name + " has increased Thruster Output!");
    }

    //Preparing the land the rocket by deploying parachutes
    public void dropParachutes() {
        System.out.println(name + " has dropped there parachute!");
    }
}
