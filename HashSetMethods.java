package HashSET;

import java.util.HashSet;
import java.util.ArrayList;
//import java.util.HashSet;
public class HashSetMethods {

	public static void main(String[] args) {
HashSet<Integer> h=new HashSet();
h.add(10);
//System.out.println(h.add(10));

h.add(20);
h.add(30);
h.add(40);
System.out.println(h.add(60));
h.add(50);
System.out.println(h);
	}

}
