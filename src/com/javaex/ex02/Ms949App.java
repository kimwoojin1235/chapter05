package com.javaex.ex02;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class Ms949App {

	public static void main(String[] args) throws IOException {
		InputStream in = new FileInputStream("C:\\javaStudy\\PhoneDB.txt");
		InputStreamReader isr= new InputStreamReader(in, "PhoneDB");
		//번역기 이다. 번역할 대상의 이름도 알려주어야
		BufferedReader br=new BufferedReader(isr);
		//세개을 서로 연결을 시켰다.
		
		while (true) {
			String str=br.readLine();//한줄씩 읽어온다.줄바꿈기호 제외
			if(str==null) {
				break;
			}
			System.out.println(str);
		}
		
		
		br.close();
	}

}
