public class longestsubstring
 {
    public static void main(String[] args) 
    {
        String s = "abcbadebccba";
        int maxLength = 0;
        
            int count = 0;
            boolean[] c = new boolean[256];
            for (int i= 0; i < s.length(); i++) 
            {
                if (c[s.charAt(i)]) 
                {
                   continue;
                }
                 else 
                {
                   c[s.charAt(i)] = true;
                    count++;
                    if (count > maxLength) 
                    {
                        maxLength = count;
                    }
                }
            }
    System.out.println("The length of the longest substring without repeating characters is " + " "  + maxLength);
    }
}


