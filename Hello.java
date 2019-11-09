import java.util.*;

public class Hello{
	public static void main(String[] args) {
		//constructor of BitSet
		BitSet bs1 = new BitSet();
		BitSet bs2 = new BitSet();

		//assigning value to set1
		bs1.set(0);
		bs1.set(1);
		bs1.set(5);
		bs1.set(3);
		bs1.set(4);
		bs1.set(2);
		bs1.set(6);

		bs2.set(5);
		bs2.set(7);
		bs2.set(1);
		bs2.set(3);
		bs2.set(11);
		bs2.set(2);
		bs2.set(6);
		bs2.set(9);

		//printing the bitsets
		System.out.println("sb1 "+bs1);
		System.out.println("sb2 "+bs2);

		//print the first clean bit of bs1
		System.out.println(bs1.nextClearBit(0));
		System.out.println(bs2.nextClearBit(0));
		


	}
}