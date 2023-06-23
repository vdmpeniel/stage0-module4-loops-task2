package school.mjc.stage0.loops.task2;

public class EvenNumbersPrinter {
    public void printEvenNumbers(int printTillInclusive) {
        int index = -1;
        while(++index <= printTillInclusive){
            if (index % 2 == 0) System.out.println(index);
        }
    }
}
