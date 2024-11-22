public class dem {
    public static void main(String[] args) {
      double x=bruteForceSolver(100000, 5, 10, 0.0001);
      System.out.println(x);
    }

     public static double bruteForceSolver(double loan, double rate, int n, double epsilon) {
		int counter=0;
		double x=loan/n;
		while(endBalance(loan, rate, n, x)>epsilon){
			x=x+0.1;
			counter++;
		}
		return x;
    }
    private static double endBalance(double loan, double rate, int n, double payment) {	
		
		for(int i=0; i<n; i++){
			loan=(loan-payment)*(1+(rate/100));
		}
		return loan ;
	}
}
