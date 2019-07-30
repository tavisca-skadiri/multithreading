package studycallable;

import java.util.concurrent.*;

public class CallableCircleExample {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ExecutorService service = Executors.newFixedThreadPool(2);
        Future<Double> f1 = service.submit(new CircleAreaCalculator(10));
        Future<Double> f2 = service.submit(new CircleCircumferenceCalculator(10));
        System.out.println("Area = "+ f1.get());
        System.out.println("Circumference = "+ f2.get());
        service.shutdown();
    }
}

class CircleAreaCalculator implements Callable<Double> {
    private int radius;
    CircleAreaCalculator(int radius) {
        this.radius = radius;
    }
    private double calculateArea(){
        return Math.PI*radius*radius;
    }
    @Override
    public Double call(){
        return calculateArea();
    }
}

class CircleCircumferenceCalculator implements Callable<Double> {
    private int radius;
    CircleCircumferenceCalculator(int radius) {
        this.radius = radius;
    }
    private double calculateCircumference(){
        return 2*radius*Math.PI;
    }
    @Override
    public Double call(){
        return calculateCircumference();
    }
}

