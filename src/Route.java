import java.util.*;
public class Route {
    private String location;
    private double distance;
    private int vehicle_ID;
    public void input(Scanner sc){
        System.out.println("enter the vehicle id");
        vehicle_ID= sc.nextInt();
        System.out.println("enter the location");
        location= sc.next();
        System.out.println("enter the total distance");
        distance= sc.nextDouble();
    }
    public void inputID(Scanner sc){
        System.out.println("enter the ID of vehicle that you want to see the route of it");
        vehicle_ID= sc.nextInt();
        System.out.println("enter the location");
        location= sc.next();
        System.out.println("enter the total distance");
        distance= sc.nextDouble();
    }
    public void inputForUpdate(Scanner sc){
        System.out.println("enter the ID of vehicle that you want to update the route of it");
        vehicle_ID= sc.nextInt();
        System.out.println("enter the location");
        location= sc.next();
        System.out.println("enter the total distance");
        distance= sc.nextDouble();
    }
    public String getLocation() {
        return location;
    }
    public void setLocation(String location) {
        this.location = location;
    }
    public double getDistance() {
        return distance;
    }
    public void setDistance(double distance) {
        this.distance = distance;
    }
    public int getVehicle_ID() {
        return vehicle_ID;
    }
    public void setVehicle_ID(int vehicle_ID) {
        this.vehicle_ID = vehicle_ID;
    }
    public Route(String location, double distance, int vehicle_ID) {
        this.location = location;
        this.distance = distance;
        this.vehicle_ID = vehicle_ID;
    }
    public Route(){
    }
}