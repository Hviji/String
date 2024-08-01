/*public class removespace
{
public static void main(String[] args) {
String str1="Hi I am ";

str1 = str1.replaceAll("\\s+", "");
System.out.println("String after removing all the white spaces : " + str1);
}
}*/

public class removespace
{
public static void main(String[] args) 
{
String s1="  Remove White Space  ";
System.out.print("String after removing all the white spaces : " );
for(int i=0;i<s1.length();i++)
{
char ch=s1.charAt(i);
if(ch!=' ')
{
System.out.print(ch);
}
}
}
}

