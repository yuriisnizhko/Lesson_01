package lesson_1;

public class Lesson_1 {
	public static void main(String args[]) {
		byte a = 12;
		short b = 1000;
		int c = 2000;
		long num = 10;
		float num_1 = 20.5f;
		double num_2 = 20.0001;
		char x = 'A';
		boolean isfalse = false;
		
		Integer num5 = 5;
		System.out.println(num5.intValue());
		
		System.out.println(Byte.MAX_VALUE);
		System.out.println(Byte.MIN_VALUE);
		System.out.println(Short.MAX_VALUE);
		System.out.println(Short.MIN_VALUE);
		System.out.println(Integer.MAX_VALUE);
		System.out.println(Integer.MIN_VALUE);
		System.out.println(Long.MAX_VALUE);
		System.out.println(Long.MIN_VALUE);
		System.out.println(Float.MAX_VALUE);
		System.out.println(Float.MIN_VALUE);
		System.out.println(Double.MAX_VALUE);
		System.out.println(Double.MIN_VALUE);
		
		int[] myarray = new int[10];
		
		for (int i = 0; i < myarray.length; i++) {
			myarray[i] = i;
		}
			
		int maxval = 0;
		int minval = 0;
		
		for (int i = 0; i < myarray.length; i++) {
			if (minval > myarray[i]) {
				minval = myarray[i];
			}
			if (maxval < myarray[i]) {
				maxval = myarray[i];
			}
		}
		System.out.println("min_value - " + minval);
		System.out.println("max_value - " + maxval);
		// first commit
	}
}
