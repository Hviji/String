public class anagram
{
public static void main(String [] args)
{
String s1 = "car race";
    String s2 = "rac eacs";
    int count=0;
    boolean anagram = true;

    if (s1.length() == s2.length()) 
    {
      for (int i = 0; i < s1.length(); i++) 
      {
        char ch = s1.charAt(i);
        count = 0;
        for (int j = 0; j < s2.length(); j++)
         {
          if (ch == s2.charAt(j)) {
            count++;             
          }
        }
             // System.out.println(count);  
        if (count == 0) 
        {
          anagram = false;
          break;
        }
      }
      if (anagram) 
      {
        System.out.println("anagram");
      } 
      else 
      {
        System.out.println("not anagram");
      }
    } 
    else 
    {
      System.out.println("Length mismatch");
    }
  }
}
