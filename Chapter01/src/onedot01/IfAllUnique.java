package onedot01;

public class IfAllUnique{

	public static void main(String[]args){
		String[] strs = {"abcde","sdfaf",null};
		for(String str : strs){
			System.out.println(ifAllUnique(str));
		}

	}

	private static boolean ifAllUnique(String str){
		if (str == null)
		{
			System.out.println("we dotn't accpet null parameter");
			System.exit(-1);
		}
		int bitmaplength = 256;
		boolean[] bitmap = new boolean[bitmaplength];
		for(int i = 0 ; i < bitmap.length; i++){
			bitmap[i] = false;
		}
		for(int j = 0 ; j < str.length(); j++){
			if(bitmap[str.charAt(j)] == true){
				return false;
			}else{
				bitmap[str.charAt(j)] = true;
			}
		}
		return true;
	}
}