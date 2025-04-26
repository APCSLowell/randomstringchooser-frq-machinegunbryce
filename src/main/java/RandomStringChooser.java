import java.util.*;
public class RandomStringChooser
{
  private ArrayList <String> d;

  public RandomStringChooser(String[] a) {
    d = new ArrayList <String> ();
  for(int i =0; i < a.length; i++) {
d.add(a[i]);
  }
  }

  public String getNext() {
  if(d.size() > 0)
    return d.remove((int)(Math.random()*d.size()));
    else
    return "NONE";

  }
}
