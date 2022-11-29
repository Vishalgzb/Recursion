import java.util.Scanner;

public class facto {
    public static void fact(int a){
        System.out.println("factorial is");
        int i=a-1;
        if(i>0){
            int c;
            fact(c=i*a);
            i--;
            System.out.println(c);
            
            return;



        }
        

    }
    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        int a = Sc.nextInt();
        fact(a);
    }
}
