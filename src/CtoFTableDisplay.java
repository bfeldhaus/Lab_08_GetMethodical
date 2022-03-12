import java.util.Scanner;

public class CtoFTableDisplay
{

    public static void main(String[] args)
    {
        Scanner pipe = new Scanner(System.in);

        double CelStart = -100.0;
        double CelEnd = 100.0;

        while (CelStart <= CelEnd)
        {
            System.out.println("|" + CelStart + "|" + CtoF(CelStart) + "|");
            CelStart += 1.00;
        }

    }

    public static double CtoF(double Celsius)
    {
        double fahrenheit = ((9 * Celsius) / 5) + 32;
        return fahrenheit;
    }
}