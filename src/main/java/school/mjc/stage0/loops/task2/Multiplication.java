package school.mjc.stage0.loops.task2;

public class Multiplication {
    public void printMultiplied(int multiplyByAndToInclusive) {
        if (multiplyByAndToInclusive == 0) return;

        int index = -1;
        while(index++ < Math.abs(multiplyByAndToInclusive)){
            System.out.println(multiplyByAndToInclusive * index);
        }
    }
}
