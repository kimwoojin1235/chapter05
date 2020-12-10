package com.javaex.ex01;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class BuffedStramApp {

	public static void main(String[] args)throws IOException {
		InputStream in = new FileInputStream("C:\\javaStudy\\img.jpg");
		//통로만 준비
		BufferedInputStream bin=new BufferedInputStream(in);
		//BufferedInputStream(bin)안에 in의 값을 넣어 주었다.
		OutputStream out= new FileOutputStream("C:\\javaStudy\\Buffimg.jpg");
		BufferedOutputStream bout = new BufferedOutputStream(out);
		//BufferedOutputStream안에 out의 값을 넣어줌
		//BufferedOutputStream안에는 이미 배열이 담겨져 있음
		System.out.println("복사시작");
		while (true) {
			int bData = bin.read();
			//bin의 리턴 값이 bData에 담김
			System.out.println("복사끝");
			if (bData==-1) {
				break;
			}
			bout.write(bData);		
		}
		bin.close();
		//프로그램에는 bin이 연결되어 있으므로 bin을 닫으면 못둘어간다.
		bout.close();
	}

}
