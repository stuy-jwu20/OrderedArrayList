import java.util.*;
public class NoNullArrayList<T> extends ArrayList<T> {
  public T set(int index, T value) {
    if (index < 0 || index >= size()) {
      throw new IndexOutOfBoundsException("\n ! Your index is out of bounds! It should be at least 0 and less than " + size() + " but we received this from you: " + index + " !");
    }
    else if (value == null) {
      throw new IllegalArgumentException("You tried to set a null value! That is not allowed.");
    }

  }

  public boolean add(T value) {
    if (value == null) {
      throw new IllegalArgumentException("You tried to set a null value! That is not allowed.");
    }
  }

  public boolean add(int index, T value) {
    if (index < 0 || index >= size()) {
      throw new IndexOutOfBoundsException("\n ! Your index is out of bounds! It should be at least 0 and less than " + size() + " but we received this from you: " + index + " !");
    }
    else if (value == null) {
      throw new IllegalArgumentException("You tried to set a null value! That is not allowed.");
    }
  }
}