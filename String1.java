import java.util.Scanner;
class String1{
    public static String StringFun(String s1,String s2)
    {
        return s1+" Technologies " +s2 +".";
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String s1=sc.nextLine();
        String s2=sc.nextLine();
        System.out.println(StringFun(s1,s2));
    }
}