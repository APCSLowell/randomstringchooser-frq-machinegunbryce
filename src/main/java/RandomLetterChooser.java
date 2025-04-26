import java.util.*;

public class RandomStringChooser
{
    private String[] a;
    private int t;

    public RandomStringChooser(String[] r)
    {
        a = new String[r.length];
        for (int i = 0; i < r.length; i++) {
            a[i] = r[i];
        }
        t = a.length;
    }

    public String getNext()
    {
        if (t == 0) {
            return "NONE";
        }
        int index = (int) (Math.random() * t);
        String selected = a[index];
        a[index] = a[t - 1];
        t--;

        return selected;
    }
}
