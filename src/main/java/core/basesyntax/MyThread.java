package core.basesyntax;

import java.time.LocalDateTime;
import java.util.Random;
import java.util.concurrent.Callable;

public class MyThread implements Callable<String> {
    private Random rand = new Random();

    @Override
    public String call() throws InterruptedException {
        int i = rand.nextInt(500);
        Thread.sleep(i);
        return "Task duration was " + i + " ms" + ", execution finished at " + LocalDateTime.now();
    }
}
