package school.mjc.stage0.loops.task2;

public class PowerOfTwo {
    public void printPower(int power) {
        if (power < 0){
            System.out.println("too much power");
            return;
        }
        int p = 0;
        int result = 0;
        while(p <= power){
            result = (p == 0) ? 1 : (p == 1) ? 2 :  result * 2;
            System.out.println(result);
            p++;
        }

    }
}
