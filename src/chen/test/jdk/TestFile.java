package chen.test.jdk;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.OutputStreamWriter;

public class TestFile {
	public static void main(String[] args) throws Exception {
//		File f = new File("D:/f");
//		if(!f.exists()) {
//			System.out.println(222);
//			f.mkdirs();
//		}
//		if(f.exists()) {
//			System.out.println(111);
//		}
		
		String fileEncode = System.getProperty("file.encoding");  
		System.out.println(fileEncode);
		//File outFile = new File("D:/a.txt");
		File outFile = new File("/home/settle/aa.txt");
		//OutputStreamWriter ow = new OutputStreamWriter(new FileOutputStream(outFile, true), fileEncode);
		BufferedWriter ow = new BufferedWriter(new FileWriter(outFile)); 
		ow.write(new String("ÖÐÎÄ".getBytes("GBK"), "GBK"));  
		ow.write(new String("123213|".getBytes("GBK"), "GBK")); 
		ow.close();  
	}
}
