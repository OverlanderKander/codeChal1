package week1;

public class Test2 {

	public static void main(String[] args) {
		double d = 100.04;
		long l = (long)d; // (explicit cast required, larger data type to smaller
		int i = (int)l; // (explicit cast required, larger data type to smaller

		System.out.println("Double value " + d);
		System.out.println("Long value " + l);
		System.out.println("Int value " + i);
	}

}
