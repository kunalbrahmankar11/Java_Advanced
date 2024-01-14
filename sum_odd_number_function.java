// import java.util.*;
// public class sum_odd_number_function{
 

//     public static int fun1(int num5){
//         for(int i=0;i<=num5;i++){
//             if (i%2!=0){
//             int sum=0;
//             int addition = sum+num5;
//             System.out.println("sum of odd number :"+addition);
//             return addition;
//         }
       
//         }
       
// }
//     public static void main(String[] args){
//         Scanner sc =new Scanner(System.in);
//         int num5 = sc.nextInt();
//         fun1(num5);
//     }
// }

public class sum_odd_number_function{
    public static void main(String[] args){
        int num=10;
        int sum=0;
        for(int i=1;i<=num;i++){
            if(i%2!=0){
                sum=sum+i;
                
            }
           


    }
     System.out.println(sum);

}
}
