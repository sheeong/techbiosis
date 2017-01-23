package example.exercise;

import java.util.ArrayList;
import java.util.List;

public class Rack<T extends Comparable<T>> {
	final private List<T> balls;
	final InsertionSort<T> sort;
	
	public Rack() {
		this.balls = new ArrayList<>();
		this.sort = new InsertionSort<>();
	}
	
	
	public void add(T item) { 
		balls.add( item);
	}
	
	public List<T> balls() { 
		sort.sort(balls);
		
		return balls; 
	}
	
}
