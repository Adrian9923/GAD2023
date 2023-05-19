package finalProject.firstDesignPattern;

public class Manager implements Employee{
    private String name;
    private long employeeID;
    private String position;

    public Manager(long employeeID, String name, String position) {
        this.employeeID = employeeID;
        this.name = name;
        this.position = position;
    }

    @Override
    public void employeeInfo() {
        System.out.println(employeeID + " " + name);
    }
}
