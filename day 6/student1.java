import java.util.*;
import java.io.FileWriter;
import java.io.File;
 class Student1{
    public static void main(String[] args)
    {
        String path="C:/Users/Admin/OneDrive/Desktop/Day5/file.txt";
        ArrayList<String> ar = new ArrayList<String>();
        ar.add("Kumarappan");
        try
        {
            File ob = new File(path);
            ob.createNewFile();
            
        }
        catch(Exception e)
        {
            System.out.println(e.getMessage());
        }
        try{
            FileWriter wr= new FileWriter(path);
            for(String g:ar)
            {
            wr.write(g);
            }
            wr.close();

        }
        catch(Exception e)
        {
            System.out.println(e.getMessage());
        }
        // System.out.println(ar);
    }
 } 