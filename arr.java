import java.util.Scanner;

public class arr {
    public static void main(String[] args) {
       String a[]=new String[3];
       Scanner obj = new Scanner(System.in);
       System.out.println("enter your value = ");
       for(int i=0;i<a.length;i++){
         a[i]=obj.nextLine();
        
       }
       
       System.out.print("you value is = ");
       for(int i=0;i<a.length;i++){
System.out.print(a[i]+" ");
       }
obj.close();
    }
}
