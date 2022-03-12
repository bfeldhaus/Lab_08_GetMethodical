import java.util.Locale;
import java.util.Scanner;

public class Reggie
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);

        String res = "";
        boolean run = true;
        String SSN = SafeInput.getRegExString(in, "Enter your social security number", "\\d{3}-\\d{2}-\\d{4}");
        String mNumber = SafeInput.getRegExString(in, "Enter your UC Student M number", "(M|m)\\d{8}");

        do
        {
            System.out.println("Select a menu option:\n  O: Open\n  S: Save\n V: View\n Q: Quit");
            if (in.hasNext())
            {
                res = in.nextLine().toUpperCase();
                if (res.equals("O") | res.equals("S") | res.equals("V") | res.equals("Q"))
                {
                    run = false;
                }
            }
        } while (run);
    }
}
