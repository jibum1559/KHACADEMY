package com.kh.finalSample;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.net.InetAddress;
import java.net.Socket;

public class TcpClient {
	public static void main(String[] args) throws Exception {
		int port =3333;
		String serverIP;//�� ������ �ּ�
		serverIP = InetAddress.getLocalHost().getHostAddress();
		System.out.println(serverIP);
		try {
			//serverIP = InetAddress.getLocalHost().getHostAddress();
			//System.out.println("serverIP");
			Socket socket = new Socket(serverIP, port);
			System.out.println("server connect");
			
			//Ŭ���̾�Ʈ�� ����� ���� �� ��� ��Ʈ�� ����
			BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			OutputStream out = socket.getOutputStream();
			
			//Ŭ���̾�Ʈ���� ������ �޼��� ����
			String msg = "hi . server";
			out.write(msg.getBytes());
			out.flush();
			
			socket.close();
			
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	
}