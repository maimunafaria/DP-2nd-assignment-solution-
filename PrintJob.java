import java.util.PriorityQueue;
import java.util.Queue;
public class PrintJob {
    Queue<PrintRequest> request  = new PriorityQueue<PrintRequest>();
    PrioritySetting PriS = new PrioritySetting();
    public void pullJob()
    {
        request.remove();
    }

}
