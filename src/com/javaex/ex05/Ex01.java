package com.javaex.ex05;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Scanner;

public class Ex01 {

	public static void main(String[] args)throws IOException {
		/*
		Scanner sc=new Scanner(System.in);
		String msg=sc.nextLine();
		System.out.println(msg);
		*/
		//기존파일-->키보드(system.in사용)
		//InputStream in = new FileInputStream("C:\\javaStudy\\PhoneDB.txt");
		InputStreamReader isr=new InputStreamReader(System.in,"UTF-8");
		//키보드입력으로 하겠다. 파일은 UTF파일로 읽어줘라
		BufferedReader br=new BufferedReader(isr);
		
		String str =br.readLine();//한줄씩 읽어온다 줄바꿈기호 제외
		
		
		//출력
		//System.out.println(str);
		OutputStreamWriter osw=new OutputStreamWriter(System.out);
		BufferedWriter bW=new BufferedWriter(osw);
		bW.write(str);
		
		
		bW.close();
		br.close();
	}

}
