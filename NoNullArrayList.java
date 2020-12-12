import java.util.*;
public class NoNullArrayList<T> extends ArrayList<T> {

  public NoNullArrayList() {
    super();
  }

  public NoNullArrayList(int startingCapacity) {
    super(startingCapacity);
  }

  public T set(int index, T value) {
    if (value == null) {
      throw new IllegalArgumentException("You tried to set a null value! That is not allowed.");
    }
    T old = this.get(index);
    this.set(index, value);
    return old;
  }

  public boolean add(T value) {
    if (value == null) {
      throw new IllegalArgumentException("You tried to set a null value! That is not allowed.");
    }
    return this.add(value);
  }

  public void add(int index, T value) {
    if (value == null) {
      throw new IllegalArgumentException("You tried to set a null value! That is not allowed.");
    }
    this.add(index, value);
  }
}
