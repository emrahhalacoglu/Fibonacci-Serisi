import java.util.Scanner;
public class Code {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);

        System.out.print("Input Fibonacci Series's Number of Element : ");
        int n=input.nextInt();
        int fibö=0;
        int fibs=1;
        int fib;
        System.out.print("\n"+n+" - Element Fibonacci Series => "+fibö+"-"+fibs);
        for(int i=3;i<=n;++i){
            fib=fibö+fibs;
            fibö=fibs;
            fibs=fib;
            
            System.out.print("-"+fib);
        }

    }
}
