package chen.test.jdk;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class TestUtil {

	public static void main(String[] args) {
		Set a = new HashSet(Arrays.asList("1111,111,123".split(",")));
		System.out.println(a);
		System.out.println(a.size());
		a = new HashSet(Arrays.asList("1111,111,123"));
		System.out.println(a);
		System.out.println(a.size());
		a = new HashSet(Arrays.asList("".split(",")));
		System.out.println(a);
		System.out.println(a.size());
		//CollectionUtils.mergeArrayIntoCollection("1111,111,123".split(","), a);//Spring
	}
}
