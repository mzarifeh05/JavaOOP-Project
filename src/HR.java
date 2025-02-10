import java.util.*;

public class HR extends Employee
{
    Scanner in = new Scanner(System.in);
    private String phoneNumber;
    private String email;
    private int exYears;
    private ArrayList<Employee> employees = new ArrayList<>();
    public HR() 
    {
        this.phoneNumber = "07XXXXXXXX";
        this.email = "XXXXXX@XXX.com";
        this.exYears = 0;
    }
    public HR(int age, String id, String name, String nationality, String dateOfBirth, String phoneNumber, String email,
            int exYears) {
        super(age, id, name, nationality, dateOfBirth);
        setPhoneNumber(phoneNumber);
        setEmail(email);
        setExYears(exYears);
    }
    public String getPhoneNumber() {
        return phoneNumber;
    }
    public void setPhoneNumber(String phoneNumber) {
        if (phoneNumber.length() == 10)
            this.phoneNumber = phoneNumber;
        else
        {
            System.out.println("Please enter a valid phone number");
            setPhoneNumber(in.next());
        }
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        if (email.endsWith(".com"))
            this.email = email;
        else
        {
            System.out.println("Please enter an valid email address");
            setEmail(in.next());
        }
    }
    public int getExYears() {
        return exYears;
    }
    public void setExYears(int exYears) {
        if (exYears > 0 && exYears < 60)
            this.exYears = exYears;
        else
        {
            System.out.println("Please enter an valid experince years number");
            setExYears(in.nextInt());
        }
    }
    public void hiringEmployees()
    {
        int option = 1;
        int countDevs = 1;
        int countAccs = 1;
        while (option != 0) {
            
            System.out.println("What kind of employees you want to hire");
            System.out.println("1. Developer\n2. Acountant");
            int type = in.nextInt();
            if (type == 1)
            {
                countDevs++;
                System.out.println("***********************************");
                System.out.println("Enter the data for developer " + (countDevs) + ": ");
                System.out.println("Enter the age, id (10 digits), name, nationality,\ndate of birth (as follow: Day-Month-Year\nEx: 01-04-1990)");
                System.out.println("Excperince years, Specialty, Programming Languages");
                employees.add(new Developer(in.nextInt(), in.next(), in.next(), in.next(), in.next(), in.nextInt(), in.next(), in.next()));
                System.out.println("***********************************");
            }
            else if (type == 2)
            {
                countAccs++;
                System.out.println("***********************************");
                System.out.println("Enter the data for accountant " + (countAccs) + ": ");
                System.out.println("Enter the age, id (10 digits), name, nationality,\ndate of birth (as follow: Day-Month-Year\nEx: 01-04-1990)");
                System.out.println("Excperince years, Specialty, Programming Languages");
                employees.add(new Accountant(in.nextInt(), in.next(), in.next(), in.next(), in.next(), in.next(), in.nextDouble(), in.nextDouble()));
                System.out.println("***********************************");
            }
            else
            {
                System.out.println("Please enter a valid number");
                type = in.nextInt();
            }
            System.out.println("If you want to add other employees please enter any number");
            System.out.println("Or enter 0 to exist");
            option = in.nextInt();
        }
        System.out.println("Thank you");
    }
    @Override
    public void displayData()
    {
        System.out.println("***********************************");
        System.out.println("This personal info for HR " + counter + ":");
        System.out.println("Name: " + getName());
        System.out.println("ID: " + getId());
        System.out.println("Age: " + getAge());
        System.out.println("Date of birth: " + getDateOfBirth());
        System.out.println("Nationality: " + getNationality());
        System.out.println("Email address: " + getEmail());
        System.out.println("Phone Number: " + getPhoneNumber());
        System.out.println("Experince years: " + getExYears());
        System.out.println("***********************************");
    }
    
}
