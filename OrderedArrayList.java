import java.util.*;
public class OrderedArrayList<T extends Comparable<T>> extends NoNullArrayList<T> {

  public OrderedArrayList() {
    super();
  }

  public OrderedArrayList(int startingCapacity) {
    super(startingCapacity);
  }

  public boolean add(T value) {
    if (value == null) {
      throw new IllegalArgumentException("You tried to set a null value! That is not allowed.");
    }
    int sizeNow = this.size();
    for (int i = 0; i < sizeNow; i++) {
      if (value.compareTo(this.get(i)) <= 0) {
        super.add(i, value);
        return true;
      }
    }
    return super.add(value);
  }

  public void add(int index, T value) {
    this.add(value);
  }

  public T set(int index, T value) {
    if (value == null) {
      throw new IllegalArgumentException("You tried to set a null value! That is not allowed.");
    }
    T old = this.remove(index);
    this.add(value);
    return old;
  }
}
