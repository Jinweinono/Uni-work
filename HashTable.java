package Secondyear;


public class HashTable {
	public String[] wordlist = new String[200];
	public static void main(String args[]) {
		HashTable testo = new HashTable();
		System.out.println(testo.ASCconvert("okay"));
		
		
	}
	
	public int ASCconvert(String tkey) {
		int value = 0;
		value = tkey.hashCode();
		return value;
	}
	public void insert(String ikey) {
		
		int size = wordlist.length;
		int num = ASCconvert(ikey);
		int result = Math.abs(num) % size;
		if(wordlist[result] == null ) {
			wordlist[result] = ikey;
			return;
		}
		else {
			int counter = result+1;
			boolean flag = false;
			while(counter<wordlist.length) {
				if(wordlist[counter] == null) {
					wordlist[counter] = ikey;
					flag = true;
					break;
				}
				counter ++;
			}
			if(counter == wordlist.length) 
			{
				if(flag == false) {
					int counter2 = 0;
					flag = true;
					while(counter2 < result) {
						if(wordlist[counter2] == null) {
							wordlist[counter2] = ikey;
							break;
						}
					}
				}
			}
			
			
		}
		System.out.println("Insert word:"+ ikey);
	}

	public void search(String target) {
		int targetvalue = ASCconvert(target);
		int result  = Math.abs(targetvalue) % wordlist.length;
		if(wordlist[result].compareTo(target) == 0) {
			System.out.println("Found word:"+target); 
		}
		else {
			System.out.println("The target word is not found.");
		}
		
	}
	public void printtable() {
		for(int p = 0; p < wordlist.length; p++) {
			System.out.print("--"+wordlist[p]+p+"--");
		}
	}
}
