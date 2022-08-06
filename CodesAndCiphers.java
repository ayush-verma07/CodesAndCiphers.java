//Name: Ayush Verma
//Period: 4B
import java.util.*;
public class CodesAndCiphers
{
    static final String alphabet = "abcdefghijklmnopqrstuvwxyz0123456789 ";
    static final String[] morse = {".- ", "-... ", "-.-. ", "-.. ", ". ", 
    "..-. ",
    "--. ", ".... ", ".. ", ".--- ", "-.- ", ".-.. ",
    "-- ", "-. ", "--- ", ".--. ", "--.- ", ".-. ",
    "... ", "- ", "..- ", "...- ", ".-- ", "-..- ",
    "-.-- ", "--.. ", "----- ", "..--- ", "...-- ",
    "....- ", "..... ", "-.... ", "--... ", "---.. ",
    "----. ", "----. ", "| "};

    public static void main(String[] args)
    {
       System.out.println(encryptCaesar("what is this", 6));
    }
    public static String encrypt13(String str)
    {
        char[] letters = str.toCharArray();
        String result = "";
        for (int i = 0; i < letters.length; i++)
        {
            if(letters[i] + 13 > 'z')
            {
                letters[i] -= 13;
                result += letters[i];
            }
            else
            {
                letters[i] += 13;
                result += letters[i];
            }
        }
        return result;
    }
    public static String decrypt13(String str)
    {
        char[] letters = str.toCharArray();
        String result = "";
        for (int i = 0; i < letters.length; i++)
        {
            if(letters[i] + 13 > 'z')
            {
                letters[i] -= 13;
                result += letters[i];
            }
            else
            {
                letters[i] += 13;
                result += letters[i];
            }
        }
        return result;
    }
    public static String encrypt47(String str)
    {
        char[] letters = str.toCharArray();
        String result = "";
        for (int i = 0; i < letters.length; i++)
        {
            if(letters[i] + 47 > 'z')
            {
                letters[i] -= 47;
                result += letters[i];
            }
            else
            {
                letters[i] += 47;
                result += letters[i];
            }
        }
        return result;
    }
    public static String decrypt47(String str)
    {
        char[] letters = str.toCharArray();
        String result = "";
        for (int i = 0; i < letters.length; i++)
        {
            if (letters[i] - 47 < 33)
            {
                letters[i] += 47;
            }
            else
            {
                letters[i] -= 47;
            }
            result += letters[i];
        }
        return result;    
    }
    public static String encryptCaesar(String str, int key)
    {
        char[] letters = str.toCharArray();
        String result = "";
        for (int i = 0; i < letters.length; i++)
        {
            if(letters[i] >= 'a' && letters[i] <= 'z')
            {
                if(letters[i] + key > 'z')
                {
                    result += (char)('a'+  (key - 1 - ('z' - letters[i])));
                }
                else
                {
                    letters[i] += key;
                    result += letters[i];
                }
            }
            else
            {
                result+=letters[i];
            }
                
        }
        return result;
    }
    public static String decryptCaesar(String str, int key)
    {
        char[] letters = str.toCharArray();
        String result = "";
        for (int i = 0; i < letters.length; i++)
        {
            if(letters[i] >= 'a' && letters[i] <= 'z')
            {
                if(letters[i] - key < 'a')
                {
                    result += (char)('z'-  (key - 1 - (letters[i] - 'a')));
                }
                else
                {
                    result += (char)(letters[i] - key);
                }
            }
            else
            {
                result+=letters[i];
            }
                
        }
        return result;
    }

    public static String encode(String str)
    {
        char[] letters = str.toLowerCase().toCharArray();
        String result = "";
        for (int i = 0; i < letters.length; i++)
        {
            result += morse[alphabet.indexOf(letters[i])];
        }
        return result;
    }

    public static String decode(String str)
    {
        String[] array = str.split(" ");
        String result = "";
        for (int i = 0; i < array.length; i++)
        {
            for (int b = 0; b < morse.length; b++)
        {
            if ((array[i] + " ").equals(morse[b]))
            {
                result += alphabet.charAt(b);
            }
        } 
            
        }
        return result;
    }

}

