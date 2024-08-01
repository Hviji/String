/*
3.Write a program to count the number of words in a given string.
*/

public class stringwordcount
{
public static void main(String args[])
{
String s1="Hi ,I am vijasvini ,How are You? What are you doing now,Have you eat! ";
int count=0;
boolean word =false;
for(int i=0;i<s1.length();i++)
{
char ch=s1.charAt(i);
if(ch>='A' && ch<='Z' || ch>='a' && ch<='z' || ch>='0' && ch<='9')
{
if(!word)
{
count++;
word =true;
}
}
else
{
 word=false;
}
}
System.out.println(count);
}
}

