public class Employee {
    private String name, patronymic, lastName;
    private int department;
    private int salary = 0;
    private final int id;
    private static int count = 1;

    public Employee(String lastName, String name, String patronymic, int department, int salary) {
        this.name = name;
        this.patronymic = patronymic;
        this.lastName = lastName;
        this.department = department;
        this.salary = salary;
        this.id = count++;
    }

    public String getName() {
        return name;
    }

    public String getPatronymic() {
        return patronymic;
    }

    public String getLastName() {
        return lastName;
    }

    public int getDepartment() {
        return department;
    }

    public int getSalary() {
        return salary;
    }

    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", patronymic='" + patronymic + '\'' +
                ", lastName='" + lastName + '\'' +
                ", department=" + department +
                ", salary=" + salary +
                ", id=" + id +
                '}';
    }
}
