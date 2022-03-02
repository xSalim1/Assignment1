package src;

public class Main {
    public static void main(String[] args) {
        Plane plane = new Plane("Air Canada");
        Adapter rocket = new Adapter(new Rocket("Falcon"));

        plane.land();
        rocket.land();
    }
}