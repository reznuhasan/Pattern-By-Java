import java.util.Scanner;
class Quadri{
    public static void main(String args[]){
         Scanner sc=new Scanner(System.in);
         System.out.print("Enter your number:");
         int n=sc.nextInt();
         System.out.println(n);
         for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(i==j || j+i==n-1 || i==0 || j==0 || i==n-1 || j==n-1){
                    System.out.print('*');
                }else if(i+j==((n-1)/2)){
                    System.out.print('*');
                }else if(i==((n-1)/2)+j){
                    System.out.print('*');
                }else if(j==((n-1)/2)+i){
                    System.out.print('*');
                }else if(j==(n-1)-(i-((n-1)/2))){
                    System.out.print('*');
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
         }
    }
}