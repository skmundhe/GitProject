package Array;

public class A2 {

	public static void main(String[] args) {

		// 1D array
		
		// declaration
	//	int[]a;
	//	int[]a;      // mostly use
	// int[]a;
	// int []a;
		
		// cration
		
	// a = new int[15];
		
		// declaration + creation 
		 
		int[][] a=new int[2][3];
		
		// initialization
		a[0][1]=10;
		a[1][1]=20;
		a[1][2]=30;
		
		// declaration + creation + intialization
		//int[] b= {10,30,40,50,60};
		
		System.out.println(a[0][0]);
		System.out.println(a[1][1]);
		
		// declaration + creation + initialization
				int[][] b={ {10,20,30,40,},{50,70,80},{90,100,110,120}};
					
					System.out.println(b[2][1]);  //100
					System.out.println(b[0][2]);	//30
				}

	}


