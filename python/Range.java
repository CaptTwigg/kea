package kea.python;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class Range implements Iterable<Integer> {

  private int limit;
  private int start;
  private int jump = 1;

  public Range(int limit) {
    this.limit = limit;
  }

  public Range(int start, int limit) {
    this.limit = limit;
    this.start = start;
  }

//  public Range(int start, int limit, int jump) {
//    this.limit = limit;
//    this.start = start;
//    this.jump = jump;
//  }

  public static Range range(int max) {
    return new Range(max);
  }

  public static Range range(int min, int max) {
    return new Range(min, max);
  }

//  public static Range range(int min, int max, int jump) {
//    return new Range(min, max, jump);
//  }

  @Override
  public Iterator<Integer> iterator() {
    final int max = limit;
    return new Iterator<Integer>() {

      private int current = start;

      @Override
      public boolean hasNext() {
        return current < max;
      }

      @Override
      public Integer next() {
        if (hasNext()) {
          return current++;
        } else {
          throw new NoSuchElementException("Range reached the end");
        }
      }

      @Override
      public void remove() {
        throw new UnsupportedOperationException("Can't remove values from a Range");
      }
    };
  }

}
