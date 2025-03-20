public class Vehicle {
    //created state variables below:
    private int speed;
    private String name;

    //create vehicle constructor:
    public Vehicle(int speed, String name) {

        this.speed = Math.max(speed, 0);

        if (name == null || name.trim().isEmpty()) {

            this.name = "Unknown";
        } else {

            this.name = name;
        }
    }

    public void move(){
        System.out.println(name + " is moving at " + speed + " km/hr !!!!!");
    }

    public static void main(String[] args) {
        Vehicle vehicle = new Vehicle(-111, "");
        vehicle.move();
    }
}
