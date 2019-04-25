import java.math.BigInteger;
import java.util.Scanner;
public class Fibonacci{
    public static BigInteger of(int num){
        BigInteger a = BigInteger.ONE;
        BigInteger b = BigInteger.ZERO;
        BigInteger c = BigInteger.ZERO;
        for(int i = 1; i <= num; i++){
            c = b.add(a);
            b = a;
            a = c;
        }
        return c;
    }
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        while(scan.hasNextInt()){
            int num = scan.nextInt();
            System.out.println(Fibonacci.fo(num));
        }
    }
}