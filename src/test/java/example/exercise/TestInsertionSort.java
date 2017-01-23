package example.exercise;

import java.util.ArrayList;
import java.util.List;

import org.junit.Assert;
import org.junit.Test;

public class TestInsertionSort {

	@Test
	public void testInsertInt() {
		Rack<Integer> rack = new Rack<>();
		List<Integer> expected = new ArrayList<>();
		expected.add(34);
		rack.add(34);
		System.out.println(rack.balls());
		Assert.assertEquals(expected, rack.balls());
		
		expected.add(53);
		rack.add(53);
		System.out.println(rack.balls());
		Assert.assertEquals(expected, rack.balls());
		
		expected.add(0, 12);
		rack.add(12);
		System.out.println(rack.balls());
		Assert.assertEquals(expected, rack.balls());
		
		expected.add(2, 45);
		rack.add(45);
		System.out.println(rack.balls());
		Assert.assertEquals(expected, rack.balls());
		
		expected.add(0, 12);
		rack.add(12);
		System.out.println(rack.balls());
		Assert.assertEquals(expected, rack.balls());
	}
	
	@Test
	public void testInsertStr() {
		Rack<String> rack = new Rack<>();
		List<String> expected = new ArrayList<>();
		expected.add("dewf");
		rack.add("dewf");
		System.out.println(rack.balls());
		Assert.assertEquals(expected, rack.balls());
		
		expected.add("isad");
		rack.add("isad");
		System.out.println(rack.balls());
		Assert.assertEquals(expected, rack.balls());
		
		expected.add(0,"bbbd");
		rack.add("bbbd");
		System.out.println(rack.balls());
		Assert.assertEquals(expected, rack.balls());
		
	}
	
	@Test
	public void testSort() {
		InsertionSort<Integer> sort = new InsertionSort<>();
		Integer data[] = new Integer[]{434, 134, 73, 92, 13};
		List<Integer> dd = new ArrayList<Integer>();
		for (int i=0; i < data.length; i++) {
			dd.add(0, data[i]);
			sort.sort(dd);
			//show(dd);
			//System.out.println("--------------");
	
		}
		List<Integer> expected = new ArrayList<>();
		expected.add(13);
		expected.add(73);
		expected.add(92);
		expected.add(134);
		expected.add(434);
		Assert.assertEquals(expected, dd);
	}
	
	private void show(List<Integer> a) {

		for (int i=0; i < a.size(); i++) {
			System.out.println(a.get(i));
		}
	}
}
