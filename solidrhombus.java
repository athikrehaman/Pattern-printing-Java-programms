// import java.util.*;
public class solidrhombus {
    public static void main(String args[]){
        // Scanner sc = new Scanner(System.in);
        // int n = sc.nextInt();
        int n = 5;
        for(int i =  1 ; i <= n ; i++){
            for(int s = 1 ; s <= n  - i ; i++){
                System.out.print("  ");
            }
            for(int j = 1 ; j <= n ; j++){
                System.out.print("* ");
            }
            System.out.println();
            
        }
    }
    
}
