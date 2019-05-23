import controller.Controller;
import model.QueueFormer;

public class Main {
    public static void main(String[] args) {
        Controller controller = new Controller();
        controller.process();
        QueueFormer queueFormer = new QueueFormer();
        queueFormer.fill();
        queueFormer.getQueue().stream().forEach(s -> System.out.print(s.getSpec() + " "));
        System.out.println(queueFormer.getQueue().remainingCapacity());
    }
}
