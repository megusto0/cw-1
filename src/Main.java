public class Main {
    private static final Employee[] employees = new Employee[10];
    public static void main(String[] args) {
        Employee employee1 = new Employee("Иванов", "Иван", "Иванович", 2, 34567);
        Employee employee2 = new Employee("Иванов", "Александр", "Александрович", 1, 56789);

        employees[0] = employee1;
        employees[1] = employee2;

        printEmployees();
        System.out.println(totalSalary());
        printEmployeesNames();

        Employee poor = minimalSalaryEmployee();
        System.out.println(poor.getSalary());
        System.out.println(averageSalary());

    }

    public static void printEmployees() {
        for (Employee employee: employees) {
            if (employee != null) System.out.println(employee);
        }
    }

    public static int totalSalary() {
        int total = 0;
        for (Employee employee: employees) {
            if (employee != null) total += employee.getSalary();
        }
        return total;
    }

    public static Employee minimalSalaryEmployee() {
        Employee minimal = employees[0];
        int minSalary = employees[0].getSalary();
        for (Employee employee: employees) {
            if (employee != null)
                if (minSalary > employee.getSalary()) {
                    minSalary = employee.getSalary();
                    minimal = employee;
                }
        }
        return minimal;
    }

    public static Employee maximalSalaryEmployee() {
        Employee maximal = employees[0];
        int maxSalary = employees[0].getSalary();
        for (Employee employee: employees) {
            if (employee != null)
                if (maxSalary < employee.getSalary()) {
                    maxSalary = employee.getSalary();
                    maximal = employee;
                }
        }
        return maximal;
    }

    public static void printEmployeesNames() {
        for (Employee employee: employees) {
            if (employee != null) System.out.println(employee.getMiddleName() + " " + employee.getName() + " " + employee.getLastName());
        }
    }

    public static int averageSalary() {
        int numberOfEmployees = 0;
        for (Employee employee: employees) {
            if (employee != null) numberOfEmployees++;
        }
        return totalSalary() / numberOfEmployees;
    }
}