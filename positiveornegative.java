import java.util.*;
public class positiveornegative {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println((n>0)?"Positive":(n==0)?"Zero":"Negative");
    }
}
