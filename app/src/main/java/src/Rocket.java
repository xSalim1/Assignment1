package src;

public class Rocket {
    String name;

    public Rocket(String name) {
        this.name = name;
    }

    public void increaseThruster() {
        System.out.println(name + " has increased Thruster Output!");
    }

    public void dropParachutes() {
        System.out.println(name + " has dropped there parachute!");
    }
}
