import java.util.*;
public class average_function {
 

    public static float fun(int num1, int num2,int num3){
        float avg = (num1+num2+num3)/3;
        System.out.println("sum of two number :"+avg);
        return avg;
    }
    public static void main(String[] args){
        Scanner sc =new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int num3 = sc.nextInt();
        fun(num1,num2,num3);
    }
}


