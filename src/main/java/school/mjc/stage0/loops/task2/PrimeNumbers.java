package school.mjc.stage0.loops.task2;

public class PrimeNumbers {

    public boolean isPrime(int n){
        if ((n > 2 && n % 2 == 0) || (n > 3 && n % 3 == 0)) return false;

        int test = 5;
        int i = 1;
        while(test <= Math.ceil(Math.sqrt(n))){
            if (n % test == 0) return false;
            test = 6 * (i++) + 1;
        }
        return true;
    }
    public void printPrimeNumbers(int printToInclusive) {
        if (printToInclusive <= 0) return ;

        int index = 2;
        while(index <= printToInclusive){
            if (isPrime(index)) System.out.println(index);
            index++;
        }
    }
}
