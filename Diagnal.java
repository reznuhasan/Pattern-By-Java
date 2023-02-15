import java.util.Scanner;
class Diagnal{
    public static void main(String args[]){
         Scanner sc=new Scanner(System.in);
         System.out.print("Enter your number:");
         int n=sc.nextInt();
         System.out.println(n);
         for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(i==j){
                    System.out.print('*');
                }else if(j==n-i-1){
                    System.out.print('*');
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
         }
    }
}