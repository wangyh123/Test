package main;

import java.net.InetAddress;
import java.util.Scanner;

import javax.swing.JOptionPane;

public class T4 {
	
	  public static void main(String[] args) {
	        // TODO Auto-generated method stub
	        InetAddress ia=null;
	        try {
	            ia=ia.getLocalHost();
	            
	            String localname=ia.getHostName();
	            String localip=ia.getHostAddress();
	            System.out.println("���������ǣ�"+ localname);
	            System.out.println("������ip�� ��"+localip);
	            JOptionPane.showMessageDialog(null, "����", "IP:1111�ѱ����������", JOptionPane.ERROR_MESSAGE);
	        } catch (Exception e) {
	            // TODO Auto-generated catch block
	            e.printStackTrace();
	        }
	    }
}
