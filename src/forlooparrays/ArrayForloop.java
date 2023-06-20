package forlooparrays; //package//

public class ArrayForloop { //class//
	
	public static void main(String[] args) {
		
		//data variable [] = new data[length]//
		
		int a [] = new int[5];
		
		a[0] = 11;
		a[1] = 12;
		a[2] = 13;
		a[3] = 14;
		a[4] = 15;
		
		System.out.println(a[2]);
		System.out.println(a[3]);
		System.out.println(a[4]);
		
         //data object = array declare .length// values declared as integer//
		
		int l = a.length;
		
		System.out.println(l);
		
		//for loop//
		
		for (int i=0;i<=a.length;i++) {
			
			System.out.println("I am there");
		}
		
		
	}

}
