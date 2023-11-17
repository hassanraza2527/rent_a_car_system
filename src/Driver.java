import java.sql.Date;
import java.util.Scanner;
public class Driver {
    private int driver_ID;
    private String name;
    private String address;
    private Date dateOfBirth;
    private String licenseNo;
    private int yearOfExp;
    private String Gender;
    private int owner_ID;
    private String phoneNo1;
    private String phoneNo2;
    public void input(Scanner sc){
        System.out.println("enter the id of driver");
        driver_ID= sc.nextInt();
        System.out.println("enter the driver name");
        name= sc.next();
        System.out.println("enter the address");
        address=sc.next();
        System.out.println("enter the year of experience");
        yearOfExp=sc.nextInt();
        System.out.println("enter the licenseNo");
        licenseNo=sc.next();
        System.out.println("enter the gender ");
        Gender= sc.next();
        System.out.println("enter the dateOfBirth(yyyy-mm-dd)");
        dateOfBirth= Date.valueOf(sc.next());
        System.out.println("enter the owner id");
        owner_ID= sc.nextInt();
    }
    public void inputID(Scanner sc){
        System.out.println("enter the id of driver that you want to see");
        driver_ID= sc.nextInt();
    }
    public void inputForUpdate(Scanner sc){
        System.out.println("enter the id of driver that you want to update");
        driver_ID= sc.nextInt();
        System.out.println("enter the driver name");
        name= sc.next();
        System.out.println("enter the address");
        address=sc.next();
        System.out.println("enter the year of experience");
        yearOfExp=sc.nextInt();
        System.out.println("enter the licenseNo");
        licenseNo=sc.next();
        System.out.println("enter the gender ");
        Gender= sc.next();
        System.out.println("enter the dateOfBirth(yyyy-mm-dd)");
        dateOfBirth= Date.valueOf(sc.next());
        System.out.println("enter the owner id");
        owner_ID= sc.nextInt();
    }
    public String getPhoneNo2() {
        return phoneNo2;
    }
    public String getPhoneNo1() {
        return phoneNo1;
    }
    public int getDriver_ID() {
        return driver_ID;
    }
    public String getName() {
        return name;
    }
    public String getAddress() {
        return address;
    }
    public Date getDateOfBirth() {
        return dateOfBirth;
    }
    public String getLicenseNo() {
        return licenseNo;
    }
    public int getYearOfExp() {
        return yearOfExp;
    }
    public String getGender() {
        return Gender;
    }
    public int getOwner_ID() {
        return owner_ID;
    }
}
