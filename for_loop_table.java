import java.util.*;
public class for_loop_table {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        int mult =1;
        for(int i=1; i<=10; i++){
            mult = n*i;
            System.out.println(mult);
        }
        
    }
    
}
