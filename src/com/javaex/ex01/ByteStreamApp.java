package com.javaex.ex01;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class ByteStreamApp {

	public static void main(String[] args) throws IOException {
		/*개념만 이해하도록 한것
		InputStream in = new FileInputStream("C:\\javaStudy\\img.jpg");
		//데이터를 받아 드릴 통로를 만들어 주었다.	
		OutputStream out= new FileOutputStream("C:\\javaStudy\\byteimg.jpg");
		//데이터를 내보내는 통로를 만들어 주었다.
		bOata
		while (true) {
			int bOata=in.read();
			//read는 리턴을 int로 하기 때문에 숫자를 주어야 한다.
			//FileInputStream에read라는 메소드가 있다. 
			if(bOata==-1) {//데이터의 마지막인지 체크
				System.out.println("복사끝 ");
				break;     //마지막이면 반복문 탈출
				//의미가 있는 데이터가 들어오다 의미가 없어 진다면 -1을 주고 빠져나온다.
			}
			out.write(bOata);//데이터가 있다면 쓴다.
			//write를 통해서 받아들인 데이터를 사용을 한다.
		}
		out.close();
		in.close();//끝
		*/
		InputStream in = new FileInputStream("C:\\javaStudy\\img.jpg");
		//데이터를 받아 드릴 통로를 만들어 주었다.	
		OutputStream out= new FileOutputStream("C:\\javaStudy\\byteimg.jpg");
		//데이터를 내보내는 통로를 만들어 주었다.
		
		
		byte[] buff=new byte[1024];
		//1024개의 데이터를 담는 배열
		System.out.println("복사시작");
		while (true) {
			int bOata =in.read(buff);
			//배열을 줌으로 좀더 많은 데이터를 한번에 받아들일수 있다.
			if(bOata==-1) {
				break;
			}
			out.write(buff);
			//내보낼 때도 배열을 주어서 한버에 많은 데이터를 내보낸다.
		}
		System.out.println("복사 끝");
		out.close();
		in.close();
	}

}
