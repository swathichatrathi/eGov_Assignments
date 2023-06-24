public class Main {
    public static void main(String[] args) {
        // Press Alt+Enter with your caret at the highlighted text to see how
        // IntelliJ IDEA suggests fixing it.
        Employee employee1 = new Employee("Swathi", 20000.0000, 5000.0, 19062023);
        employee1.displayTotalSalary();
        employee1.displayEmployeeRole();

        Engineer engineer1 = new Engineer("Roshini", 245000.0000, 5000.0, 20062023, 5000.000);
        engineer1.displayTotalSalary();
        engineer1.displayEmployeeRole();
    }
}
