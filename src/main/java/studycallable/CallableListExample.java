package studycallable;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.*;

public class CallableListExample {

    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ExecutorService service = Executors.newFixedThreadPool(10);
        List<Future<String>> list = new ArrayList<>();
        Future<String> f1;
        Callable<String> callable = new TestCallable();
        for(int i=0;i<1000;i++){
            f1 = service.submit(callable);
            list.add(f1);
        }
        for (Future<String> future: list) {
            System.out.println(System.currentTimeMillis()+"Thread name = "+ future.get());
        }
        service.shutdown();
    }
}

class TestCallable implements Callable<String> {
    @Override
    public String call(){
        return Thread.currentThread().getName();
    }
}