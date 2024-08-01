/*
Write a program to find the most frequent character in a given string.
*/
public class frequentcharString
{
public static void main(String[] args) {
   int c =1;
   String s = "Vijas vini";
   int a[] = new int [s.length()];
   for(int i = 0;i<s.length();i++)
   {
       for(int j=1;j<s.length();j++)
       {
          if((s.charAt(i)==s.charAt(j)||s.charAt(i)==(char)(s.charAt(j) + 32)||s.charAt(i)==(char)(s.charAt(j) - 32)) && ((int) s.charAt(i) != 32))
          a[i] = c++;
       }
       c=1;
   }

   int max = a[0];
   int letter = 0;
   for(int i = 0;i<a.length;i++)
   {
       if(a[i] > max)
       {
       max = a[i];
       letter = i;
       }
   }
   System.out.print("The letter " + s.charAt(letter) + " has occured " + max + " times in the string " + s );
    }
}

