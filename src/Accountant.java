import java.util.*;

public class Accountant extends  Employee
{
    Scanner in = new Scanner(System.in);
    private String certifications;
    private double companyBudget;
    private double totalTaxesCalculated;
    public Accountant() {
        this.certifications = "None";
        this.companyBudget = 0;
        this.totalTaxesCalculated = 0;
    }
    public Accountant(int age, String id, String name, String nationality, String dateOfBirth, String certifications,
            double companyBudget, double totalTaxesCalculated) {
        super(age, id, name, nationality, dateOfBirth);
        this.certifications = certifications;
        this.companyBudget = companyBudget;
        this.totalTaxesCalculated = totalTaxesCalculated;
    }
    public String getCertifications() {
        return certifications;
    }
    public void setCertifications(String certifications) {
        if (!certifications.isEmpty())
        {
            if (certifications.equals("CPA") || certifications.equals("CMA"))
            {
                this.certifications = certifications;
                salary += 500;
            }
            else
                this.certifications = certifications;
        }
        else
        {
            System.out.println("Please enter your cerificate");
            setCertifications(in.next());
        }
    }
    public double getCompanyBudget() {
        return companyBudget;
    }
    public void setCompanyBudget(double companyBudget) {
        if (companyBudget >= 0)
            this.companyBudget = companyBudget;
        else
        {
            System.out.println("Please enter a valid number");
            setCompanyBudget(in.nextDouble());
        }
    }
    public double getTotalTaxesCalculated() {
        return totalTaxesCalculated;
    }
    public void setTotalTaxesCalculated(double totalTaxesCalculated) {
        if (totalTaxesCalculated >= 0)
            this.totalTaxesCalculated = totalTaxesCalculated;
        else
        {
            System.out.println("Please enter a valid number");
            setCompanyBudget(in.nextDouble());
        }
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
        System.out.println("Certifications: " + getCertifications());
        System.out.println("Company budget: " + getCompanyBudget());
        System.out.println("Total texes: " + getTotalTaxesCalculated());
        System.out.println("***********************************");
    }

    
}
