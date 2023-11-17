import java.sql.*;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        boolean exit = false;
        Scanner sc=new Scanner(System.in);
        Connection conn = null;
        try {
            String dbURL = "jdbc:sqlserver://HASSAN_RAZA\\SQLEXPRESS;databaseName=rentacar;user=sa;password=123;encrypt=false;";
            conn = DriverManager.getConnection(dbURL);
// Above Code will connect to SQL Server
            String qry;
            Vehicle vehicle=new Vehicle();
            Guarantor guarantor=new Guarantor();
            Owner owner=new Owner();
            Customer customer=new Customer();
            Driver driver=new Driver();
            Insurance insurance=new Insurance();
            Route route=new Route();
            if (conn != null) {
                while (!exit) {
                    System.out.println("Rent-A-Car System");
                    System.out.println("1. FOR VEHICLE");
                    System.out.println("2. FOR OWNER");
                    System.out.println("3. FOR CUSTOMER");
                    System.out.println("4. FOR DRIVER");
                    System.out.println("5. FOR INSURANCE");
                    System.out.println("6. FOR ROUTE");
                    System.out.println("7. FOR GUARANTOR");
                    System.out.println("0. EXIT");
                    System.out.print("Enter your choice: ");
                    int choice= sc.nextInt();
                    switch (choice){
                        case 1:
                            System.out.println("1. Add vehicle");
                            System.out.println("2. See all vehicle");
                            System.out.println("3. Update vehicle");
                            System.out.println("4. See vehicle by ID");
                            System.out.println("0. Exit");
                            System.out.print("Enter your choice: ");
                            choice= sc.nextInt();
                            switch (choice) {
                                case 1:
                                    vehicle.input(sc);
                                    qry = "INSERT INTO Vehicle values ('"+vehicle.getVehicle_ID()+"','"+vehicle.getCarBrand()+"','" + vehicle.getDescription()+"','"+ vehicle.getCarModel()+"','"+
                                    vehicle.getCapacity()+"','"+vehicle.getOwnername()+"','"+vehicle.getRating() +"','"+vehicle.getEngineNo()+"','"+vehicle.getChasisNo()+"','"+ vehicle.getCondition()+"','"+ vehicle.getOwner_ID()+"','"+vehicle.getCustomer_ID()+"')";
                                    Statement statement = conn.createStatement();
                                    int rows = statement.executeUpdate(qry);
                                    if(rows>0)
                                        System.out.println("Data Inserted Successfully");
                                    else
                                        System.out.println("Error Inserting Data");
                                    break;
                                case 2:
                                    qry = "select * from vehicle";
                                    statement = conn.createStatement();
                                    ResultSet result = statement.executeQuery(qry);
                                    while (result.next()) {
                                        int column1 = result.getInt("vehicle_ID");
                                        String column2 = result.getString("carbrand");
                                        String column3=result.getString("description");
                                        String column4=result.getString("carmodel");
                                        int column5=result.getInt("capacity");
                                        String column6=result.getString("ownername");
                                        float column7=result.getFloat("ratings");
                                        String column8=result.getString("engineno");
                                        String column9=result.getString("chassisno");
                                        String column10=result.getString("condition");
                                        int column11=result.getInt("owner_id");
                                        int column12=result.getInt("customer_id");
                                        System.out.println("Vehicle_ID: " + column1);
                                        System.out.println("Car Brand: " + column2);
                                        System.out.println("Description: " + column3);
                                        System.out.println("Car Model: " + column4);
                                        System.out.println("Capacity: " + column5);
                                        System.out.println("Owner Name: " + column6);
                                        System.out.println("Ratings: " + column7);
                                        System.out.println("Engine No: " + column8);
                                        System.out.println("Chassis No: " + column9);
                                        System.out.println("Condition: " + column10);
                                        System.out.println("Owner_ID: " + column11);
                                        System.out.println("Customer_ID: " + column12);
                                    }
                                    break;
                                case 3:
                                    vehicle.inputForUpdate(sc);
                                    qry = "UPDATE Vehicle SET carbrand='"+vehicle.getCarBrand()+"',description='" +
                                            vehicle.getDescription()+"',carmodel='"+ vehicle.getCarModel()+"',capacity='"+
                                            vehicle.getCapacity()+"',ownername='"+vehicle.getOwnername()+"',ratings='"+vehicle.getRating()
                                            +"',engineno='"+vehicle.getEngineNo()+"',chassisno='"+vehicle.getChasisNo()+"',condition='"+
                                            vehicle.getCondition()+"',owner_id='"+ vehicle.getOwner_ID()+"',customer_id='"+vehicle.getCustomer_ID()+"'where vehicle_id='"+vehicle.getVehicle_ID()+"'";
                                    statement = conn.createStatement();
                                    rows = statement.executeUpdate(qry);
                                    if(rows>0)
                                        System.out.println("Data Updated Successfully");
                                    else
                                        System.out.println("Error Updated Data");
                                    break;
                                case 4:
                                    vehicle.inputId(sc);
                                    qry = "select * from vehicle where vehicle_id='"+vehicle.getVehicle_ID()+"'";
                                    statement = conn.createStatement();
                                    result = statement.executeQuery(qry);
                                    while (result.next()) {
                                        int column1 = result.getInt("vehicle_ID");
                                        String column2 = result.getString("carbrand");
                                        String column3=result.getString("description");
                                        String column4=result.getString("carmodel");
                                        int column5=result.getInt("capacity");
                                        String column6=result.getString("ownername");
                                        float column7=result.getFloat("ratings");
                                        String column8=result.getString("engineno");
                                        String column9=result.getString("chassisno");
                                        String column10=result.getString("condition");
                                        int column11=result.getInt("owner_id");
                                        int column12=result.getInt("customer_id");
                                        System.out.println("Vehicle_ID: " + column1);
                                        System.out.println("Car Brand: " + column2);
                                        System.out.println("Description: " + column3);
                                        System.out.println("Car Model: " + column4);
                                        System.out.println("Capacity: " + column5);
                                        System.out.println("Owner Name: " + column6);
                                        System.out.println("Ratings: " + column7);
                                        System.out.println("Engine No: " + column8);
                                        System.out.println("Chassis No: " + column9);
                                        System.out.println("Condition: " + column10);
                                        System.out.println("Owner_ID: " + column11);
                                        System.out.println("Customer_ID: " + column12);
                                    }
                                    break;
                                case 0:
                                    System.out.println("Exiting...");
                                    break;
                                default:
                                    System.out.println("Invalid choice!");
                            }
                            break;
                        case 2:
                            System.out.println("1. Add owner");
                            System.out.println("2. See all owners data");
                            System.out.println("3. Update owner");
                            System.out.println("4. See owner by ID");
                            System.out.println("0. Exit");
                            System.out.print("Enter your choice: ");
                            choice= sc.nextInt();
                            switch (choice) {
                                case 1:
                                    owner.input(sc);
                                    qry = "INSERT INTO owner values ('"+owner.getOwner_ID()+"','"+owner.getName()+"','"+
                                            owner.getGender() +"','"+ owner.getCnic()+"','"+ owner.getAddress()+"','"+owner.getOccupation()+"','"+owner.getNoOfVehicle()+" ')";
                                    Statement statement = conn.createStatement();
                                    int rows = statement.executeUpdate(qry);
                                    if(rows>0)
                                        System.out.println("Data Inserted Successfully");
                                    else
                                        System.out.println("Error Inserting Data");
                                    break;
                                case 2:
                                    //seeOwner();
                                    qry = "select * from owner";
                                    statement = conn.createStatement();
                                    ResultSet result = statement.executeQuery(qry);
                                    while (result.next()) {
                                        int column1 = result.getInt("owner_ID");
                                        String column2 = result.getString("name");
                                        String column3=result.getString("Gender");
                                        String column4=result.getString("cnic");
                                        String column5=result.getString("address");
                                        String column6=result.getString("occupation");
                                        int column11=result.getInt("numberofvehicle");
                                        System.out.println("Owner_ID: " + column1);
                                        System.out.println("Name: " + column2);
                                        System.out.println("Gender: " + column3);
                                        System.out.println("CNIC: " + column4);
                                        System.out.println("Address: " + column5);
                                        System.out.println("Occupation: " + column6);
                                        System.out.println("Number Of Vehicles: " + column11);
                                    }
                                    break;
                                case 3:
                                    owner.inputForUpdate(sc);
                                    qry = "UPDATE owner SET name='"+owner.getName()+"',gender='" + owner.getGender()+"',cnic='"+
                                            owner.getCnic()+"',address='"+
                                            owner.getAddress()+"',occupation='"+owner.getOccupation()+"',numbersofvehicle='"+owner.getNoOfVehicle() +"' where owner_id='"+owner.getOwner_ID()+"'";
                                    statement = conn.createStatement();
                                    rows = statement.executeUpdate(qry);
                                    if(rows>0)
                                        System.out.println("Data Updated Successfully");
                                    else
                                        System.out.println("Error Updated Data");
                                    break;
                                case 4:
                                    owner.inputID(sc);
                                    qry = "select * from owner where owner_ID='"+owner.getOwner_ID()+"'";
                                    statement = conn.createStatement();
                                    result = statement.executeQuery(qry);
                                    while (result.next()) {
                                        int column1 = result.getInt("owner_ID");
                                        String column2 = result.getString("name");
                                        String column3=result.getString("Gender");
                                        String column4=result.getString("cnic");
                                        String column5=result.getString("address");
                                        String column6=result.getString("occupation");
                                        int column11=result.getInt("numberofvehicle");
                                        System.out.println("Owner_ID: " + column1);
                                        System.out.println("Name: " + column2);
                                        System.out.println("Gender: " + column3);
                                        System.out.println("CNIC: " + column4);
                                        System.out.println("Address: " + column5);
                                        System.out.println("Occupation: " + column6);
                                        System.out.println("Number Of Vehicles: " + column11);
                                    }
                                    break;
                                case 0:
                                    System.out.println("Exiting...");
                                    break;
                                default:
                                    System.out.println("Invalid choice!");
                            }
                            break;
                        case 3:
                            System.out.println("1. Add customer");
                            System.out.println("2. See all customers data");
                            System.out.println("3. Update customer");
                            System.out.println("4. See customers data using ID");
                            System.out.println("0. Exit");
                            System.out.print("Enter your choice: ");
                            choice= sc.nextInt();
                            switch (choice){
                                case 1:
                                    customer.input(sc);
                                    qry = "INSERT INTO customer values ('"+customer.getCustomer_ID()+"','"+customer.getName()+"','"+ customer.getCnic()+"','" +
                                    customer.getAddress()+"','"+customer.getDateOfBirth()+"','"+customer.getLicenseNo()+"','"+customer.getOccupation()+"','"+customer
                                            .getGender()+"')";
                                    Statement statement = conn.createStatement();
                                    int rows = statement.executeUpdate(qry);
                                    if(rows>0)
                                        System.out.println("Data Inserted Successfully");
                                    else
                                        System.out.println("Error Inserting Data");
                                    break;
                                case 2:
                                    qry = "select * from customer";
                                    statement = conn.createStatement();
                                    ResultSet result = statement.executeQuery(qry);
                                    while (result.next()) {
                                        int column1 = result.getInt("customer_ID");
                                        String column2 = result.getString("name");
                                        String column3=result.getString("Gender");
                                        String column4=result.getString("cnic");
                                        String column5=result.getString("address");
                                        String column6=result.getString("DOB");
                                        String column11=result.getString("occupation");
                                        String column12=result.getString("licenseno");
                                        System.out.println("Customer_ID: " + column1);
                                        System.out.println("Name: " + column2);
                                        System.out.println("Gender: " + column3);
                                        System.out.println("CNIC: " + column4);
                                        System.out.println("Address: " + column5);
                                        System.out.println("Date of Birth: " + column6);
                                        System.out.println("Occupation: " + column11);
                                        System.out.println("License No: " + column12);
                                    }
                                    break;
                                case 3:
                                    customer.inputForUpdate(sc);
                                    qry = "UPDATE customer SET name='"+customer.getName()+"',gender='" +
                                            customer.getGender()+"',cnic='"+ customer.getCnic()+"',address='"+
                                            customer.getAddress()+"',occupation='"+customer.getOccupation()+"',licenseNo='"+customer.getLicenseNo()+"',DOB='"+customer.getDateOfBirth()+"' where customer_id='"+customer.getCustomer_ID()+"'";
                                    statement = conn.createStatement();
                                    rows = statement.executeUpdate(qry);
                                    if(rows>0)
                                        System.out.println("Data Updated Successfully");
                                    else
                                        System.out.println("Error Updated Data");
                                    break;
                                case 4:
                                    customer.inputID(sc);
                                    qry = "select * from customer where customer_id='"+customer.getCustomer_ID()+"'";
                                    statement = conn.createStatement();
                                    result = statement.executeQuery(qry);
                                    while (result.next()) {
                                        int column1 = result.getInt("customer_ID");
                                        String column2 = result.getString("name");
                                        String column3=result.getString("Gender");
                                        String column4=result.getString("cnic");
                                        String column5=result.getString("address");
                                        String column6=result.getString("DOB");
                                        String column11=result.getString("occupation");
                                        String column12=result.getString("licenseno");
                                        System.out.println("Customer_ID: " + column1);
                                        System.out.println("Name: " + column2);
                                        System.out.println("Gender: " + column3);
                                        System.out.println("CNIC: " + column4);
                                        System.out.println("Address: " + column5);
                                        System.out.println("Date of Birth: " + column6);
                                        System.out.println("Occupation: " + column11);
                                        System.out.println("License No: " + column12);
                                    }
                                    break;
                                case 0:
                                    System.out.println(".....exiting");
                                    break;
                                default:
                                    System.out.println("Invalid choice");
                            }
                            break;
                        case 4:
                            System.out.println("1. Add driver");
                            System.out.println("2. See all drivers data");
                            System.out.println("3. Update driver");
                            System.out.println("4. See drivers data by ID");
                            System.out.println("0. Exit");
                            System.out.print("Enter your choice: ");
                            choice= sc.nextInt();
                            switch (choice){
                                case 1:
                                    driver.input(sc);
                                    qry = "INSERT INTO driver values ('"+driver.getDriver_ID()+"','"+driver.getName()+"','"+
                                            driver.getAddress()+"','"+ driver.getYearOfExp()+"','"+
                                            driver.getLicenseNo()+"','"+driver.getGender()+"','"+driver.getDateOfBirth()+ "','"+driver.getOwner_ID()+"')";
                                    Statement statement = conn.createStatement();
                                    int rows = statement.executeUpdate(qry);
                                    if(rows>0)
                                        System.out.println("Data Inserted Successfully");
                                    else
                                        System.out.println("Error Inserting Data");
                                    break;
                                case 2:
                                    qry = "select * from driver";
                                    statement = conn.createStatement();
                                    ResultSet result = statement.executeQuery(qry);
                                    while (result.next()) {
                                        int column1 = result.getInt("driver_ID");
                                        String column2 = result.getString("name");
                                        String column3=result.getString("Gender");
                                        int column4=result.getInt("owner_id");
                                        String column5=result.getString("address");
                                        String column6=result.getString("DOB");
                                        String column11=result.getString("yearofexp");
                                        String column12=result.getString("licenseno");
                                        System.out.println("Driver_ID: " + column1);
                                        System.out.println("Name: " + column2);
                                        System.out.println("Gender: " + column3);
                                        System.out.println("Owner_ID: " + column4);
                                        System.out.println("Address: " + column5);
                                        System.out.println("Date of Birth: " + column6);
                                        System.out.println("Year Of Experence: " + column11);
                                        System.out.println("license NO: " + column12);
                                    }
                                    break;
                                case 3:
                                    driver.inputForUpdate(sc);
                                    qry = "UPDATE customer SET name='"+driver.getName()+"',gender='" +
                                            driver.getGender()+"',Owner_id='"+ driver.getOwner_ID()+"',address='"+
                                            driver.getAddress()+"',occupation='"+driver.getYearOfExp()+"',licenseNo='"+driver.getLicenseNo()+"',DOB='"+driver.getDateOfBirth(
                                    )+"' where driver_id='"+driver.getDriver_ID()+"'";
                                    statement = conn.createStatement();
                                    rows = statement.executeUpdate(qry);
                                    if(rows>0)
                                        System.out.println("Data Updated Successfully");
                                    else
                                        System.out.println("Error Updated Data");
                                    break;
                                case 4:
                                    driver.inputID(sc);
                                    qry = "select * from driver where driver_id='"+driver.getDriver_ID()+"'";
                                    statement = conn.createStatement();
                                    result = statement.executeQuery(qry);
                                    while (result.next()) {
                                        int column1 = result.getInt("driver_ID");
                                        String column2 = result.getString("name");
                                        String column3=result.getString("Gender");
                                        int column4=result.getInt("owner_id");
                                        String column5=result.getString("address");
                                        String column6=result.getString("DOB");
                                        String column11=result.getString("yearofexp");
                                        String column12=result.getString("licenseno");
                                        System.out.println("Driver_ID: " + column1);
                                        System.out.println("Name: " + column2);
                                        System.out.println("Gender: " + column3);
                                        System.out.println("Owner_ID: " + column4);
                                        System.out.println("Address: " + column5);
                                        System.out.println("Date of Birth: " + column6);
                                        System.out.println("Year Of Experence: " + column11);
                                        System.out.println("license NO: " + column12);
                                    }
                                    break;
                                case 0:
                                    System.out.println(".....exiting");
                                    break;
                                default:
                                    System.out.println("Invalid choice");
                            }
                            break;
                        case 5:
                            System.out.println("1. Add insurance");
                            System.out.println("2. See all insurances data");
                            System.out.println("3. Update insurance");
                            System.out.println("4. See insurance data by ID");
                            System.out.println("0. Exit");
                            System.out.print("Enter your choice: ");
                            choice= sc.nextInt();
                            switch (choice){
                                case 1:
                                    insurance.input(sc);
                                    qry = "INSERT INTO Insurance values ('"+insurance.getInsurance_ID()+"','"+insurance.getTypeOfInsurance()+"','"+
                                    insurance.getStarting_Date()+"','"+ insurance.getEnding_Date()+"','"+
                                            insurance.getAmount()+"','"+insurance.getTypeOfVehicle()+"','"+insurance.getInsurance_ID()+"')";
                                    Statement statement =
                                            conn.createStatement();
                                    int rows = statement.executeUpdate(qry);
                                    if(rows>0)
                                        System.out.println("Data Inserted Successfully");
                                    else
                                        System.out.println("Error Inserting Data");
                                    break;
                                case 2:
                                    qry = "select * from insurance";
                                    statement = conn.createStatement();
                                    ResultSet result = statement.executeQuery(qry);
                                    while (result.next()) {
                                        int column1 = result.getInt("insurance_ID");
                                        String column2 = result.getString("typeofinsurance");
                                        String column3=result.getString("Starting_Date");
                                        String column4=result.getString("Ending_date");
                                        double column5=result.getDouble("amount");
                                        String column6=result.getString("typeofvehicle");
                                        int column11=result.getInt("vehicle_id");
                                        String column12=result.getString("licenseno");
                                        System.out.println("Insurance_ID: " + column1);
                                        System.out.println("Type of Insurance: " + column2);
                                        System.out.println("Starting_Date: " + column3);
                                        System.out.println("Ending_date: " + column4);
                                        System.out.println("Amount of Insurance: " + column5);
                                        System.out.println("Type of Vehicle: " + column6);
                                        System.out.println("Vehicle_id: " + column11);
                                        System.out.println("License No: " + column12);
                                    }
                                    break;
                                case 3:
                                    insurance.inputForUpdate(sc);
                                    qry = "UPDATE insurance SET typeofinsurance='"+insurance.getTypeOfInsurance()+"',starting_date='" + insurance.getStarting_Date()+"',ending_date='"+
                                    insurance.getEnding_Date()+"',amount='"+
                                            insurance.getAmount()+"',typeofvehicle='"+insurance.getTypeOfVehicle()+"',vehicle_id='"+insurance.getVehicle_ID()+"' where insurance_id='"+insurance.getInsurance_ID()+"'";
                                    statement = conn.createStatement();
                                    rows = statement.executeUpdate(qry);
                                    if(rows>0)
                                        System.out.println("Data Updated Successfully");
                                    else
                                        System.out.println("Error Updated Data");
                                    break;
                                case 4:
                                    insurance.inputID(sc);
                                    qry = "select * from insurance where insurance_id='"+insurance.getInsurance_ID()+"'";
                                    statement = conn.createStatement();
                                    result = statement.executeQuery(qry);
                                    while (result.next()) {
                                        int column1 = result.getInt("insurance_ID");
                                        String column2 = result.getString("typeofinsurance");
                                        String column3=result.getString("Starting_Date");
                                        String column4=result.getString("Ending_date");
                                        double column5=result.getDouble("amount");
                                        String column6=result.getString("typeofvehicle");
                                        int column11=result.getInt("vehicle_id");
                                        String column12=result.getString("licenseno");
                                        System.out.println("Insurance_ID: " + column1);
                                        System.out.println("Type of Insurance: " + column2);
                                        System.out.println("Starting_Date: " + column3);
                                        System.out.println("Ending_date: " + column4);
                                        System.out.println("Amount of Insurance: " + column5);
                                        System.out.println("Type of Vehicle: " + column6);
                                        System.out.println("Vehicle_id: " + column11);
                                        System.out.println("License No: " + column12);
                                    }
                                    break;
                                case 0:
                                    System.out.println(".....exiting");
                                    break;
                                default:
                                    System.out.println("Invalid choice");
                            }
                            break;
                        case 6:
                            System.out.println("1. Add route");
                            System.out.println("2. See route");
                            System.out.println("3. Update route");
                            System.out.println("4. SEE ROUTE BY USER ID");
                            System.out.println("0. Exit");
                            System.out.print("Enter your choice: ");
                            choice= sc.nextInt();
                            switch (choice){
                                case 1:
                                    route.input(sc);
                                    qry = "INSERT INTO route values ('"+route.getLocation()+"','"+route.getDistance()+"','"+
                                            route.getVehicle_ID()+"')";
                                    Statement statement = conn.createStatement();
                                    int rows = statement.executeUpdate(qry);
                                    if(rows>0)
                                        System.out.println("Data Inserted Successfully");
                                    else
                                        System.out.println("Error Inserting Data");
                                    break;
                                case 2:
                                    qry = "select * from route";
                                    statement = conn.createStatement();
                                    ResultSet result = statement.executeQuery(qry);
                                    while (result.next()) {
                                        String column1 = result.getString("location");
                                        double column2 = result.getDouble("distance");
                                        System.out.println("Location: " + column1);
                                        System.out.println("Distance: " + column2);
                                    }
                                    break;
                                case 3:
                                    break;
                                case 4:
                                    route.inputID(sc);
                                    qry = "select * from route where='"+route.getVehicle_ID()+"'";
                                    statement = conn.createStatement();
                                    result = statement.executeQuery(qry);
                                    while (result.next()) {
                                        String column1 = result.getString("location");
                                        double column2 = result.getDouble("distance");
                                        System.out.println("Location: " + column1);
                                        System.out.println("Distance: " + column2);
                                    }
                                    break;
                                case 0:
                                    System.out.println(".....exiting");
                                    break;
                                default:
                                    System.out.println("Invalid choice");
                            }
                            break;
                        case 7:
                            System.out.println("1. Add GUARANTOR");
                            System.out.println("2. See all Guarantor data");
                            System.out.println("3. Update Guarantor");
                            System.out.println("4. See Guarantor data by ID");
                            System.out.println("0. Exit");
                            System.out.print("Enter your choice: ");
                            choice= sc.nextInt();
                            switch (choice){
                                case 1:
                                    guarantor.input(sc);
                                    qry = "INSERT INTO Guarantor values ('"+guarantor.getGuarantor_ID()+"','"+guarantor.getName()+"','"+ guarantor.getCnic()+"','"+ guarantor.getDateOfBirth()+"','"
                                            +guarantor.getCustomer_ID()+"','"+guarantor.getGender()+"','"+guarantor.getAddress()+"')";
                                    Statement statement = conn.createStatement();
                                    int rows = statement.executeUpdate(qry);
                                    if(rows>0)
                                        System.out.println("Data Inserted Successfully");
                                    else
                                        System.out.println("Error Inserting Data");
                                    break;
                                case 2:
                                    qry = "select * from guarantor";
                                    statement = conn.createStatement();
                                    ResultSet result = statement.executeQuery(qry);
                                    while (result.next()) {
                                        int column1 = result.getInt("guarantor_ID");
                                        String column2 = result.getString("name");
                                        String column3=result.getString("Gender");
                                        String column4=result.getString("cnic");
                                        String column5=result.getString("address");
                                        String column6=result.getString("DOB");
                                        String column11=result.getString("customer_id");
                                        System.out.println("Guarantor_ID: " + column1);
                                        System.out.println("Name: " + column2);
                                        System.out.println("Gender: " + column3);
                                        System.out.println("CNIC: " + column4);
                                        System.out.println("Address: " + column5);
                                        System.out.println("Date of Birth: " + column6);
                                        System.out.println("Customer_ID: " + column11);
                                    }
                                    break;
                                case 3:
                                    guarantor.inputForUpdate(sc);
                                    qry = "UPDATE customer SET name='"+guarantor.getName()+"',gender='" +
                                            guarantor.getGender()+"',cnic='"+ guarantor.getCnic()+"',address='"+
                                            guarantor.getAddress()+"',customer_id='"+guarantor.getCustomer_ID()+"',DOB='"+guarantor.getDateOfBirth()+"' where guarantor_id='"+guarantor.getCustomer_ID()+"'";
                                    statement = conn.createStatement();
                                    rows = statement.executeUpdate(qry);
                                    if(rows>0)
                                        System.out.println("Data Updated Successfully");
                                    else
                                        System.out.println("Error Updated Data");
                                    break;
                                case 4:
                                    guarantor.inputID(sc);
                                    qry = "select * from guarantor";
                                    statement = conn.createStatement();
                                    result = statement.executeQuery(qry);
                                    while (result.next()){
                                        int column1 = result.getInt("guarantor_ID");
                                        String column2 = result.getString("name");
                                        String column3 = result.getString("Gender");
                                        String column4 = result.getString("cnic");
                                        String column5 = result.getString("address");
                                        String column6 = result.getString("DOB");
                                        String column11 = result.getString("customer_id");
                                        System.out.println("Guarantor_ID: " + column1);
                                        System.out.println("Name: " + column2);
                                        System.out.println("Gender: " + column3);
                                        System.out.println("CNIC: " + column4);
                                        System.out.println("Address: " + column5);
                                        System.out.println("Date of Birth: " + column6);
                                        System.out.println("Customer_ID: " + column11);
                                    }
                                    break;
                                case 0:
                                    System.out.println(".....exiting");
                                    break;
                                default:
                                    System.out.println("Invalid choice");
                            }
                            break;
                        case 0:
                            exit=true;
                            break;
                        default:
                            System.out.println("Invalid choice!");
                    }
                }
                System.out.println("==========================Thanks==========================");
            }//try body
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }// catch body
    }
}
