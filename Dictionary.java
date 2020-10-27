package pack;

import java.util.ArrayList;
import java.util.List;

public class Dictionary {
    private final List<Word> word = new ArrayList<>();
    public List<Word> getWord(){
        return new ArrayList<>(word);
    }
    public List<Word> edit(){
        return this.word;
    }
    public void add(Word _word){
        this.word.add(_word);
    }

}
/*

 */