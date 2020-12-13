import java.util.*;
public class Tester {
  public static void main(String[] args) {

// NoNullArrayList Mini Tester//
    NoNullArrayList<String> noNull = new NoNullArrayList<String>();
    NoNullArrayList<String> noNull2 = new NoNullArrayList<String>(20);
    String letter = "a";
    for (int i = 0; i < 12; i++) {
      letter += "a";
      noNull2.add(0, letter);
    }
    for (int i = 0; i < 6; i++) {
      letter += "a";
      noNull.add(letter);
    }
    noNull2.add(2, "newWord");
    noNull2.add("");
    //noNull2.add(null);
    noNull.add(2, "newWord");
    noNull.add("");
    //noNull.add(null);

//OrderedArrayList Mini Tester//
    OrderedArrayList<Integer> ordered = new OrderedArrayList<Integer>();
    OrderedArrayList<Integer> ordered2 = new OrderedArrayList<Integer>(20);
    int num = 1000;
    for (int i = 0; i < 15; i++) {
      ordered2.add(num);
      num -= 100;
    }
    for (int i = 0; i < 6; i++) {
      ordered.add(num);
      num -= 100;
    }
    ordered2.add(7, 100);
    System.out.println(ordered2);
    ordered2.set(3, 666);
    System.out.println(ordered2);
  }
}
