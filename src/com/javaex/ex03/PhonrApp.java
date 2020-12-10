package com.javaex.ex03;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class PhonrApp {

	public static void main(String[] args) throws IOException {
		Reader in=new FileReader("C:\\javaStudy\\PhoneDB.txt");
		BufferedReader br = new BufferedReader(in);
		while (true) {
			String str=br.readLine();
			
			if(str==null) {
				break;//올라오는 주소 값이 없다면 브레이크
			}else if (str!=null) {//올라오는 주소값이 있다면
				for (int i = 0; i <1; i++) {
					
					String[] fArray = str.split(",");
					//올라오는 주소값을 ,를 기준으로 누눠 배열 안에 넣는다.
					System.out.println("이름:"+fArray[0] );
					System.out.println("핸드폰:"+fArray[1] );
					System.out.println("회사:"+fArray[2] );
					System.out.println("");
				}
			}

		}
		br.close();
	}
}
