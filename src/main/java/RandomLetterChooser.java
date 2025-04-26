import java.util.*;

public class RandomStringChooser
{
    private String[] a;
    private int t;

    public RandomStringChooser(String[] v)
    {
        a = new String[v.length];
        for (int i = 0; i < v.length; i++) {
            a[i] = v[i];
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

        // Swap the selected value with the last available one
        a[index] = a[t - 1];
        t--;

        return selected;
    }
}
