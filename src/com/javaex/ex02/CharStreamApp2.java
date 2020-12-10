package com.javaex.ex02;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class CharStreamApp2 {

	public static void main(String[] args) throws IOException {
		Reader fr= new FileReader("C:\\javaStudy\\song.txt");
		//Reader fr= new FileReader("C:\\javaStudy\\MS949.txt");
		BufferedReader br = new BufferedReader(fr);
		
		while (true) {
			String Str= br.readLine();//한줄씩 불러론다. 줄바꿈기호 제외
			//readLine()파일에 있는 문자열을 불러와 str에 넣어농는다.
			if(Str== null) {//불러온 주소가 없다면
				break;
			}
			System.out.println(Str);
		}
		br.close();
	}

}
