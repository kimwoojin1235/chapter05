package com.javaex.ex02;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class CharStreamApp {

	public static void main(String[] args) throws IOException{
		Writer fw=new FileWriter("C:\\javaStudy\\song.txt");
		//통로를 만들었다.
		BufferedWriter bW= new BufferedWriter(fw);
		//통로의성능을 확장시켰다.
		bW.write("학교종이 땡땡땡");//문자열을 입력
		bW.newLine();//줄바꿈
		bW.write("어서모이자");
		bW.newLine();
		bW.write("선생님이 우리를 ");
		bW.newLine();
		bW.write("기다리신다. ");
		
		bW.close();//닫아야지 정상적으로 작동을 한다.
	}

}
