import java.util.Scanner;
public class Owner {
    private int owner_ID;
    private String name;
    private String cnic;
    private String address;
    private String dateOfBirth;
    private String occupation;
    private String Gender;
    private int noOfVehicle;
    private String phoneNo1;
    private String phoneNo2;
    public String getPhoneNo1() {
        return phoneNo1;
    }
    public String getPhoneNo2() {
        return phoneNo2;
    }
    public int getOwner_ID() {
        return owner_ID;
    }
    public String getName() {
        return name;
    }
    public String getCnic() {
        return cnic;
    }
    public String getAddress() {
        return address;
    }
    public String getDateOfBirth() {
        return dateOfBirth;
    }
    public String getOccupation() {
        return occupation;
    }
    public String getGender() {
        return Gender;
    }
    public int getNoOfVehicle() {
        return noOfVehicle;
    }
    public void input(Scanner sc){
        System.out.println("enter the ownerid");
        owner_ID=sc.nextInt();
        System.out.println("enter the owner name");
        name= sc.next();
        System.out.println("enter gender");
        Gender= sc.next();
        System.out.println("enter the cnic");
        cnic= sc.next();
        System.out.println("enter address");
        address= sc.next();
        System.out.println("enter occupation");
        occupation= sc.next();
        System.out.println("enter no. of vehicles owner have/has");
        noOfVehicle= sc.nextInt();
    }
    public void inputForUpdate(Scanner sc){
        System.out.println("enter the id of owner that you want to update data");
        owner_ID=sc.nextInt();
        System.out.println("enter the owner name");
        name= sc.next();
        System.out.println("enter gender");
        Gender= sc.next();
        System.out.println("enter the cnic");
        cnic= sc.next();
        System.out.println("enter address");
        address= sc.next();
        System.out.println("enter occupation");
        occupation= sc.next();
        System.out.println("enter no. of vehicles owner have/has");
        noOfVehicle= sc.nextInt();
    }
    public void inputID(Scanner sc){
        System.out.println("enter the id of owner that you want to see data");
        owner_ID=sc.nextInt();
    }
}