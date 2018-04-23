/**
 * 
 */
package com.drk.corejava.apps;

import java.util.LinkedHashMap;
import java.util.Map;

/**
 * @author raj
 * This program finds the first repeated character in a string.
 *
 */
public class FirstRepeatedChar {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String initialStr = "abracadabra";
		//Linked Hashmap is used to get the characters in its order of presence
		Map<String, Integer> strMap = new LinkedHashMap<String, Integer>(); 
		for(int i=0; i < initialStr.length();i++) {
			String key = String.valueOf(initialStr.charAt(i));
			if(!strMap.containsKey(key)) {
				strMap.put(key,1);
			}else {
				strMap.put(key, strMap.get(key)+1);
			}
		}
		System.out.print("The output is : ");
		for(Map.Entry<String, Integer> str : strMap.entrySet())
		{
			
			if(str.getValue() > 1) {
				System.out.print(str.getKey());
			}
		}
	}

}
