
public class CharacterCount {
	
	public static void main(String[] args)
	{
		CharacterCount str = new CharacterCount();
		str.countChars("daaanie elle");
	}
	
	public void countChars(String str)
	{
		char[] letters;
		while(str.length() != 0) {
			letters = str.toCharArray();
			char ch = letters[0];
			int count = 1;
			for(int i = 1; i < letters.length; i++)
			{
				if(ch == letters[i])
					count++;
			}
			//No count spaces and dot
			if(ch!= ' ' || ch!= '.')
				System.out.println(ch + " " + count);
			
			str = str.replace("" + ch, "");
			
		}
	}

}
