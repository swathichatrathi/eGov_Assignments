public class Engineer extends Employee {
    private double benefits;

    public Engineer(String name, double baseSalary, double gratuity, long joiningDate, double benefits) {
        super(name, baseSalary, gratuity, joiningDate);
        this.benefits = benefits;
    }

    @Override
    public void displayTotalSalary() {
        double totalSalary = baseSalary + gratuity + benefits;
        System.out.printf("Total salary is: %f per month\n", totalSalary);
    }

    @Override
    public void displayEmployeeRole() {
        System.out.println("I am an instance of type Engineer, I build stuff!");
    }
}
