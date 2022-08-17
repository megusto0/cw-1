public class Main {
    private static final Employee[] employees = new Employee[10];
    public static void main(String[] args) {
        Employee employee1 = new Employee("Иванов", "Иван", "Иванович", 2, 34567);
        Employee employee2 = new Employee("Попов", "Владимирович", "Иванович", 2, 20567);
        Employee employee3 = new Employee("Смирнов", "Александр", "Александрович", 1, 66789);
        Employee employee4 = new Employee("Иванов", "Александр", "Александрович", 4, 56789);
        Employee employee5 = new Employee("Иванов", "Александр", "Александрович", 3, 86789);
        Employee employee6 = new Employee("Иванов", "Дмитриевич", "Александрович", 2, 56789);
        Employee employee7 = new Employee("Комаров", "Александр", "Александрович", 1, 6789);
        Employee employee8 = new Employee("Николаев", "Александр", "Александрович", 5, 96789);
        Employee employee9 = new Employee("Иванов", "Александр", "Александрович", 2, 16789);
        Employee employee10 = new Employee("Иванов", "Александр", "Александрович", 3, 56789);

        employees[0] = employee1;
        employees[1] = employee2;
        employees[2] = employee3;
        employees[3] = employee4;
        employees[4] = employee5;
        employees[5] = employee6;
        employees[6] = employee7;
        employees[7] = employee8;
        employees[8] = employee9;
        employees[9] = employee10;

        printEmployees();
        System.out.println(totalSalary());
        printEmployeesNames();

        Employee minimalSalary = minimalSalaryEmployee();
        System.out.println("Минимальная зарпалат = " + minimalSalary.getSalary());

        Employee maximalSalary = maximalSalaryEmployee();
        System.out.println("Максимальная зарплата = " + maximalSalary.getSalary());

        System.out.println("Средняя зарпалта = " + averageSalary());

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
            if (employee != null) System.out.println(employee.getLastName() + " " + employee.getName() + " " + employee.getPatronymic());
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