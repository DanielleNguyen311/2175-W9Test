
public class CharacterCountLongway {
	public static void main(String [] args)
	
	{
		countChar("daaanielle !");
	}
	
	public static void countChar(String str)
	{
		int [] counts = new int [str.length()];
		char a = 'a';
		char b = 'b';
		for(int i = 0; i < str.length(); i++)
		{
			if (str.charAt(i) == 'a' || str.charAt(i) == 'A')
			{
				counts[i]++;
			}
			if (str.charAt(i) == 'b' || str.charAt(i) == 'B')
				counts[i]++;
		}
		for(int i = 0; i < str.length(); i++)
		{
			System.out.print(str.charAt(i) + " " + counts[i]+ "\n");
		}	
	}
	

}


