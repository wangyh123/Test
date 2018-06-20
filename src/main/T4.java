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
	            System.out.println("本机名称是："+ localname);
	            System.out.println("本机的ip是 ："+localip);
	            JOptionPane.showMessageDialog(null, "警告", "IP:1111已被加入黑名单", JOptionPane.ERROR_MESSAGE);
	        } catch (Exception e) {
	            // TODO Auto-generated catch block
	            e.printStackTrace();
	        }
	    }
}
