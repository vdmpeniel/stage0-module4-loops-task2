package school.mjc.stage0.loops.task2;

public class FactorialNumbers {
    public void printFactorialRow(int printToInclusive) {


        int index = 0;
        int factorial = 1;
        while(index <= printToInclusive){
            if (index <= 0) {
                System.out.println(1);
            } else {
                factorial *= index;
                System.out.println(factorial);
            }
            index++;
        }

    }
}
