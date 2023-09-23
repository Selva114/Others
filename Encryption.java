//Encryption

public class Encryption 
{
public static void main(String args[])
{

String s = "India";

char c[]=new char[s.length()];
    
    for(int i=0;i<c.length;i=i+1)
    {
    c[i]=s.charAt(i);
    }

 for(int i=0;i<s.length();i++)
    {
        if(c[i]=='n')//search
        {
        c[i]='a';//replace
        }
        if(c[i]=='i')//search
        {
        c[i]='a';//replace
        }
    }
String s1="";

  for(int i=0;i<c.length;i++)
    {
    s1=s1+c[i];
    }
System.out.println(s1);
}
}


//Output=====Iadaa



/*public class ReplaceLetter1
{
public static void main(String args[])
{

String s = "India";

char c[]=new char[s.length()];
    
    for(int i=0;i<c.length;i=i+1)
    {
    c[i]=s.charAt(i);
    }

 for(int i=0;i<s.length();i++)
    {
        if(c[i]=='I')//search
        {
        c[i]='A';//replace
        }
        if(c[i]=='d')//search
        {
        c[i]='a';//replace
        }
    }
String s1="";

  for(int i=0;i<c.length;i++)
    {
    s1=s1+c[i];
    }
System.out.println(s1);
}
}*/
