 import java.util.*;
public class Adiiton_function {

    public static int fun(int num1, int num2){
        int sum = num1 +num2;
        System.out.println("sum of two number :"+sum);
        return sum;
    }
    public static void main(String[] args){
        Scanner sc =new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        fun(num1,num2);
    }
}

