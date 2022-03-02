package src;

public class Main {
    public static void main(String[] args) {
        //Plane Object
        Plane plane = new Plane("Air Canada");

        //Adding our rocket into our adapter
        Adapter rocket = new Adapter(new Rocket("Falcon"));

        //Can use the same method to access 2 different methods
        plane.land();
        rocket.land();
    }
}