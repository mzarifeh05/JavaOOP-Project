import java.util.*;

public class Developer extends Employee
{
    private int exYears;
    private String specialty;
    private String programmingLanguages;
    private ArrayList<Project> projects = new ArrayList<>();
    private char projectLevel;

    public Developer() 
    {
        this.exYears = 0;
        this.specialty = "Not-Specified";
        this.programmingLanguages = "Not-Entered";
    }
    public Developer(int age, String id, String name, String nationality, String dateOfBirth, int exYears,
            String specialty, String programmingLanguages) {
        super(age, id, name, nationality, dateOfBirth);
        setExYears(exYears);
        setSpecialty(specialty);
        setProgrammingLanguages(programmingLanguages);
    }
    public int getExYears() {
        return exYears;
    }
    public void setExYears(int exYears) {
        if (exYears >= 1)
            this.exYears = exYears;
        else
        {
            System.out.println("Please enter a valid number");
            setExYears(in.nextInt());
        }
    }
    public String getSpecialty() {
        return specialty;
    }
    public void setSpecialty(String specialty) {
        if (specialty.length() > 3 && specialty.length() <= 15)
            this.specialty = specialty;
        else
        {
            System.out.println("Please enter an valid entry");
            setSpecialty(in.next());
        }
    }
    public String getProgrammingLanguages() {
        return programmingLanguages;
    }
    public void setProgrammingLanguages(String programmingLanguages) {
        if (programmingLanguages.length() > 3 && programmingLanguages.length() <= 15)
            this.programmingLanguages = programmingLanguages;
        else
        {
            System.out.println("Please enter an valid entry");
            setProgrammingLanguages(in.next());
        }
    }
    public void addProjects(){
        System.out.println("How many project you working on?");
        int n = in.nextInt();
        for (int i = 0; i < n; i++) {
            System.out.println("***********************************");
            System.out.println("Enter the data for project " + (i+1) + ": ");
            System.out.println("Enter the project's name");
            String name = in.next();
            System.out.println("How many days you worked on this project?");
            int days = in.nextInt();
            System.out.println("Enter how many employee working on this project?");
            int employee = in.nextInt();
            Project project = new Project(days, name, employee);
            projects.add(project);
            salary += project.getProjectCost() * 0.1;
        }
    }
    public char projectLevel(double cost) {
        if (cost > 0 && cost <= 5000)
            this.projectLevel = 'S';
        else if (cost > 5000 && cost <= 25000)
            this.projectLevel = 'M';
        else if (cost > 25000 && cost <= 1000000)
            this.projectLevel = 'H';
        else{
            System.out.println("Please enter a value between 0 and 1000000");
            projectLevel(in.nextDouble());
        }
        return this.projectLevel;
    }
    @Override
    public void displayData()
    {
        System.out.println("***********************************");
        System.out.println("This personal info for developer " + counter + ":");
        System.out.println("Name: " + getName());
        System.out.println("ID: " + getId());
        System.out.println("Age: " + getAge());
        System.out.println("Date of birth: " + getDateOfBirth());
        System.out.println("Excperince years: " + getExYears());
        System.out.println("Programming languages used: " + getProgrammingLanguages());
        System.out.println("specialty: " + getSpecialty());
        System.out.println("***********************************");
        System.out.println("This is the data for projects: \n");
        for (int i = 0; i < projects.size(); i++) 
        {
            System.out.println("Data for project " + (i+1) + ": ");
            System.out.println("Project Name: " + projects.get(i).getProjectName());
            System.out.println("Project Cost: " + projects.get(i).getProjectCost());
            System.out.println("Project level: " + projectLevel(projects.get(i).getProjectCost()));
            System.out.println("***********************************");
        }
    }
}