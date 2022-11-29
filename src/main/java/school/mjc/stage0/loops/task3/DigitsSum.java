package school.mjc.stage0.loops.task3;

public class DigitsSum {
    public void printDigitsSum(int t){

        t = Math.abs(t);
        String tStr = "" + t;
        int res = 0;
        for (int i = 0; i < tStr.length(); i++) {
            res += t % 10;
            t = t / 10;
        }
        System.out.println(res);
    }
}
