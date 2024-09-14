class Employee {
    // Private fields to restrict direct access
    private String name;
    private int age;
    private double salary;

    // Constructor
    public Employee(String name, int age, double salary) {
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    // Getter method for name
    public String getName() {
        return name;
    }

    // Setter method for name
    public void setName(String name) {
        this.name = name;
    }
    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    public double getSalary() {
        return salary;
    }
    public void setSalary(double salary) {
        if (salary >= 0) {
            this.salary = salary;
        } else {
            System.out.println("Error: Salary cannot be negative.");
        }
    }

    public void displayEmployeeInfo() {
        System.out.println("Employee Name: " + name);
        System.out.println("Employee Age: " + age);
        System.out.println("Employee Salary: $" + salary);
    }
}

//main class
public class Encapsulation {
    public static void main(String[] args) {
        // Creating an Employee object
        Employee employee = new Employee("Nourose Naim", 25, 15000);

        // Display initial employee details
        employee.displayEmployeeInfo();
        // Modifying employee's salary using the setter
        employee.setSalary(20000);
        // Display updated employee details
        System.out.println("\nAfter Salary Update:");
        employee.displayEmployeeInfo();
        // Attempting to set a negative salary (should give an error)
        System.out.println("\nAttempt to set negative salary:");
        employee.setSalary(-1000);

        // Display employee details after attempt
        employee.displayEmployeeInfo();
    }
}
