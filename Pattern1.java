import java.util.Scanner;
class Pattern1{
    public static void main(String args[]){
         Scanner sc=new Scanner(System.in);
         System.out.print("Enter your number:");
         int n=sc.nextInt();
         System.out.println(n);
         for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                System.out.print("*");
            }
            System.out.println();
         }
    }
}