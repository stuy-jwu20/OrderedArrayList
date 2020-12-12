import java.util.*;
public class OrderedArrayList<T extends Comparable<T>> extends NoNullArrayList<T> {

  public boolean add(T value) {
    for (int i = 0; i < this.size() - 1; i++) {
      if (this.get(i) < value) && (value < this.get(i+1)) {
        this.add(i+1, value);
        return true;
      }
    }
    return false;
  }

  public boolean add(int index, T value) {
    for (int i = 0; i < this.size() - 1; i++) {
      if (this.get(i) < value) && (value < this.get(i+1)) {
        this.add(i+1, value);
        return true;
      }
    }
    return false;  
  }
}
