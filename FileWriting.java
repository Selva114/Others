import java.io.*;
public class FileWriting
{
public static void main(String args[])
{

try
{
FileWriter fw=new FileWriter ("/home/selva/Desktop/Abc.txt");
String s="My name is rohit";
fw.write(s);
fw.close();
}
catch(IOException e)
{
e.printStackTrace();
}
}
}
