package blockingqueue_demo;

import java.util.concurrent.BlockingQueue;

public class Producer implements Runnable {
    protected BlockingQueue<String> queue = null;

    public Producer(BlockingQueue<String> queue) {
        this.queue = queue;
    }

    @Override
    public void run() {
        try {
            queue.put("100");
            Thread.sleep(1000);
            queue.put("200");
            Thread.sleep(1000);
            queue.put("300");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
