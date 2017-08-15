package chen.test.jdk;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.DecimalFormat;

public class TestFormat {
	public static void main(String[] args) throws Exception {
		// formt���������ǣ�������λС������ֻ������λ
		System.out.println(String.format("%.2f", 2.1415D));
		System.out.println(String.format("%.2f", 2.1445D));
		System.out.println(String.format("%.2f", 2.141D));
		System.out.println(String.format("%.2f", 2.1413D));
		System.out.println(String.format("%.2f", 2.1416D));
		System.out.println(String.format("%.2f", 2.1444445D));
		System.out.println(String.format("%.2f", 2.141111D));
		System.out.println(String.format("%.2f", 2.141D));
		System.out.println(String.format("%.2f", 11.545D));
		System.out.println(String.format("%.2f", 11.555D));
		System.out.println(String.format("%.2f", 11.556D));
		System.out.println(String.format("%.2f", 11.554D));
		System.out.println(String.format("%.2f", 11.5551D));

		/*
		 �������м���������
		 11.556 = 11.56 ------���� 
		 11.554 = 11.55 -----���� 
		 11.5551 =11.56 -----���������λ
		 11.545 = 11.54 -----�����������ǰλΪż��Ӧ��ȥ
		 11.555 = 11.56 -----�����������ǰλΪ����Ӧ��λ
		 */

		DecimalFormat df = new DecimalFormat("0.00");
		df.setRoundingMode(RoundingMode.HALF_UP);
		System.out.println();
		System.out.println(df.format(11.556D));
		System.out.println(df.format(11.554D));
		System.out.println(df.format(11.5545D));
		System.out.println(df.format(11.5541D));
		System.out.println(df.format(11.5456D));
		System.out.println(df.format(11.556D));
		System.out.println();
		BigDecimal b = new BigDecimal("11.5545");
		b.setScale(2, RoundingMode.HALF_UP);

		System.out.println(b.setScale(2, RoundingMode.HALF_UP).doubleValue());
		
		//�ɼ�����һ���ġ�

	}
}
