package com.kh.example.practice7;

import java.util.ArrayList;

/*
* ArrayList �̿��ؼ� ���ֳ����ĳ���
* ���� 3ȸ 1,3,5 ->����, ����, �׸� ����
* ���ϱ� 2ȸ ->��Ȳ, [���ο�],�Ķ�,[�����Ķ�]
* ���� for�� �̿��ؼ� ���� ����ϱ�
* �� �� ��� �� �� ��
*/
public class ArrayList3_1 {

	public static void main(String[] args) {
		
		//Ÿ�� �� ��ü ����
		ArrayList<String> rainbow = new ArrayList<>();
		System.out.println("rainbow : " + rainbow);
		
		//��� �߰�
		rainbow.add("������");
		System.out.println("������ �߰� : " + rainbow);
		rainbow.add("��Ȳ��");
		System.out.println("��Ȳ�� �߰� : " + rainbow);
		rainbow.add("�����");
		System.out.println("����� �߰� : " + rainbow);
		rainbow.add("�ʷϻ�");
		System.out.println("�ʷϻ� �߰� : " + rainbow);
		rainbow.add("�Ķ���");
		System.out.println("�Ķ��� �߰� : " + rainbow);
		rainbow.add("����");
		System.out.println("���� �߰� : " + rainbow);
		rainbow.add("�����");
		System.out.println("����� �߰� : " + rainbow);
		
		System.out.println();
		
		//���� �� ��� ����
		rainbow.set(1, "����");
		rainbow.set(3, "����");
		rainbow.set(5, "�׸�");
		System.out.println("���� ���� : " + rainbow);
		
		System.out.println();
		
		//���ϴ� ��ġ�� ��� �߰�
		rainbow.add(1, "���ο�");
		System.out.println("���ο� ���ϱ� : " + rainbow);
		rainbow.add(6, "���� �Ķ�");
		System.out.println("���� �Ķ� ���ϱ� : " + rainbow);
		
		System.out.println();
		
		//����� ������ Ȯ��
		int size = rainbow.size();
		System.out.println("������ ���� : " + size);
		
		//���ϴ� ��Ҹ� �����Ͽ� ���� ����� ���
		rainbow.remove(1);
		rainbow.remove(1);
		rainbow.remove(1);
		rainbow.remove(1);
		rainbow.remove(2);
		rainbow.remove(2);
		System.out.println("���� ���� ���� : " + rainbow);
	}
	
}