import java.util.Scanner;
public class Vehicle {
    private int vehicle_ID;
    private String carBrand;
    private String description;
    private String carModel;
    private int capacity;
    private String ownername;
    private int rating;
    private String engineNo;
    private String condition;
    private int owner_ID;
    private int customer_ID;
    private String chasisNo;
    public String getChasisNo() {
        return chasisNo;
    }
    public void setChasisNo(String chasisNo) {
        this.chasisNo = chasisNo;
    }
    public int getVehicle_ID() {
        return vehicle_ID;
    }
    public String getCarBrand() {
        return carBrand;
    }
    public String getDescription() {
        return description;
    }
    public String getCarModel() {
        return carModel;
    }
    public int getCapacity() {
        return capacity;
    }
    public String getOwnername() {
        return ownername;
    }
    public int getRating() {
        return rating;
    }
    public String getEngineNo() {
        return engineNo;
    }
    public String getCondition() {
        return condition;
    }
    public int getOwner_ID() {
        return owner_ID;
    }
    public int getCustomer_ID() {
        return customer_ID;
    }
    public void input(Scanner sc){
        System.out.println("enter the id of vehicle");
        vehicle_ID= sc.nextInt();
        System.out.println("enter the vehicle brand");
        carBrand= sc.next();
        System.out.println("enter the description of vehicle");
        description=sc.next();
        System.out.println("enter the car model");
        carModel=sc.next();
        System.out.println("enter the capacity of vehicle");
        capacity=sc.nextInt();
        System.out.println("enter the owner name ");
        ownername= sc.next();
        System.out.println("enter the rating of the vehicle");
        rating= sc.nextInt();
        System.out.println("enter the engine #");
        engineNo= sc.next();
        System.out.println("enter the chasis no");
        chasisNo=sc.next();
        System.out.println("enter the condition ");
        condition= sc.next();
        System.out.println("enter the owner id");
        owner_ID= sc.nextInt();
        System.out.println("enter the customer id");
        customer_ID= sc.nextInt();
    }
    public void inputId(Scanner sc){
        System.out.println("enter the id of vehicle that you want to see data");
        vehicle_ID= sc.nextInt();
    }
    public void inputForUpdate(Scanner sc){
        System.out.println("enter the id of vehicle that you want to update data");
        vehicle_ID= sc.nextInt();
        System.out.println("enter the vehicle brand");
        carBrand= sc.next();
        System.out.println("enter the description of vehicle");
        description=sc.next();
        System.out.println("enter the car model");
        carModel=sc.next();
        System.out.println("enter the capacity of vehicle");
        capacity=sc.nextInt();
        System.out.println("enter the owner name ");
        ownername= sc.next();
        System.out.println("enter the rating of the vehicle");
        rating= sc.nextInt();
        System.out.println("enter the engine #");
        engineNo= sc.next();
        System.out.println("enter the chasis no");
        chasisNo=sc.next();
        System.out.println("enter the condition ");
        condition= sc.next();
        System.out.println("enter the owner id");
        owner_ID= sc.nextInt();
        System.out.println("enter the customer id");
        customer_ID= sc.nextInt();
    }
}
