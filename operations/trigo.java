import java.util.*;
import java.lang.*;
class trigo
{
    double Sin(double deg)
    {
        double rad=Math.toRadians(deg);
        return Math.sin(rad);
    }


    double Cos(double deg)
    {
        double rad=Math.toRadians(deg);
        return Math.cos(rad);
    }


    double Tan(double deg)
    {
        double rad=Math.toRadians(deg);
        return Math.tan(rad);
    }

    double degtorad(double deg)
    {
        return Math.toRadians(deg);
    }

    double radtodeg(double rad)
    {
        return Math.toRadians(rad);
    }

}