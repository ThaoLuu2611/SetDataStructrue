import java.util.*;
import java.util.Map.Entry;
public class SetExample {
/*	Set in Java
	2
	Set is an interface which extends Collection. It is an unordered collection of objects in which duplicate values cannot be stored.
	Basically, Set is implemented by HashSet, LinkedSet or TreeSet (sorted representation).
	Set has various methods to add, remove clear, size, etc to enhance the usage of this interface*/
	public void printSet(){
		System.out.println("----------------Set example---------------------------");
		Set<String> flowerHashSet = new HashSet();
		flowerHashSet.add("rose");
		flowerHashSet.add("violet");
		flowerHashSet.add("daisy");
		flowerHashSet.add("tuberose");
		flowerHashSet.add("daisy");
		//for(int i = 0;i< flowerHashSet.size();i++)
			System.out.print(flowerHashSet);
			System.out.print("flowerHashSet");
			//Order
		TreeSet<String> treeSet = new TreeSet<String>(flowerHashSet);
		System.out.println(treeSet);

		Iterator iterator = treeSet.iterator();
	
		while(iterator.hasNext())
			System.out.print(iterator.next() + " ");

	}
	// check if givens tring has all unique character
	boolean isUnique(String str){
		char[] arr = str.toCharArray();
		Set<Character> set = new HashSet();
		for(Character c: arr){
			if(!set.add(c))
				return false;
		}
		return true;
	}
	
	public void listExample(){
		System.out.println("---------List example---------------");
		List<String> list = new ArrayList();
		list.add("Hanoi");
		list.add("Vietnam");
		list.add("Newyork");
		list.add("Newyork");
		list.add("Bankok");
		list.add("Hanoi");
		//access via index;
		System.out.println("list element at 0 is "+ list.get(0));
		//access via iterator
		Iterator iterator = list.iterator();
		while(iterator.hasNext())
			System.out.print(iterator.next()+" ");
		//access via for-loop
		for(String string:list){
			System.out.print("\n"+string + " : ");
		}
	}
	public void hastMapExample(){
		System.out.println("--------------------HastSet example---------------------");
		HashMap<Integer, String> hashMap = new HashMap();
		hashMap.put(2, "Peter");
		hashMap.put(3, "John");
		hashMap.put(3, "Johndd");
		hashMap.put(43, "Johnn");
		hashMap.put(4, "Mary");
		hashMap.put(5, "Taylor");
		hashMap.put(6, "Lee");
		hashMap.put(6, "Leee");
		if(hashMap.containsKey(2))
			System.out.println("the value of 2 is "+hashMap.get(2));
		if(hashMap.containsValue("John"))
			System.out.println("the key of John is "+hashMap.get("John"));
		for(Integer key: hashMap.keySet())
			if(hashMap.get(key).equals("Peter"))
				System.out.println("there is peter");
		for(Integer key: hashMap.keySet())
			System.out.print("\n "+key+":"+hashMap.get(key)+" ");
		
		System.out.println();
		Set set = hashMap.entrySet();
		Iterator iterator = set.iterator();
		while(iterator.hasNext()){
			Map.Entry entry = (Entry) iterator.next();
			System.out.print(" key = "+ entry.getKey());
			System.out.println(" value = "+ entry.getValue());
		}		
	}
	
	public void treeMapExample(){
		System.out.println("------------------------TreeMap example -----------------------------");
		TreeMap<Integer, String> treeMap = new TreeMap();
		treeMap.put(23,"aaa");
		treeMap.put(2,"bbb");
		treeMap.put(3,"aaa1");
		treeMap.put(44,"bbb");
		for(Integer key: treeMap.keySet())
			System.out.print("\n "+key+":"+treeMap.get(key)+" ");
		treeMap.remove(23);
		 /* Display content using Iterator*/
	      Set set = treeMap.entrySet();
	      Iterator iterator = set.iterator();
	      System.out.println();
	      while(iterator.hasNext()) {
	         Map.Entry mentry = (Map.Entry)iterator.next();
	         System.out.print("key is: "+ mentry.getKey() + " & Value is: ");
	         System.out.println(mentry.getValue());
	      }
	}
	
	public void stringTest(){
		String s1 = "abcdef";
		System.out.println(s1.substring(0,s1.length() - 2));
		String s2="x1-x2-x3-x4?x9+x7::\\x99@x222";
		String arrS2[] = s2.split("-|\\+|\\:|\\@");
		for(String string: arrS2)
			System.out.print(string + " ");
		String s3 = "1 2 3 4 6";
		String[] arrS3 = s3.split(" ");
		System.out.println();
		int[] number = new int[arrS3.length];
		for(int i = 0 ;i < arrS3.length; i++ ){
			number[i] = Integer.parseInt(arrS3[i]);
			System.out.print(number[i]+ " ");
		}
		String s4 = "xyz!abc";
		System.out.println();
		String[] arrS4 = s4.split("\\!");
		for(String s: arrS4)
			System.out.print(s+" ");
		int x = 5;
		String x1 = Integer.toString(x);
		char x2 = '6';
		if(Character.isDigit(x2))
			System.out.println("\n"+x2+" is digit");
		char x3 = 'b';
		if(Character.isAlphabetic(x3))
			System.out.println(x3+" is alphabet");
	}
	
	public void testASCII(){
		char n1 = 'A';
		char n2 = 'Z';
		System.out.print( n2-n1);
	}
}
