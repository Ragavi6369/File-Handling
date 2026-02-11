import java.io.*;
import java.nio.file.*;
import java.util.Scanner;
public class Admin1FileHandle
{
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        System.out.println("Enter Book Name:");
        String a=s.nextLine();
        System.out.println("Enter Authour Name:");
        String b=s.nextLine();
        System.out.println("Year of Publish:");
        String c=s.nextLine();
        System.out.println("Date:");
        String d=s.nextLine();
        System.out.println("Enter Place:");
        String e=s.nextLine();
        String full=a+" "+b+" "+c+" "+d+" "+e+" "+"\n";
        
        String filename="Adminfile1.txt";
        createFile(filename);
       
        readFile(filename);
        appendFile(filename,full);
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
 catch(Exception e)
         {
         System.out.println("Error occured during read file");
         e.printStackTrace();
         }
 }
 public static void appendFile(String filename,String full){
    try(FileWriter writer=new FileWriter(filename,true)){
        writer.write(full);
        System.out.println("Successfully Added");
    }
    catch(IOException e){
        System.out.println("Error occured during append file.");
        e.printStackTrace();
    }
 }

}
