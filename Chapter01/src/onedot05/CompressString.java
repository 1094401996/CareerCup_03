package onedot05;

public class CompressString
{
	public static void main(String[] args){
		String str = "aaaacccdkfjkdsfjjjjjjjjjjjjjjj";
		if(worthCompression(str)){
			System.out.println(compressString(str));
		}else{
			System.out.println("no need to compress");
		}
	}
	private static boolean worthCompression (String str){
		
		int repeattime= 1;
		char last_char = str.charAt(0);
		
		int estimate_length = 0; 

		for(int i = 1 ; i < str.length(); i++){
			if(str.charAt(i) != last_char){
				estimate_length += (String.valueOf(repeattime).length() + 1);
				last_char = str.charAt(i);
				repeattime = 1;
			}else{
				repeattime++;
			}
		}
		estimate_length += (String.valueOf(repeattime).length() + 1);

		if(estimate_length >= str.length())
			return false;
		return true;
	}

	private static String compressString(String str){
		StringBuffer newstr = new StringBuffer();
		int repeattime= 1;
		char last_char = str.charAt(0);

		for(int i = 1 ; i < str.length(); i++){
			if(str.charAt(i) != last_char){
				newstr.append(last_char);
				newstr.append(String.valueOf(repeattime));
				last_char = str.charAt(i);
				repeattime = 1;
			}else{
				repeattime++;
			}
		}
		newstr.append(last_char);
		newstr.append(String.valueOf(repeattime));
		
		return newstr.toString();

	}
}