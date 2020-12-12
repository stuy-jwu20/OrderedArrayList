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
    T old = super.set(index, value);
    return old;
  }

  public boolean add(T value) {
    if (value == null) {
      throw new IllegalArgumentException("You tried to add a null value! That is not allowed.");
    }
    super.add(value);
    return true;
  }

  public void add(int index, T value) {
    if (value == null) {
      throw new IllegalArgumentException("You tried to add a null value! That is not allowed.");
    }
    super.add(index, value);
  }
}
