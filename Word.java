package pack;
public class Word {
    private String word_target;
    private String word_explain;
    public Word(){}
    public Word(String a, String b)
    {
        this.word_target= a;
        this.word_explain = b;
    }
    public String getWord_target() {
        return new String(this.word_target);
    }
    public String getWord_explain(){
        return new String(this.word_explain);
    }
    public void setWord_target(String word_target){
        this.word_target = word_target;
    }
    public void setWord_explain(String word_explain){
        this.word_explain = word_explain;
    }
}
/*
.........
 */