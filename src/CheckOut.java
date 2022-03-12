import java.util.Scanner;

public class CheckOut
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        double totalPrice = 0;
        boolean res = false;
        do
        {
            totalPrice += SafeInput.getRangedDouble(in, "Enter the price of your item ", .50, 9.99);
            res = SafeInput.getYNConfirm(in, "Do you have more items [Y/N]? ");

        } while (!res);
        System.out.printf("The total cost: %.02f\n", totalPrice);
    }
}
