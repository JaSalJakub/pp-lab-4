public class Company {
    public static void main(String[] args) {
        Employee[] employees = new Employee[5];

        employees[0] = new Employee("Michael Scott", 30000);
        employees[1] = new Employee("Dwight Schrute", 25000);
        employees[2] = new Employee("Jim Halpert", 25000);
        employees[3] = new Employee("Pamela Beesly", 20000);
        employees[4] = new Employee("Andy Bernard", 15000);

        System.out.println("Dane pracownika o indeksie 3:");
        System.out.println(employees[3]);

        employees[3].setSalary(25000);

        System.out.println("\nDane wszystkich pracowników:");
        for (Employee employee : employees) {
            System.out.println(employee);
        }
    }
}