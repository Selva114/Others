import java.io.*;
public class ReadingContentFromFile
{
public static void main(String args[])
{
FileReader fr=null;
try
{
fr=new FileReader ("/home/selva/Desktop/Payilagam.txt");
int i=0;
for(           ;(i=fr.read())!=-1;      )
{
System.out.print((char)i);
}
fr.close();
}
catch(IOException e)
{
e.printStackTrace();
}
}
}


//Output ====I am learning Java in payilagam

