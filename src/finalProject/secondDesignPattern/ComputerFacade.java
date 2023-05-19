package finalProject.secondDesignPattern;

public class ComputerFacade {
    public static void run(CPU cpu, HardDrive hardDrive, Memory memory) {
        cpu.processData();
        hardDrive.analyzeData();
        memory.load();
    }
}
