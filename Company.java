import employees.Employee;
import employees.Worker;
import employees.Manager;


public class Company {
    public static void main(String[] args) {
        Employee[] employees = new Employee[7];

        employees[0] = new Manager("Michael Scott", 30000, 0);
        employees[1] = new Worker("Dwight Shrute", 25000, "Trader");
        employees[2] = new Employee("Jim Halpert", 25000);
        employees[3] = new Employee("Pamela Beesly", 20000);
        employees[4] = new Worker("Andy Bernard", 15000, "Trader");
        employees[5] = new Manager("Robert California",27500, 0);
        employees[6] = new Worker("Erin Hannon", 10000, "Receptionist");

        for (Employee employee : employees) {
            if (employee instanceof Manager) {
                ((Manager) employee).setNumberOfSubordinates(employees.length - 1);
                employee.setSalary(35000);
            } else {
                double newSalary = employee.getSalary() + 500;
                employee.setSalary(newSalary);
            }
        }
        System.out.println("Zaktualizowane informacje o pracownikach:");
        for (Employee employee : employees) {
            System.out.println(employee);
        }
    }
}