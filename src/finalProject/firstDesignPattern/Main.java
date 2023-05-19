package finalProject.firstDesignPattern;

public class Main {
    public static void main (String[] args) {
        Worker firstWorker = new Worker(1, "Michael Peterson", "Marketing");
        Worker secondWorker  = new Worker(2, "Bob Marley", "Marketing");
        Director workersDirectory = new Director();
        workersDirectory.addEmployee(firstWorker);
        workersDirectory.addEmployee(secondWorker);

        Manager firstManager = new Manager(11, "George Bond", "SEO Manager");
        Manager secondManager = new Manager(12, "James Clark", "Marketing Manager");

        Director managersDirectory = new Director();
        managersDirectory.addEmployee(firstManager);
        managersDirectory.addEmployee(secondManager);

        Director directory = new Director();
        directory.addEmployee(workersDirectory);
        directory.addEmployee(managersDirectory);
        directory.employeeInfo();
    }
}
