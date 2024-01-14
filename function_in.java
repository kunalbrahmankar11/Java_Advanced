import java.util.*;
public class function_in {
    public static void fun(String name){
        System.out.println(name);
        return ;
    }
    public static void main(String[] args){
        Scanner sc =new Scanner(System.in);
        String name = sc.nextLine();
        fun(name);
    }
}
