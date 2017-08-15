package chen.test.jdk;

public class VolatileTest extends Thread {
	private static boolean flag = false;

	public void run() {
		while (!flag) {
			//在一个CPU操作之内，是有使用寄存器的，这时候，这个指令是缓存了flag的。比如 I +　１　、比如 I=1 这种操作，内部还是会缓存寄存器的。
			//1.如果falg 加上volatile修饰，一旦有别的线程改变主内存的值，这个操作的触发器就会失效，从而不得不取新值。从而停下来。
			//2.或者如果在这里加一行代码，随便什么，会使得，这个while变成多个CPU操作，就会重新读取主内存的值，从而停下来。
			
			//可见，static的数据还是会被缓存的到寄存器的，而不可能是在内存里做运算。运算都是在cpu里的寄存器中计算的。
			//线程并发的时候，多个线程访问static，可能会在各个线程的寄存器中拷贝一个副本，造成线程不安全。
			//而加上volatile后，各个线程缓存的变量值，总是最新的，一旦有一个线程把新值付给主内存，其他线程的寄存器的值就立即失效，所以就会自动取新值
			//但volatile还是线程不安全，因为，还是会造成多个线程的寄存器缓存了多个拷贝，虽然都是存的最新值，但是写主内存的时候会互相覆盖。
			
		}
	}

	public static void main(String[] args) throws Exception {
		new VolatileTest().start();
		Thread.sleep(2000);
		
		flag = true;
	}
}