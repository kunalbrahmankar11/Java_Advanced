import java.util.*;
public class function_vote_eligible {
    public static void vote(int age){
        if(age>=18){
            System.out.println("eligble for vote");
        }
        else{
            System.out.println("not eligible for voting");
        }
       
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter age for checking the person is eligible or not-");
        int age=sc.nextInt();
        vote(age);


    }
}
