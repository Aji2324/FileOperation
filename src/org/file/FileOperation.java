package org.file;

import java.io.File;
import java.io.IOException;

public class FileOperation {

	public static void main(String[] args) throws IOException {
		
		File file=new File("D:\\Ajith\\java.txt");
		
		//To create new folder
		
		boolean newFile = file.createNewFile();
		
		boolean canRead = file.canRead();
		System.out.println(canRead);
		
		boolean canWrite = file.canWrite();
		System.out.println(canWrite);
		
		boolean exists = file.exists();
		System.out.println(exists);
		
		String[] list = file.list();
		
		for (String string : list) {
			System.out.println(string);
			
		}
		
		File[] listFiles = file.listFiles();
		
		
		
	}
		
}
