package onedot03;

public class IfPermutation{

	public static void main(String[] args){
		String str1 = "";
		String str2 = "pleh";
		System.out.println(ifPermutation(str1,str2));
	}

	private static boolean ifPermutation(String str1, String str2){
		if(str1 == null || str2 == null){
			return false;
		}
		if(str1.length() != str2.length()){ 
			return false;
		}


		int[] bitmap1 = getBitMap(str1);
		int[] bitmap2 = getBitMap(str2);
		for(int i = 0 ; i < bitmap1.length; i++){
			if(bitmap1[i] != bitmap2[i])
				return false;
		}
		return true;
	
	}

	private static  int[] getBitMap(String str){
		int[] bitmap = new int[256];
		for(int i = 0 ; i < str.length(); i++){
			bitmap[str.charAt(i)]++;
		}

		return bitmap;
	}
}