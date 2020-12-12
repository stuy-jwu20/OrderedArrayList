import java.util.*;
public class OrderedArrayList<T extends Comparable<T>> extends NoNullArrayList<T> {

  public OrderedArrayList() {
    super();
  }

  public OrderedArrayList(int startingCapacity) {
    super(startingCapacity);
  }
  public boolean add(T value) {
    if (this.size() == 0) {
      super.add(value);
      return true;
    }
    else if (this.size() == 1) {
      if (value.compareTo(this.get(0)) < 0) {
        super.add(0, value);
        return true;
      }
    }
    for (int i = 0; this.size() > 1 && i < this.size() - 1; i++) {
      if ((this.get(i).compareTo(value) > 0) && (value.compareTo(this.get(i+1)) < 0)) {
        super.add(i, value);
        return true;
      }
      else if (value.compareTo(this.get(0)) < 0) {
        super.add(0, value);
        return true;
      }
    }
    return false;
  }

  public void add(int index, T value) {
    int once = 0;
    for (int i = 0; i < this.size() - 1; i++) {
      if ((this.get(i).compareTo(value) > 0) && (value.compareTo(this.get(i+1)) < 0) & once == 0)  {
        super.add(i, value);
        once++;
      }
    }
  }

  public T set(int index, T value) {
    T old = super.get(index);
    super.remove(index);
    int once = 0;
    for (int i = 0; i < this.size() - 1; i++) {
      if ((this.get(i).compareTo(value) > 0) && (value.compareTo(this.get(i+1)) < 0) && once == 0) {
        super.add(i, value);
        once++;
      }
    }
    return old;
  }
}
