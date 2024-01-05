package com.javaex.ex01;
public class MemberApp {

	public static void main(String[] args) {
		Member[] memArray=new Member[3];
		Member mem01=new Member("jws", "정우성", 5000);
		Member mem02=new Member("yjs", "유재석", 3000);
		Member mem03=new Member("lhr", "이효리", 4000);
		
		memArray[0]=mem01;
		memArray[1]=mem02;
		memArray[2]=mem03;
		
		for(int i=0; i<memArray.length; i++) {
			memArray[i].showInfo();
		}
				
	}

}
