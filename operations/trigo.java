import java.util.*;
import java.lang.*;
class trigo
{
    double sine(double deg)
    {
        double rad=Math.toRadians(deg);
        return Math.sin(rad);
    }


    double cosine(double deg)
    {
        double rad=Math.toRadians(deg);
        return Math.cos(rad);
    }


    double tangent(double deg)
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