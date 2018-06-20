package main;

import java.util.HashMap;
import java.util.Map;

public class T2 {
	public static void main(String[] args) {
		String str = "aaaabbbccddddde";
		System.out.print(ys(str));
	}
	
	public static String ys(String str){
		String result = "";
		HashMap<Character,Integer> map = new HashMap<Character, Integer>();
		for(int i=0; i<str.length(); i++){
		   char c = str.charAt(i);
		   Integer count = map.get(c);
		   map.put(c, count==null?1:count+1);
		}
		
		System.out.println("map:"+map.size());
		for(Map.Entry<Character, Integer> en : map.entrySet()){
			result = result + en.getKey() + en.getValue();
		}
		System.out.println("压缩后长度："+result.length()+"--原始长度："+str.length());
		return result.length()>str.length()?str:result;
	}
	
}
