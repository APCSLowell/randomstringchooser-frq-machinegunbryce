import java.util.*;

public class RandomStringChooser
{
    private String[] values;
    private int valuesRemaining;

    public RandomStringChooser(String[] vals)
    {
        values = new String[vals.length];
        for (int i = 0; i < vals.length; i++) {
            values[i] = vals[i];
        }
        valuesRemaining = values.length;
    }

    public String getNext()
    {
        if (valuesRemaining == 0) {
            return "NONE";
        }

        int index = (int) (Math.random() * valuesRemaining);
        String selected = values[index];

        // Swap the selected value with the last available one
        values[index] = values[valuesRemaining - 1];
        valuesRemaining--;

        return selected;
    }
}
