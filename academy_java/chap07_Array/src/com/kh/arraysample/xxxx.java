package com.kh.arraysample;

import java.util.Scanner;

public class xxxx {
	/*
	 * ���ڿ��� �Է¹޾Ƽ� ���� �ϳ��ϳ� �迭�� �ְ� 
	 * �˻��� ���ڰ� ���ڿ��� �� �� �� �ִ��� ������ 
	 * ���° �ε����� ��ġ�ϴ��� �ε��� �������
	*/
	public static void main (String[] args) {
		System.out.println("���ڿ��� �Է����ּ���.");
		Scanner sc = new Scanner(System.in);
		String a = sc.next();
		
		char[] aArray = a.toCharArray();
		
		int aLength = aArray.length;
		
		System.out.println("���ڿ��� �ѹ� �� �Է����ּ���.");
		char aSearch = sc.next().charAt(8);
		System.out.println("3���� ��ġ�� ���ڴ� : " + aSearch);
		 
		int count = 0;
		
		for (int i = 0; i < aLength; i++) {
			if(aArray[i] == aSearch) {
				System.out.println("[" + aSearch + "]�� index ��ġ : " + i);
				count++;
			}
		}
		System.out.println("[" + aSearch + "]�� ���ڿ� �ߺ��Ǵ� ������ ���� " +  + count + "�� �Դϴ�.");
		
	}
}