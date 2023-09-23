/*

public class StringDemo
{
public static void main(String args[])
{
String s="Payilagam";

for(int i=0;i<s.length();i=i+1)
{
System.out.println(s.charAt(i));
}

}
}
*/

/*output::
P
a
y
i
l
a
g
a
m
*/

//count a
/*
public class StringDemo
{
public static void main(String args[])
{
String s="Payilagam";
int count=0;
for(int i=0;i<s.length();i=i+1)
{
if(s.charAt(i)=='a')
{
count=count+1;
}
}
System.out.println(count);
}
}
*/
/*
Output::
3
*/

/*
public class StringDemo
{
public static void main(String args[])
{
String s="malala got nobel prize for piece";
int count=0;
for(int i=0;i<s.length();i=i+1)
{
if(s.charAt(i)=='a')
{
count=count+1;
}
if(s.charAt(i)=='e')
{
count=count+1;
}
if(s.charAt(i)=='i')
{
count=count+1;
}
if(s.charAt(i)=='o')
{
count=count+1;
}
if(s.charAt(i)=='u')
{
count=count+1;
}
}
System.out.println(count);
}
}
*/

//count a,e,i,o,u in a sentence in a single if
/*
public class StringDemo
{
public static void main(String args[])
{
String s="malala got nobel prize for piece";
int count=0;
for(int i=0;i<s.length();i=i+1)
{
if(s.charAt(i)=='a'||s.charAt(i)=='e'||s.charAt(i)=='i'||s.charAt(i)=='o'||s.charAt(i)=='u')
{
count=count+1;
}
}
System.out.println(count);
}
}
*/

/*
output::
12
*/

public class StringDemo
{
public static void main(String args[])
{
String s="malala got nobel prize for piece";
int count=0;
int count1=0;
int count2=0;
int count3=0;
int count4=0;
for(int i=0;i<s.length();i=i+1)
{
if(s.charAt(i)=='a')
{
count=count+1;
}
if(s.charAt(i)=='e')
{
count1=count+1;
}
if(s.charAt(i)=='i')
{
count2=count+1;
}
if(s.charAt(i)=='o')
{
count3=count+1;
}
if(s.charAt(i)=='u')
{
count4=count+1;
}
}
System.out.println(count);
System.out.println(count1);
System.out.println(count2);
System.out.println(count3);
System.out.println(count4);
}
}
/*
Output::
3
4
4
4
0
*/

