import java.util.*;
public class pattern {
    public static void main(String args[]){
        Scanner sc  = new Scanner(System.in);
        int n = sc.nextInt();
        // int m = 1;
        sc.close();
        for(int i = 1 ; i <= n ; i++){
            // for(int s = 1 ; s <= n-i ; s++){
            //     System.out.print("  ");
            // }
            for(int j = 1 ; j <= i ; j++){
                int m=i+j;
                if(m%2==0)
                    System.out.print("1 ");
                else
                    System.out.print("0 ");
                
                // if(j == n-i){
                //     System.out.print(" ");
                // }
                // else{
                //     System.out.print("* ");
                // }
            }
            System.out.println();
        }
        
        // System.out.println();
    }
    
}
