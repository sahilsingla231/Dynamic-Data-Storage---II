package filehandling;

import java.io.*;
public class FileHandling2 {

	public static void main(String[] args) throws IOException {
        File f = new File("C:\\Users\\Sahil\\eclipse-workspace\\FileHandling\\src\\filehandling\\abc.txt");
        File f1 = new File("C:\\Users\\Sahil\\eclipse-workspace\\FileHandling\\src\\filehandling\\xyz.txt");
        FileWriter fw = new FileWriter(f1);
        FileReader fr = new FileReader(f);
        try{
            int ch = fr.read();
            while(ch != -1){
            	fw.write(ch);
                ch = fr.read();
            }
        }
        catch(Exception e) {
	        System.out.println("Exception is "+e.getMessage());
	    }
        
        finally{
            fr.close();
            fw.close();
            System.out.println("Contents in other file writed.");  
        }
        System.out.println("For verification printing contents of file xyz.txt So contents are->");
        FileReader fr1 = new FileReader("C:\\\\Users\\\\Sahil\\\\eclipse-workspace\\\\FileHandling\\\\src\\\\filehandling\\\\xyz.txt");
        try{
            int ch = fr1.read();
            while(ch != -1){
                System.out.print((char)ch);
                ch = fr1.read();
            }
        }
        catch(Exception e) {
	        System.out.println("Exception is "+e.getMessage());
	    }
        finally{
            fr1.close();}
}
}
