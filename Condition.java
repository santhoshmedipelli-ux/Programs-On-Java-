import java.util.Scanner;
class Condition
{
    public static void main(String args[])
{
    Scanner sc = new Scanner(System.in);
 int x=sc.nextInt();
 int y=sc.nextInt();
 if(x>0 && y>0)
{
System.out.println("q1");
}
else if(x<0 && y>0)
{
System.out.println("q2");
}
else if(x<0 && y<0)
{
System.out.println("q3");
}
if(x>0 && y<0)
{
System.out.println("q4");
}
}
}