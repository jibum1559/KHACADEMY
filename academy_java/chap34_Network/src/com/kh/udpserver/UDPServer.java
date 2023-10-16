package com.kh.udpserver;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.text.SimpleDateFormat;
import java.util.Date;

/*
* ��Ʈ��ũ ����� ���� �߿��� Ŭ����
UDP(User Datagram Protocol) ����ؼ� �����͸� �ۼ��� �ϴµ� ���
DatagramSocket
	-UDP ����� ���� ���� Ŭ����
	-TCP ���ϰ� �ٸ��� ������ �����ϰų� ���� ������ �������� �ʰ� ������ ��Ŷ�� �׳� ������ �޴� ����

DatagramPacket
	-UDP ������ ��Ŷ�� ��Ÿ���� Ŭ����
	-�������� ���� ����� �����͸� ���� ��� �Ǵ� �����͸� ������ ����� �ּ� ���� ����
	-Packet �̶�? 
		��ǻ�� ��Ʈ��ũ�� �����ϴ� �������� ����ȭ�� ����
		�����͸� �ְ����� �� ���س��� ��Ģ
		Pack + Bucket �ռ���		
 */
public class UDPServer {
	//start() UDP ������ �����ϴ� �޼��� ���ܸ� ���� �� �����Ƿ� ����ó���� �ʿ�
	public void  start() throws Exception {
		//8888 �� ��Ʈ�� ����ϴ� ���� ������ ���� UDP ����� �̷����
		DatagramSocket socket = new DatagramSocket(8888);
		//inPacket : Ŭ���̾�Ʈ�κ��� �����͸� ������ �� ���
		//outPakcet : Ŭ���̾�Ʈ���� �����͸� ���� �� ���
		DatagramPacket inPacket, outPacket;
	
		byte[] inMsg = new byte[10];
		byte[] outMsg;
		//while ������ ����ؼ� ������ ����ؼ� ����
		//�� ������ ������ ����ؼ� Ŭ���̾�Ʈ�κ��� �����͸� �����ϰ� �����ϴ� ������ ��
		while(true) {
			//�����͸� �����ϱ� ���� ��Ŷ�� ����
			inPacket = new DatagramPacket(inMsg, inMsg.length);
			//��Ŷ�� ���� Ŭ���̾�Ʈ�κ��� �����͸� ����
			socket.receive(inPacket);
		
			//������ ��Ŷ���� Ŭ���̾�Ʈ�� IP & Port
			//inPacket�� ���� Ŭ���̾�Ʈ�� IP �ּҿ� Port��ȣ ���
			InetAddress address = inPacket.getAddress();
			int port = inPacket.getPort();
			
			//������ ���� �ð��� �ú��� ���·� ��ȯ
			//���� ���� �ð��� HH:mm:ss ������ ���ڿ��� ��ȯ (��ȯ �ƴϰ� ��ȯ)
			SimpleDateFormat simpleData = new SimpleDateFormat("[HH:mm:ss]");
			String time = simpleData.format(new Date());
			outMsg = time.getBytes(); //byte �迭�� ��ȯ
			
			//��Ŷ�� �����ؼ� Ŭ���̾�Ʈ���� ����
			outPacket = new DatagramPacket(outMsg,outMsg.length,address,port);
			}
		}
	//main �޼��� : UDPServer Ŭ������ �ν��Ͻ��� �����ϰ�
	//    start() �޼��带 ȣ���Ͽ� UDP ���� ����
	// ���� �߻��ϸ� ���� ó��
	public static void main(String[]args) {
		try {
			new UDPServer().start(); //Udp ���� ����
//			new UDPServer.start(); // () ������ error
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
}
