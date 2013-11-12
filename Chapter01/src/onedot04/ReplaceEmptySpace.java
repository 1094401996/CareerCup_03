package onedot04;

import java.util.Arrays;

public class ReplaceEmptySpace
{
	public static void main(String[]args){

		char[] original = new String("abcd ed ak            ").toCharArray();
		int real_length = 10;
		System.out.println(Arrays.toString(replaceEmptySpace(original,real_length)));

	}


	public static char[] replaceEmptySpace(char[] original,int real_length){
		int spaceNumber = 0;
		for(int i = 0 ; i <  real_length; i++){
			if(original[i] == ' '){
				spaceNumber++;
			}
		}
		int k = real_length - 1 + 2 * spaceNumber;
		for(int j = real_length - 1; j >= 0; j--){
			if(original[j] != ' '){
				original[k--] = original[j];
			}else{
				original[k--] = '0';
				original[k--] = '2';
				original[k--] = '%';
			}
		}

		return original;
	}
}