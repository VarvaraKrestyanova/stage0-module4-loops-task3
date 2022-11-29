package school.mjc.stage0.loops.task3;

public class FibonacciSeries {
    public void printFibonacci(int lastFibonacci) {

        int first = 0;
        int second = 1;

        if (lastFibonacci > 0) {
            System.out.println(first);
            if (lastFibonacci >= 2) {
                System.out.println(second);
            }
        }

        for (int i = 0; i < lastFibonacci - 2; i++) {
            second += first;
            first = second - first;
            System.out.println(second);
        }

    }

}
