import java.util.Scanner;

public class STRING {


    public static void main(String[] args) {

        StringBuffer Sbuffer = new StringBuffer();


        Scanner input = new Scanner(System.in);
        String S = "";

        int longestString = 0;
        int endsWithte = 0;
        int Containth = 0;

        int maxNumOfa = 0;
        String maxStringOfa = "";

        while (!S.equalsIgnoreCase("Enough")) {
            System.out.println("Enter String's and Enter enough when done");

            S = input.nextLine();
            Sbuffer.append(S);


            if (S.endsWith("te"))
                endsWithte++;

            if (S.contains("th"))
                Containth++;

            if (S.length() > longestString)
                longestString = S.length();


            String replaceSpace = S.replace(" ", "_");

            System.out.println("String After Replacing All space's With Underscore's : " + replaceSpace + "\n");



           String ConvertString=UpperTolower(S);

            System.out.println("String After Convert Upper Char's To Lower And Vise Versa : " + ConvertString + "\n");


            int NumOfa = 0;
            for (int k = 0; k < S.length(); k++)
            {

                if (S.charAt(k) == 'a')
                    NumOfa++;
            }


            if (NumOfa > maxNumOfa) {
                maxNumOfa = NumOfa;
                maxStringOfa = S;
            }

        }


        System.out.println("Number Of Strings Contains th = " + Containth);
        System.out.println("Number Of Strings Ends With te = " + endsWithte);
        System.out.println("Longest String = " + longestString);
        System.out.println("String With Max Number Of a's = " + maxStringOfa);


        int HalfOfBuffer = Sbuffer.length() / 2;

        Sbuffer.insert(HalfOfBuffer, "-->Done Deal <--");
        System.out.println("String Buffer : " + Sbuffer);

    }


    public static String UpperTolower(String S)
    {
        String ConvertString = "";
        for (int i = 0; i < S.length(); i++)
        {

            if (Character.isUpperCase(S.charAt(i)))
                ConvertString += String.valueOf(S.charAt(i)).toLowerCase();
            else if (Character.isLowerCase(S.charAt(i)))
                ConvertString += String.valueOf(S.charAt(i)).toUpperCase();
            else
                ConvertString += S.charAt(i);
        }
        return ConvertString;
    }
}