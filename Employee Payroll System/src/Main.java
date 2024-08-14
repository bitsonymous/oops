import java.util.ArrayList;
import java.util.List;

abstract class Employee{
    private String name;
    private int id;

    public Employee(String name, int id){
        this.name = name;
        this.id = id;
    }

    public String getName(){
        return name;
    }
    public int getId(){
        return id;
    }

    public abstract double calculateSalary();

    @Override
    public String toString(){
        return "Employee [name="+name+", id="+id+", salary="+calculateSalary()+"]";
    }


}

class FullTImeEmployee extends Employee{
    private double monthlySalary;
    public FullTImeEmployee(String name, int id, double monthlySalary){
        super(name, id);
        this.monthlySalary = monthlySalary;
    }

    @Override
    public double calculateSalary() {
        return monthlySalary;
    }
}

class PartTimeEmployee extends Employee{
    private int HoursWorked;
    private double HourlyRate;

    public PartTimeEmployee(String name, int id, int HoursWorked, double HourlyRate ){
        super(name, id);
        this.HoursWorked = HoursWorked;
        this.HourlyRate = HourlyRate;
    }

    @Override
    public double calculateSalary(){
        return HourlyRate*HoursWorked;
    }
}

class PayrollSystem{
    private ArrayList<Employee> employeeList;

    public PayrollSystem(){
        employeeList = new ArrayList<>();
    }

    public void addEmployee(Employee employee){
        employeeList.add(employee);
    }

    public void removeEmployee(int id){
        Employee employeeToRemove = null;
        for (Employee employee : employeeList){
            if(employee.getId()==id){
                employeeToRemove = employee;
                break;
            }
        }
        if(employeeToRemove!=null){
            employeeList.remove(employeeToRemove);
        }
    }
    public void displayEmployee(){
        for(Employee employee: employeeList){
            System.out.println(employee);
        }
    }
}
public class Main {
    public static void main(String[] args) {
        PayrollSystem payrollSystem = new PayrollSystem();
        FullTImeEmployee emp1 = new FullTImeEmployee("Himanshu", 1, 70000.0);
        PartTimeEmployee emp2 = new PartTimeEmployee("Raj", 2, 48, 500);

        payrollSystem.addEmployee(emp1);
        payrollSystem.addEmployee(emp2);

        System.out.println("Initial Details: ");
        payrollSystem.displayEmployee();
        System.out.println("removing employee: ");
        payrollSystem.removeEmployee(1);
        payrollSystem.displayEmployee();
    }
}