package onedot08;

import java.util.*;

public class IsRotation
{	

	public static void main(String[] args){
		String str1 = "abcd";
		String str2 = "cdba";

		System.out.println(isRotation(str1,str2));

	}
	public static boolean isRotation(String str1, String str2){
		if(str1 == null || str2 == null || str1.length() != str2.length()){
			return false;
		}
		String newstr = str1 + str1;
		return isSubstring(newstr,str2);

	}


	private static boolean isSubstring(String str1 , String str2){
		if(str1 == null || str2 == null || str1.length() < str2.length())
			return false;

		for(int i = 0 ; i <= str1.length() - str2.length() ; i++){
			int j = i ; //index for str1
			int k = 0 ; //index for str2
		
			while(k < str2.length() && str1.charAt(j) == str2.charAt(k)){
					j++;
					k++;
			}
			if( k == str2.length())
				return true;
		}
		return false;
	}
}