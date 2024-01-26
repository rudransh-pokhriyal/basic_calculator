import java.util.*;
import java.lang.*;
class misc
{
    int factorial(int a)
    {
        if(a<=1)
        return 1;
        else
        return a*fact(a-1);
    }
    int exponential(int a,int n)
    {
        return Math.pow(a,n);
    }
}