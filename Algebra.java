

public class Algebra {
	public static void main(String args[]) {
	    // Tests some of the operations
	    System.out.println(plus(2,3));   // 2 + 3
	    System.out.println(minus(7,2));  // 7 - 2
   		System.out.println(minus(2,7));  // 2 - 7
 		System.out.println(times(3,4));  // 3 * 4
   		System.out.println(plus(2,times(4,2)));  // 2 + 4 * 2
   		System.out.println(pow(5,3));      // 5^3
   		System.out.println(pow(3,5));      // 3^5
   		System.out.println(div(12,3));   // 12 / 3    
   		System.out.println(div(5,5));    // 5 / 5  
   		System.out.println(div(25,7));   // 25 / 7
   		System.out.println(mod(25,7));   // 25 % 7
   		System.out.println(mod(120,6));  // 120 % 6    
   		System.out.println(sqrt(36));
		System.out.println(sqrt(263169));
   		System.out.println(sqrt(76123));
	}  

	// Returns x1 + x2
	public static int plus(int x1, int x2) {
		if(x2<0){
			for(int i=0;i>x2;i--){
			x1--;
		}
		return x1;
	}
		
		for(int i=0;i<x2;i++){
			x1++;
		}
		return x1;
		
		
	}

	// Returns x1 - x2
	public static int minus(int x1, int x2) {
		if(x2<0){
			for(int i=0;i>x2;i--){
			x1++;
		}
		return x1;
		}

		for(int i=0;i<x2;i++){
			x1--;
		}
		return x1;
	}

	// Returns x1 * x2
	public static int times(int x1, int x2) {
		int b=0;
		if((x2<0 && x1<0)){
			for(int i=0;i>x2;i--){
				for(int j=0;j>x1;j--){
			b++;
			
		}
		
		}
		return b;
	} 

		 if(x1>0&&x2>0){
			for(int i=0;i<x2;i++){
			
			b=plus(b, x1);
		}
		return b;
	}
		
		if(x1<0){
			 b=0;
			 	for(int i=0;i<x2;i--){
				for(int j=0;j>x1;j--){
			b++;
				}
			}
			return minus(0, b);
		}
		if(x2<0){
				for(int i=0;i>x2;i--){
				for(int j=0;j<x1;j++){
			b++;
				}
			}
			return minus(0, b);
		}
				for(int i=0;i<x2;i++){
				for(int j=0;j<x1;j++){
			b++;
				}
				}
					return b;

			}
	

	// Returns x^n (for n >= 0)
	public static int pow(int x, int n) {
		int w=1;
		 for(int i=0;i<n;i++){
			w=times(w, x);
		 }
		return w;
	}

	// Returns the integer part of x1 / x2 
	public static int div(int x1, int x2) {
		if(x2<0 && x1<0){
			x2=minus(0, x2);
			x1=minus(0, x1);
		}
		if(x2>x1 && x1>0){
			return 0;
		}
		
		if( x1<0){
			x1=minus(0, x1);
		
		int a=x2;
		int sum=1;
		while(minus(x1, a)>=x2){
			a=plus(a, x2);
			sum++;
		}
		return minus(0, sum);
	}
	if(x2<0){
		x2=minus(0, x2);
		
		int a=x2;
		int sum=1;
		while(minus(x1, a)>=x2){
			a=plus(a, x2);
			sum++;
		}
		return minus(0, sum);
	}
	int a=x2;
		int sum=1;
		while(minus(x1, a)>=x2){
			a=plus(a, x2);
			sum++;
		}
		return sum;
	}


	// Returns x1 % x2
	public static int mod(int x1, int x2) {
		int a= div(x1, x2);
		int b= times(a, x2);
		int c=minus(x1, b);
		return c;
	}	


	// Returns the integer part of sqrt(x) 
	public static int sqrt(int x) {
		if(x==0){
			return 0;
		}
		int i=0;
		int a=0;
		while (a<x) {
		a=times(i, i);
		i++;
		}	
		if(a==x){
			return i-1;
		}
		else{
			return i-2;
		}
		
		
		
	}	  	  
}