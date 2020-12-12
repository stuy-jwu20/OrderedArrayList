import java.util.*;
public class OrderedArrayList<T extends Comparable<T>> extends NoNullArrayList<T> {

  public OrderedArrayList<T>() {
    super();
  }

  public OrderedArrayList<T>(int startingCapacity) {
    super(startingCapacity);
  }
  public boolean add(T value) {
    if (this.size() == 0) this.add(value);
    for (int i = 0; this.size > 1 && i < this.size() - 1; i++) {
      if (this.get(i) < value) && (value < this.get(i+1)) {
        this.add(i+1, value);
        return true;
      }
      else if (value < this.get(0)) {
        this.add(0, value);
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

  public T set(int index, T value) {
    T old = this.get(index);
    this.remove(index);
    add(value);
    return old;
  }
}
