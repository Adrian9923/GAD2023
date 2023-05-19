package finalProject.secondDesignPattern;

public class Main {
    public static void main(String[] args) {
        ComputerFacade.run(new CPU(), new HardDrive(), new Memory());
    }
}
