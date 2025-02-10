import java.util.*;

public class Main 
{
    static Scanner in = new Scanner(System.in);
    
    public static void hiringEmployees()
    {
        System.out.println("How many employee you want to hire?");
        int n = in.nextInt();
        ArrayList <Employee> employees = new ArrayList<>(n);
        System.out.println();
        for (int i = 0; i < n; i++) 
        {
            System.out.println("***********************************");
            System.out.println("Enter the data for employee " + (i+1) + ": ");
            System.out.println("Enter the age, id (10 digits), name, nationality,\ndate of birth (as follow: Day-Month-Year\nEx: 01-04-1990)");
            employees.add(new Employee(in.nextInt(), in.next(), in.next(), in.next(), in.next()));
            System.out.println("***********************************");
        }
        System.out.println("\n\n\nIf you want to see the data press 1 or press any key to exsit");
        int option = in.nextInt();
        if (option == 1)
            printDataForEmployees(employees);
        else
            System.out.println("Thank you");
    }
    public static void printDataForEmployees(ArrayList <Employee> employees)
    {
        if (employees.size() == 0)
            System.out.println("You have no employees");
        else
        {
            System.out.println("***********************************");
            System.out.println("The company has " + employees.size() + "employees");
            System.out.println("***********************************");
            for (int i = 0; i < employees.size(); i++) {
                System.out.println("The data for employee " + (i+1) + ": ");
                employees.get(i).displayData();
            }
        }
    }

    public static void hiringDevelopers()
    {
        System.out.println("How many developers you want to hire?");
        int n = in.nextInt();
        ArrayList <Developer> developers = new ArrayList<>(n);
        System.out.println();
        for (int i = 0; i < n; i++) 
        {
            System.out.println("***********************************");
            System.out.println("Enter the data for developer " + (i+1) + ": ");
            System.out.println("Enter the age, id (10 digits), name, nationality,\ndate of birth (as follow: Day-Month-Year\nEx: 01-04-1990)");
            System.out.println("Excperince years, Specialty, Programming Languages");
            developers.add(new Developer(in.nextInt(), in.next(), in.next(), in.next(), in.next(), in.nextInt(), in.next(), in.next()));
            System.out.println("***********************************");
        }
        System.out.println("Thank you");
    }
    public static void hiringAcountatns()
    {
        System.out.println("How many accountatns you want to hire?");
        int n = in.nextInt();
        ArrayList <Accountant> accountants = new ArrayList<>(n);
        System.out.println();
        for (int i = 0; i < n; i++) 
        {
            System.out.println("***********************************");
            System.out.println("Enter the data for accountant " + (i+1) + ": ");
            System.out.println("Enter the age, id (10 digits), name, nationality,\ndate of birth (as follow: Day-Month-Year\nEx: 01-04-1990)");
            System.out.println("Excperince years, Specialty, Programming Languages");
            accountants.add(new Accountant(in.nextInt(), in.next(), in.next(), in.next(), in.next(), in.next(), in.nextDouble(), in.nextDouble()));
            System.out.println("***********************************");
        }
        System.out.println("Thank you");
    }
    public static void hiringHRs()
    {
        System.out.println("How many HRs you want to hire?");
        int n = in.nextInt();
        ArrayList <HR> HRs = new ArrayList<>(n);
        System.out.println();
        for (int i = 0; i < n; i++) 
        {
            System.out.println("***********************************");
            System.out.println("Enter the data for HR " + (i+1) + ": ");
            System.out.println("Enter the age, id (10 digits), name, nationality,\ndate of birth (as follow: Day-Month-Year\nEx: 01-04-1990)");
            System.out.println("Phone Number, Email Address, Excperince years");
            HRs.add(new HR(in.nextInt(), in.next(), in.next(), in.next(), in.next(), in.next(), in.next(), in.nextInt()));
            System.out.println("***********************************");
        }
        System.out.println("Thank you");
    }
    public static void hiringEmployeeAsHR()
    {
        System.out.println("***********************************");
        System.out.println("If you want to use this function you should be an HR");
        System.out.println("So please enter your data");
        System.out.println("Enter the age, id (10 digits), name, nationality,\ndate of birth (as follow: Day-Month-Year\nEx: 01-04-1990)");
        System.out.println("Phone Number, Email Address, Excperince years");
        HR hr = new HR(in.nextInt(), in.next(), in.next(), in.next(), in.next(), in.next(), in.next(), in.nextInt());
        System.out.println("***********************************");
        System.out.println("You can now hire an employees");
        hr.hiringEmployees();
    }


    public static void main(String[] args) {
        boolean flag = true;
        int option = 1;
        while (option != 0 ) {
            if (flag)
            {
                System.out.println("***********************************");
                System.out.println("Welcome to our system");
                flag = false;
            }
            System.out.println("Choose the service you want");
            System.out.println("***********************************");
            System.out.println("0. exsit");
            System.out.println("1. Add a general Employee");
            System.out.println("3. Add a Developer");
            System.out.println("2. Add a HR");
            System.out.println("4. Add a Accountant");
            System.out.println("5. Add a employee as a HR");
            System.out.println("***********************************");
            int type = in.nextInt();
            if (type == 0)
            {
                System.out.println("Thank you :)");
                break;
            }
            switch (type) {
                case 1:
                    hiringEmployees();
                    break;
                case 2:
                    hiringDevelopers();
                    break;
                case 3:
                    hiringAcountatns();
                    break;
                case 4:
                    hiringHRs();
                    break;
                case 5:
                    hiringEmployeeAsHR();
                    break;
                default:
                    System.out.println("Please enter a valid number");
                    break;
            }
            System.out.println("If you want to add other employees please enter any number");
            System.out.println("Or enter 0 to exist");
            option = in.nextInt();
        }
        in.close();
    }
}
