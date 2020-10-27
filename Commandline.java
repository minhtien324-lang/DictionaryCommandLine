package pack;



import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import static java.lang.String.format;


public class Commandline extends Management {
    public void showAllWords(){
        System.out.println(  format("NO|%-10s|%-10s%n","English","Vietnamese"));
        int temp =getWord().size();
        for (int i = 0 ; i  < temp;i++){
            System.out.println(format("%-3d|%-10s|%-10s",i+1,getWord().get(i).getWord_target(),getWord().get(i).getWord_explain()));
        }
    }
    public void Basic(){
        this.insertFromCommandline();
        this.showAllWords();
    }
    public void Advanced() throws IOException{
        this.insertFromfile("C:\\Users\\PC\\Documents\\Dictionary.txt");
        this.showAllWords();
        this.command();
    }
    public void Search(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap tu tim kiem: ");
        String search = scanner.nextLine();
        List<Word> temp = new ArrayList<>();
        for(int i = 0; i<getWord().size();i++){
            if (getWord().get(i).getWord_target().contains(search)) temp.add(getWord().get(i));
        }
        for (Word word : temp){
            System.out.println(word.getWord_target()+" : " + word.getWord_explain());
        }
    }
    private void command() throws IOException{
        String command =" ";
        Scanner scanner = new Scanner(System.in);
        System.out.println("Cau lenh: \n" +
                "\t-add: them tu\n"+
                "\t-remove: xoa tu\n" +
                "\t-export: xuat ra file\n" +
                "\t-lookup: tim kiem\n"+
                "\t-setting: cai dat\n" +
                "\t-search:tim tu\n" +
                "\t-show: hien thi tat ca tu\n" +
                "\t-quit: thoat ");
        while (!command.equals("_quit")){
            System.out.println("Nhap lenh: ");
            command = scanner.nextLine();
            if(command.equals("quit")){
                break;
            }else if( command.equals("add")){
                insertFromCommandline();
            }else if(command.equals("remove")){
                remove();
            }else if (command.equals("export")){
                dictionaryExporttoFile();
            }else if (command.equals("lookup")){
                lookup();
            }else if (command.equals("setting")){
                setting();
            }else if (command.equals("search")){
                Search();
            }else if(command.equals("show")){
                showAllWords();
            }else {
                System.out.println("Cau lenh khong hop le!");
            }
        }
    }
}
/*

 */