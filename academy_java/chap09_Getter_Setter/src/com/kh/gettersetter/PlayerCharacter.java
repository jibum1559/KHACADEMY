package com.kh.gettersetter;

public class PlayerCharacter {
	private String name;   		//ĳ�����̸�
	private   int  health; 		//ü��
	private   int  attackPower; //�����Ŀ�
/*
	public PlayerCharacter(String name, int health, int attackPower) {
		this.name = name;
		this.health = health;
		this.attackPower = attackPower;
	}
*/
	/*
	 getter
	 	������ ���纻�� �����ֱ� ������ ���� ��ü�� �����ʹ� �ջ��Ű�� ����
	 	���������ʹ� ������
	 * */
	/*
	public PlayerCharacter() {
		
	}
	*/
	public String getName() {
		return name;
	}
	public int getHealth() {
		return health;
	}
	public int getAttackPower() {
		return attackPower;
	}
	
	/*
	 setter
	 �ܺο��� �޼ҵ带 ���� �����Ϳ� ������ �ϰ� �ȴٸ�
	 �޼ҵ�� �Ű���(=�Ű�����)�� �����ؼ� ������ ���� �����ͷ� ������ �� ����
	 * */
	
	public void setName(String name) {
		this.name = name;
	}
//setter���� �����Ѵ� ��⸦ �ϴ���
	public void setHealth(int health) {
		// ���࿡ ü���� 0�̶�� ���̰� ü���� 1�̻� �̸� �츮��
		this.health = health;
		if(health >= 1 ) { // ü���� 1 �̻��� ���
		} else { // ü���� 0 ���϶�� ü���� ǥ���� ��ġ�� ����.
			System.out.println("ü���� �����ϴ�...");
		}
		
	}
	
	//0 �̸��� ���� �־ 0������ ���� ��µ��� ����
	public void setAttackPower(int attackPower) {
		//���࿡ �Ŀ��� 0���� Ŭ ���
		if(attackPower  >= 1) {
			this.attackPower = attackPower;
		} else {
			this.attackPower = 0;
			System.out.println("power�� �������մϴ�.");
		}
		
	}
	
	//ĳ���� ���� ���
	public void displayInfo() {
		System.out.println("ĳ���� ���� : " + getName());
		System.out.println("ü�� ���� : " + health);
		System.out.println("���� �Ŀ� : " + getAttackPower());
	}
	
	//ĳ���� �����ϴ� �޼���
	public void attack(PlayerCharacter target) {
		System.out.println(getName() + "�� �ؼ� " + target.getName() + "���� " + getAttackPower() + "�������� ����ϴ�.");
		System.out.println("�����߽��ϴ�.");
	}
	
	//�ٸ� ĳ���ͷκ��� ���� �޾��� �� �޼���
	public void takeDamage(int damage) {
		System.out.println("[" + getName() + "]��" + damage + " ���� �޾ҽ��ϴ�.");
	}
}