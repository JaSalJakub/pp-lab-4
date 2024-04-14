import employees.Employee;
import employees.Worker;
import employees.Manager;


public class Company {
    public static void main(String[] args) {
        Employee[] employees = new Employee[5];

        employees[0] = new Manager("Michael Scott", 30000, 0);
        employees[1] = new Worker("Dwight Schrute", 25000, "Trader");
        employees[2] = new Employee("Jim Halpert", 25000);
        employees[3] = new Employee("Pamela Beesly", 20000);
        employees[4] = new Worker("Andy Bernard", 15000, "Trader");

        System.out.println("Dane pracownika o indeksie 3:");
        System.out.println(employees[3]);

        employees[3].setSalary(25000);

        System.out.println("\nDane wszystkich pracowników:");
        for (Employee employee : employees) {
            System.out.println(employee);
        }
    }
}