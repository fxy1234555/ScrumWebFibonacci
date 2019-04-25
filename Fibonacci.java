import java.math.BigInteger;
import java.util.Scanner;
public class Fibonacci{
    public static BigInteger of(int num){
        BigInteger a = BigInteger.ONE;
        BigInteger b = BigInteger.ZERO;
        BigInteger c = BigInteger.ZERO;
        if(num < 2)
           return a;
        for(int i = 1; i < num; i++){
            c = b.add(a);
            b = a;
            a = c;
        }
        return c;
    }
    public static void main(String[] args){
        for(int i = 1; i <= 200; i++){
            System.out.println("Fibonacci.of(" + i + ") == " + Fibonacci.of(i));
        }
    }
}
