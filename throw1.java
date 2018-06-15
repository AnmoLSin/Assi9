import java.io.File;
import java.io.IOException;
import java.io.FileReader;

public class throw1 {
	public static void main(String[] args) throws IOException
	{
            File f=new File("E:\\abc.txt");   
            try {
                int a;
                FileReader r=new FileReader(f);
                int eof=-1;
                while((a=r.read())!=eof) 
                {
                    System.out.print((char)a);
                }
                r.close();
                System.out.println("");
            }
            catch(IOException e) {
                 System.out.println("IOException occurs");
            }
        }
}
