import java.sql.Date;
import java.util.Scanner;
/*while (resultSet.next()) {
// Assuming you have columns named "column1" and "column2"
String column1Data = resultSet.getString("column1");
int column2Data = resultSet.getInt("column2");
// Print the data
System.out.println("Column 1: " + column1Data);
System.out.println("Column 2: " + column2Data);*/
public class Customer {
    private int customer_ID;
    private String name;
    private String cnic;
    private String address;
    private Date dateOfBirth;
    private String licenseNo;
    private String occupation;
    private String Gender;
    private String phoneNo1;
    private String phoneNo2;
    public String getPhoneNo1() {
        return phoneNo1;
    }
    public String getPhoneNo2() {
        return phoneNo2;
    }
    public int getCustomer_ID() {
        return customer_ID;
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
    public String getLicenseNo() {
        return licenseNo;
    }
    public String getOccupation() {
        return occupation;
    }
    public String getGender() {
        return Gender;
    }
    public void input(Scanner sc) {
        System.out.println("enter the customerid");
        customer_ID = sc.nextInt();
        System.out.println("enter the customer name");
        name = sc.next();
        System.out.println("enter gender");
        Gender = sc.next();
        System.out.println("enter the cnic");
        cnic = sc.next();
        System.out.println("enter address");
        address = sc.next();
        System.out.println("enter occupation");
        occupation = sc.next();
        System.out.println("enter licenseNo");
        licenseNo = sc.next();
        System.out.println("enter date of birth(yyyy-mm-dd)");
        dateOfBirth = Date.valueOf(sc.next());
    }
    public void inputForUpdate(Scanner sc) {
        System.out.println("enter the id of customer that you want to update data");
        customer_ID = sc.nextInt();
        System.out.println("enter the customer name");
        name = sc.next();
        System.out.println("enter gender");
        Gender = sc.next();
        System.out.println("enter the cnic");
        cnic = sc.next();
        System.out.println("enter address");
        address = sc.next();
        System.out.println("enter occupation");
        occupation = sc.next();
        System.out.println("enter licenseNo");
        licenseNo = sc.next();
        System.out.println("enter date of birth(yyyy-mm-dd)");
        dateOfBirth = Date.valueOf(sc.next());
    }
    public void inputID(Scanner sc) {
        System.out.println("enter the id of customer that you want to see data");
        customer_ID = sc.nextInt();
    }
}