public class capitalLetter
{
public static void main(String[] args) 
{
String s="hello what is your name";
char a[]=s.toCharArray();
int size=a.length;
a[0]=(char)(a[0]-32);
int i=1;
while(i!=size)
{
   if(a[i]==' ')
   {
   a[i+1]=(char)(a[i+1]-32);
   }
   ++i;
}
System.out.println(a);
}
}

