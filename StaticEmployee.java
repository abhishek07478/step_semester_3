class Employee {
    // Instance variables
    String empName;
    double salary;

    // Static variables
    static String companyName = "Bright Horizon Technologies";
    static int employeeCount = 0;

    Employee(String empName, double salary) {
        this.empName = empName;
        this.salary = salary;

        employeeCount++;
    }

    
    static void printCompanyInfo() {
        System.out.println(companyName);
        System.out.println("Employees on record: " + employeeCount);
    }
}

public class StaticEmployee{
    public static void main(String[] args) {

        Employee e1 = new Employee("Divya", 65000);
        Employee e2 = new Employee("Arjun", 55000);
        Employee e3 = new Employee("Rahul", 60000);

        Employee.printCompanyInfo();
    }
}