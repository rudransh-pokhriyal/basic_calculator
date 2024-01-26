import java.util.*;
class arithmetic
{
    double add(double a,double b)
    {
        return a+b;
    } 
    double subtract(double a,double b)
    {
        if(a>b)
        return a-b;
        else
        return b-a;
    }
    double multiply(double a,double b)
    {
        return a*b;
    }
    double divide(double a,double b)
    {
        System.out.println("if you want a/b press 1 otherwise 0\n");
        int ch=sc.nextInt();
        if(ch==1)
        return a/b;
        else
        return b/a;
    }
}