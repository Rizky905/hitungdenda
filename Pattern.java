import java.util.Scanner;
public class Pattern

{
 
    public static void main(String[] args)
    {
        int i,j,k;
        for ( i= 1; i<=10; i++)
        {
            for ( j=i; j<10; j++){
                System.out.print(" ");
            }
            for ( k=1; k<=i;k++) { 
                System.out.print("*"); 
            } 
            System.out.println(" ");
        }


        System.out.println("DUMBWAYSID");

        for ( i=10; i>=1; i--){

            for( j=i; j<=10; j++){
                System.out.print(" ");
            }

            for( k=1; k<i ;k++){
                System.out.print("*");
            }
        
        System.out.println("");
 
        }

    }
}