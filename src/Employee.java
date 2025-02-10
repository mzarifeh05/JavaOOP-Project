import java.util.*;

public class Employee 
{
    Scanner in = new Scanner(System.in);
    protected int age;
    protected String id;
    protected String name;
    protected double salary;
    protected String nationality;
    protected String dateOfBirth;
    static int counter = 0;

    public Employee() 
    {
        this.age = 0;
        this.id= "XXXXXXXXXX";
        this.name = "Unknown";
        this.nationality = "Unknown";
        this.dateOfBirth = "XX-XX-XXXX";
        counter++;
    }
    public Employee(int age, String id, String name, String nationality, String dateOfBirth) 
    {
        setAge(age);
        setId(id);
        setName(name);
        setNationality(nationality);
        setDateOfBirth(dateOfBirth);
        counter++;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        if (age >= 18 && age <= 45)
            this.age = age;
        else
        {
            System.out.println("Please enter a vaild number");
            setAge(in.nextInt());
        }
    }
    public String getId() {
        return id;
    }
    public void setId(String id) {
        if (id.length() == 10)
            this.id = id;
        else
        {
            System.out.println("Enter a valid ID");
            setId(in.next());
        }
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        if (name.length() >= 3 && name.length() <= 15)
            this.name = name;
        else
        {
            System.out.println("Enter a valid Name");
            setId(in.next());
        }
    }
    public String getNationality() {
        return nationality;
    }
    public void setNationality(String nationality) {
        if (nationality.length() >= 3 && nationality.length() <= 15)
            this.nationality = nationality;
        else
        {
            System.out.println("Enter a valid Nationality");
            setId(in.next());
        }
    }
    public String getDateOfBirth() {
        return dateOfBirth;
    }
    public void setDateOfBirth(String dateOfBirth) {
        //00-00-0000
        if (dateOfBirth.length() >= 10)
        {
            if (dateOfBirth.charAt(2)=='-' && dateOfBirth.charAt(5)=='-')
                this.dateOfBirth = dateOfBirth;
            else
            {
                System.out.println("Please enter the date of birth as follow:\nDay-Month-Year\nEX: 01-02-2001");
                setDateOfBirth(in.next());
            }
        }
        else
        {
            System.out.println("Please enter the date of birth as follow:\nDay-Month-Year\nEX: 01-02-2001");
            setDateOfBirth(in.next());
        }
    }
    public double getSalary(Employee employee) {
        if (employee.name.equalsIgnoreCase("unknown"))
            System.out.println("This employee does not entered his data correctly");
        else
            return 1000;
        return 0;
    }
    public void displayData(){
        System.out.println("***********************************");
        System.out.println("This personal info for employee " + counter + ":");
        System.out.println("Name: " + getName());
        System.out.println("ID: " + getId());
        System.out.println("Age: " + getAge());
        System.out.println("Date of birth: " + getDateOfBirth());
        System.out.println("Nationality: " + getNationality());
        System.out.println("***********************************");
    }
}