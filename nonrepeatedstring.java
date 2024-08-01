public class nonrepeatedstring
{
public static void main(String[]args)
{
String s1="windowi";
for(int i=0;i<s1.length();i++)
{
boolean b =false;
char ch =s1.charAt(i);
for(int j=i+1;j<s1.length();j++)
{
if(ch==s1.charAt(j))
{
//System.out.println("repeated characters are" + " " + ch);
b=true;
break;
}
}
if(b==false)
{
System.out.println("non repeated characters are" + " " + ch);
break;
}
}
}
}
