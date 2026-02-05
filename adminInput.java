import java.io.*;
import java.nio.file.*;
import java.util.Scanner;
class adminInput{
public static void main(String[] args){
    String filename="Adminfile.txt";
        Scanner s=new Scanner(System.in);
        System.out.println("Enter Book name:");
        String a=s.nextLine();
        System.out.println("Enter Author name:");
        String b=s.nextLine();
        System.out.println("Enter year of publish:");
        String c=s.nextLine();
        System.out.println("Enter date:");
        String d=s.nextLine();
        System.out.println("Enter place:");
        String e=s.nextLine();
        String full=a+"\n"+b+"\n"+c+"\n"+d+"\n"+e+"\n";
        
        createFile(filename);
        writeFile(filename,full);
        readFile(filename);
}                                        
 public static void createFile(String filename)
 {
     try{
     File file=new File(filename);
     if(file.createNewFile()){
     System.out.println("File created"+file.getName());
     }
     else{
     System.out.println("File already exit");
     }
     }
     catch(IOException e){
         System.out.println("Error occured during creation");
         e.printStackTrace();
     }
 }
 public static void writeFile(String filename,String full){
    try(FileWriter Writer=new FileWriter(filename)){
        Writer.write(full);
        System.out.println("Written");
    }
    catch(IOException e){
    System.out.println("Error occured during writing file");
    e.printStackTrace();
    }
 }
 public static void readFile(String filename){
 try(BufferedReader reader=new BufferedReader(new FileReader(filename)))
 {
    String line;
    while((line=reader.readLine())!=null)
    {
        System.out.println(" "+line);
    }
 }
 catch(IOException e)
         {
         System.out.println("Error occured during read file");
         e.printStackTrace();
         }
 }
}