import java.util.Scanner;
import static nagaro_codes.CharCount.getOccuringChar;

public class Palindrome {
     public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        String S = in.next();
        checkPali(S);
    }
    static void checkPali(String str)
    {
        int length = str.length();
        String reverse = "";
        
        for(int i = 0; i < length; i++)
        {
            reverse = str.charAt(i) + reverse;
        }
        if(str.equals(reverse))
        {
            System.out.println("true");
        }
        else
        {
            System.out.println("false");
        }
    }
}
