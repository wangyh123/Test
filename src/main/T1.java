package main;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class T1 {
	public static void main(String[] args) throws IOException {
		File file = new File("D:/workspace/Test/src/main/aaa.txt");
		try {
			
			//输入流---输入文本内容到程序
			InputStream is=new FileInputStream(file);
			byte[] b = new byte[2*1024];
			int count = 0;
			int r = 0;
			while((r=is.read())!=(-1)){
				b[count++]=(byte)r;
			}
			is.close();
			System.out.println(new String(b));
			
			
			
			
//			//输出流---输出程序内容到文本
//			File file2 = new File("D:/workspace/Test/src/main/bbb.txt");
//			OutputStream os = new FileOutputStream(file2);
//			String str = new String(b);
//			byte[] b2 = str.getBytes();
//			os.write(b2);
//			os.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}


}
