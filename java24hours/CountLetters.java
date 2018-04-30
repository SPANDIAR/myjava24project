package com.java24hours;

public class CountLetters {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String[] Phrase = {
				"My name is Sankar",
				"My last name is Pandiarajan"
		};
		
		int[] Counts = new int[26];
		
		for(int i=0; i < Phrase.length; i++){
			//System.out.println(Phrase[i]);
			String Indiv = Phrase[i];
			Indiv=Indiv.toUpperCase();
			System.out.println(Indiv);
			
			for(int j=0; j< Indiv.length(); j++)
			{
				char alphabet = Indiv.charAt(j);
				if ((alphabet >= 'A') & (alphabet <= 'Z'))
				{
					Counts[alphabet - 'A']++;
				}
			}
		}
		
		for(char k='A'; k<='Z'; k++){
			System.out.println(k + ":" + Counts[k - 'A']);
		}

	}

}
