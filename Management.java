package pack;


import java.util.Scanner;
import java.io.*;

public class Management extends Dictionary {
    public void insertFromCommandline(){
        Scanner scanner = new Scanner(System.in);
        int amout = scanner.nextInt();
        scanner.nextLine();
        for(int i = 0; i < amout ; i++){
            String a = scanner.nextLine();
            String b = scanner.nextLine();
            add(new Word(a, b));
        }
    }
    public void insertFromfile(String path) throws IOException{
        FileReader fileReader = new FileReader(path);
        BufferedReader bufferedReader = new BufferedReader(fileReader);
        String temp ="";
        while ((temp = bufferedReader.readLine()) != null){
            int i = 0 ;
            while (temp.charAt(i) != '\t'){
                i++;
                if(i==temp.length()) break;;
            }
            add(new Word(temp.substring(0,i),temp.substring(i+1,temp.length())));
        }
        fileReader.close();
        bufferedReader.close();
    }
    public void dictionaryExporttoFile() throws IOException{
        FileWriter fileWriter = new FileWriter("C:\\Users\\PC\\Documents\\Dictionary.txt");
        BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
        for(int i = 0;i<getWord().size();i++){
            bufferedWriter.write(getWord().get(i).getWord_target()+"\t"+ getWord().get(i).getWord_explain() +"\n");
        }
        bufferedWriter.close();
    }
    public void lookup(){
        int i = 0;
        String display ="";
        try{
            Scanner scanner = new Scanner(System.in);
            System.out.println("Nhap tu tim kiem:  ");
            String find = scanner.nextLine();
            while (!find.equals(getWord().get(i).getWord_target())){
                i++;
            }
            System.out.println("ket qua: " + getWord().get(i).getWord_explain());
        }
        catch(Exception exception){
            System.out.println("khong tim thay ");
            return ;
        }

    }
    public void remove(){
        System.out.println("Nhap vi tri xoa: ");
        Scanner scanner = new Scanner(System.in);
        int pos = scanner.nextInt();
        scanner.nextLine();
        edit().remove(pos);
    }
    /*public void add(){
        System.out.println("Nhap vi tri can them: ");
        Scanner scanner = new Scanner(System.in);
        int pos = Integer.parseInt(scanner.nextLine());
        scanner.nextLine();
        System.out.println("Nhap tu can them: ");
        String _word_target = scanner.nextLine();
        System.out.println("Nghia cu tu vua them: ");
        String _word_explain = scanner.nextLine();
        edit().add(pos, new Word(_word_explain, _word_explain));
    }*/
    public void setting(){
        System.out.println("Nhap vi tri can sua: ");
        Scanner scanner = new Scanner(System.in);
        int pos = Integer.parseInt(scanner.nextLine());
        scanner.nextLine();
        System.out.println("Nhap tu can sua: ");
        String _word_target = scanner.nextLine();
        System.out.println("Nhap nghia tu da sua: ");
        String _word_explain = scanner.nextLine();
        edit().set(pos, new Word(_word_target, _word_explain));
    }
}
