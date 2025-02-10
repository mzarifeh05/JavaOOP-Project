import java.util.*;

public class Project {
    Scanner in = new Scanner(System.in);
    private double cost;
    private int workingDays;
    private String projectName;
    private int workingEmployees;

    public Project() {
        this.cost = 0;
        this.workingDays = 0;
        this.projectName = "Uknown";
        this.workingEmployees = 0;
    }
    public Project(int workingDays, String projectName, int workingEmployees) {
        setProjectCost(workingDays, workingEmployees);
        setWorkingDays(workingDays);
        setProjectName(projectName);
        setWorkingEmployees(workingEmployees);
    }
    public double getProjectCost() {
        return cost;
    }
    public void setProjectCost(int workingDays, int workingEmployees) {
        setWorkingDays(workingDays);
        setWorkingEmployees(workingEmployees);
        double daysPrice = 100 * getWorkingDays();
        double employeesPrice = 50 * getWorkingEmployees();
        this.cost = daysPrice + employeesPrice;
    }
    public void setProjectCost() {
        System.out.println("Please enter the working days on the project");
        setWorkingDays(in.nextInt());
        System.out.println("Please enter how many employee worked on this project");
        setWorkingEmployees(in.nextInt());
        double daysPrice = 100 * getWorkingDays();
        double employeesPrice = 50 * getWorkingEmployees();
        this.cost = daysPrice + employeesPrice;
    }
    public int getWorkingDays() {
        return workingDays;
    }
    public void setWorkingDays(int workingDays) {
        if (workingDays >= 0)
            this.workingDays = workingDays;
        else
        {
            System.out.println("Please enter a valid number");
            setWorkingDays(in.nextInt());
        }
    }
    public String getProjectName() {
        return projectName;
    }
    public void setProjectName(String projectName) {
        if(projectName.length() > 3 && projectName.length() <= 15)
            this.projectName = projectName;
        else
        {
            System.out.println("Please enter a valid name");
            setProjectName(in.next());
        }
    }
    public int getWorkingEmployees() {
        return workingEmployees;
    }
    public void setWorkingEmployees(int workingEmployees) {
        if (workingEmployees >= 0)
            this.workingEmployees = workingEmployees;
        else
        {
            System.out.println("Please enter a valid number");
            setWorkingEmployees(in.nextInt());
        }
    }
    public void displayData()
    {
        System.out.println("***********************************");
        System.out.println("This is the data for projects:");
            System.out.println("Project Name: " + getProjectName());
            System.out.println("Project working days: " + getWorkingDays());
            System.out.println("Number of employees woriking on this projet: " + getWorkingEmployees());
            System.out.println("Project Cost: " + getProjectCost());
            System.out.println("***********************************");
    }
    
}
