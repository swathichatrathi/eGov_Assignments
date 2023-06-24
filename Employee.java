public class Employee {
    public String name;
    public double baseSalary;
    public  double gratuity;
    public long joiningDate;

    public Employee(String name, double baseSalary, double gratuity, long joiningDate) {
        this.name = name;
        this.baseSalary = baseSalary;
        this.gratuity = gratuity;
        this.joiningDate = joiningDate;
    }

    public void displayTotalSalary() {
        double totalSalary = baseSalary + gratuity;
        System.out.printf("Total salary is: %f per month\n", totalSalary);
    }

    public void displayEmployeeRole() {
        System.out.println("I am an instance of the type employee, I can do anything!");
    }
}
