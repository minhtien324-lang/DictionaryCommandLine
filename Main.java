package pack;

import java.io.IOException;

public class Main {
    public static void main(String[] args){
        Commandline commandline = new Commandline();
        try {
            commandline.Advanced();
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
/*.......

 */