package com.kh.classCircle;

public class Circle {
	//�������
	/*final double PI = 3.14;
	 *private static final double PI = 3.14;
	 *pirvate final double PI = 3.14;
	 */
	private final double PI = 3.14; //���
	private int radius = 1; //����

	public int getRadius() {
		return radius;
	}
	public void setRadius(int radius) {
		this.radius = radius;
	}
	public double getPI() {
		return PI;
	}
	
	//������
	public Circle() {
		//�⺻ ������
	}
	//�޼ҵ�
	//�������� ���� ���
	public void inRadius() {
		//������ ���� ������ų ���� ������ �� �ִ�!
		radius++;
		
	}
	public void AreaCircle() {
		//���� ���̸� ����ϰ� ����ϴ� �޼ҵ�
		double area = getPI() * getRadius() * getRadius();
		System.out.println("���� ���� : " + area);
		
	}
	public void SizeofCircle() {
		System.out.println("���� ũ��(������) : " +  getRadius());
	}
	
}