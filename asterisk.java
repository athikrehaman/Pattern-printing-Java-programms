import java.util.*;
public class asterisk
{
    public static void main(String args[])
    {
        int i , j ,n;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Rows:");
        n = sc.nextInt();
        for(i = 1 ; i <= n ; i++)
        {
            for(j = 1 ; j <= i ; j++)
                System.out.print("*");

            System.out.println(" ");
        }
    }
}
