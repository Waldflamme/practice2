package part1.part1_2;

public class EmployeeFixed {
    private String name;
    private int age;
    private double salary;
    private String password;

    public EmployeeFixed(String name, int age, double salary, String password) {
        this.name = name;
        this.age = age;
        this.salary = salary;
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public double getSalary() {
        return salary;
    }


    public String getRole() {
        return "Employee";
    }

    public void promote(double raise) {
        if (raise > 0) {
            this.salary += raise;
        }
    }

    public void printSummary() {
        System.out.println(name + ", " + age + " лет, " + salary + " руб.");
    }

    private boolean validatePassword(String input) {
        return password != null && password.equals(input);
    }

    public boolean authenticate(String input) {
        return validatePassword(input);
    }
}
