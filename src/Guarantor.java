import java.sql.Date;
import java.util.Scanner;
public class Guarantor {
    private int guarantor_ID;
    private String name;
    private String cnic;
    private String address;
    private Date dateOfBirth;
    private String Gender;
    private int customer_ID;
    public void input(Scanner sc){
        System.out.println("enter the guarantor id");
        guarantor_ID=sc.nextInt();
        System.out.println("enter the name");
        name= sc.next();
        System.out.println("enter gender");
        Gender= sc.next();
        System.out.println("enter the cnic");
        cnic= sc.next();
        System.out.println("enter address");
        address= sc.next();
        System.out.println("enter date of birth(yyyy-mm-dd)");
        dateOfBirth= Date.valueOf(sc.next());
        System.out.println("enter customer id");
        customer_ID= sc.nextInt();
    }
    public void inputID(Scanner sc){
        System.out.println("enter the guarantor id that you want to see");
        guarantor_ID=sc.nextInt();
    }
    public void inputForUpdate(Scanner sc){
        System.out.println("enter the guarantor id that you want to update");
        guarantor_ID=sc.nextInt();
        System.out.println("enter the name");
        name= sc.next();
        System.out.println("enter gender");
        Gender= sc.next();
        System.out.println("enter the cnic");
        cnic= sc.next();
        System.out.println("enter address");
        address= sc.next();
        System.out.println("enter date of birth(yyyy-mm-dd)");
        dateOfBirth= Date.valueOf(sc.next());
        System.out.println("enter customer id");
        customer_ID= sc.nextInt();
    }
    public int getGuarantor_ID() {
        return guarantor_ID;
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
    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public String getGender() {
        return Gender;
    }
    public int getCustomer_ID() {
        return customer_ID;
    }
}