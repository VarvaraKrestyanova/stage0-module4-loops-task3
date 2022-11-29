package school.mjc.stage0.loops.task3;

public class GreatestCommonDivisor {
    public void printGCD(int first, int second) {
        if (second > first) {
            first += second;
            second = first - second;
            first -= second;
        }
        System.out.println(second == 0 ? first : first % second == 0 ? second : first % second);
    }
}
