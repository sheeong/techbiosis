package example.exercise;

import java.util.List;

public class InsertionSort<T extends Comparable<T>> {
	public InsertionSort() {}
	
	public void sort(List<T> a) {
		int n = a.size();
        for (int i = 0; i < n; i++) {
            for (int j = i; j > 0 && less(a.get(j), a.get(j-1)); j--) {
                exch(a, j, j-1);
            }
            assert isSorted(a, 0, i);
        }
        assert isSorted(a);
	}
	
	private boolean less(T v, T w) {
		return ((Comparable<T>)v).compareTo(w) < 0;
	}
	
	private void exch(List<T> a, int i, int j) {
		T swap = a.get(i);
		a.set(i, a.get(j));
		a.set(j, swap);
	}
	
	private boolean isSorted(List<T> a) {
		return isSorted(a, 0, a.size() - 1);
	}
	private boolean isSorted(List<T> a, int lo, int hi) {
		for (int i=lo+1; i <= hi; i++) {
			if (less(a.get(i), a.get(i-1))) return false;
		}
		return true;
	}
	
}
