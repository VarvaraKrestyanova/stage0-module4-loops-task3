package school.mjc.stage0.loops.task3;

public class NinesSum {
    public void calculateSum(int lengthOfLastNumber) {

        int res = lengthOfLastNumber <= 0 ? 0 : 9;

        int counter = 9;
        for (int i = 1; i < lengthOfLastNumber; i++) {
            counter = counter * 10 + 9;
            res += counter;
        }
        System.out.println(res);
    }

}
