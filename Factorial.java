import java.util.*;
import java.io.*;
public class Factorial {
    public static void main(String[] args )throws Exception{
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int f=factorial(n);
        System.out.println(f);
    }
    public static int factorial(int n){
        if(n==1){
            return 1;
        }
        int fnm1=factorial(n-1);
        int fn=n*fnm1;
        return fn;
    }
}
