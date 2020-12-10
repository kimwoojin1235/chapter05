package com.javaex.ex04;


import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.util.ArrayList;
import java.util.List;


public class PhoneApp {

	public static void main(String[] args) throws IOException {
		List<Person> pList = new ArrayList<Person>();
		Writer in=new FileWriter("C:\\javaStudy\\PhoneDB.txt");
		BufferedWriter Bw = new BufferedWriter(in);
		
		Person pnew = new Person("이효리", "010-2222-3333", "031-2323-4441");
		Person anew = new Person("정우성", ",010-2323-2323", ",02-5555-5555");
		Person bnew = new Person("이정재", "010-9999-9999", "02-8888-8888");
		Person cnew = new Person("김우진", "010-2363-8725", "02-995-8725");
		pList.add(pnew);
		pList.add(anew);
		pList.add(bnew);
		pList.add(cnew);
				
		for(int i=0; i<pList.size(); i++) {
			Bw.write(pList.get(i).getName()+ "," +pList.get(i).getHp()+ "," +pList.get(i).getCompany());
			Bw.newLine();
		}
				
		Bw.close();
		
	}

}
