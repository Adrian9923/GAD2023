package finalProject.firstDesignPattern;

import java.util.ArrayList;
import java.util.List;

public class Director implements Employee{

    private List<Employee> ListOfEmployees = new ArrayList<Employee>();

    @Override
    public void employeeInfo() {
        for(Employee employee:ListOfEmployees) {
            employee.employeeInfo();
        }
    }

    public void addEmployee(Employee employee) {
        ListOfEmployees.add(employee);
    }

    public void removeEmployee(Employee employee) {
        ListOfEmployees.remove(employee);
    }
}
