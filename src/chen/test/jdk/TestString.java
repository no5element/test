package chen.test.jdk;

public class TestString {
	public static void main(String[] args) {
		System.out.println("111111\r\n22222\r2\n\r2\n2");
		System.out.println("111111\r\n22222\r2\n\r2\n2".replaceAll("(\r\n|\r|\n|\n\r)", ""));
		System.out.println("D123".substring(0,1));
		System.out.println("D123".substring(2,4));
		
		
		
		 Integer strange = 1;
		  Integer strange1 = 1;
		  Integer strange2 = 128;
		  Integer strange3 = 128;
		  System.out.println("strange == strange1:" + (strange == strange1));
		  System.out.println("strange2 == strange3:" + (strange2 == strange3));
		  
		  System.out.println("123" + null + "213");
		  
		  if(Long.valueOf("20161128195539") > Long.valueOf("20161128195538")){
			  System.out.println("123");
		  }
		  
		  
		  int a = (int)(Math.random()*(9999-1000+1))+1000;//产生1000-9999的随机数
		  System.out.println(a);
		  System.out.println(Math.random()*(9999-1000+1));
		  
		  a = (int)0.1;
		  System.out.println(a);
		  a = (int)0.9999999;
		  System.out.println(a);
		  a = (int)0.15;
		  System.out.println(a);
		  a = (int)0.11;
		  System.out.println(a);
		  System.out.println("12345".substring(0, 3));
	}
}
