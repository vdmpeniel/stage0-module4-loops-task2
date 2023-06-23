package school.mjc.stage0.loops.task2;

public class WordsBuilder {
    public void buildPhrase(char... chars) {
        int index = 0;
        while(index <= chars.length - 1){
            System.out.print(chars[index++]);
        }

    }
}
