import java.sql.Date;
import java.util.Scanner;
public class Insurance {
    private int insurance_ID;
    private String typeOfInsurance;
    private Date starting_Date;
    private Date Ending_Date;
    private double amount;
    private String typeOfVehicle;
    private int vehicle_ID;
    public String getTypeOfVehicle() {
        return typeOfVehicle;
    }
    public int getVehicle_ID() {
        return vehicle_ID;
    }
    public void input(Scanner sc){
        System.out.println("enter the id of insurance");
        insurance_ID= sc.nextInt();
        System.out.println("enter the type of insurance");
        typeOfInsurance= sc.next();
        System.out.println("enter the starting date(yyyy-mm-dd)");
        starting_Date= Date.valueOf(sc.next());
        System.out.println("enter the ending date(yyyy-mm-dd)");
        Ending_Date= Date.valueOf(sc.next());
        System.out.println("enter the Amount");
        amount=sc.nextDouble();
        System.out.println("enter the typeof vehicle ");
        typeOfVehicle = sc.next();
        System.out.println("enter the vehicle id");
        vehicle_ID= sc.nextInt();
    }
    public void inputID(Scanner sc){
        System.out.println("enter the id of insurance that you want to see");
        insurance_ID= sc.nextInt();
    }
    public void inputForUpdate(Scanner sc){
        System.out.println("enter the id of insurance that you want to update");
        insurance_ID= sc.nextInt();
        System.out.println("enter the type of insurance");
        typeOfInsurance= sc.next();
        System.out.println("enter the starting date(yyyy-mm-dd)");
        starting_Date= Date.valueOf(sc.next());
        System.out.println("enter the ending date(yyyy-mm-dd)");
        Ending_Date= Date.valueOf(sc.next());
        System.out.println("enter the Amount");
        amount=sc.nextDouble();
        System.out.println("enter the typeof vehicle ");
        typeOfVehicle = sc.next();
        System.out.println("enter the vehicle id");
        vehicle_ID= sc.nextInt();
    }
    public int getInsurance_ID() {
        return insurance_ID;
    }
    public String getTypeOfInsurance() {
        return typeOfVehicle;
    }
    public Date getStarting_Date() {
        return starting_Date;
    }
    public Date getEnding_Date() {
        return Ending_Date;
    }
    public double getAmount() {
        return amount;
    }
}