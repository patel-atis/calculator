
public class Math {
		
	double add(double a, double b) {
		double ans = a + b;
		return ans;
	}
	
	double minus(double a, double b) {
		double ans = a - b;
		return ans;
	}
	
	double multiply(double a, double b) {
		double ans = a * b;
		return ans;
	}
	
	double divide(double a, double b) {
		double ans = a / b;
		return ans;
	}
		
	double power(double a, double b) {
		if (b == 0){
			return 1;
		} else {
			double oga = a;
			for (int i = 0; i < b-1; i++){
				oga *= a;
			}
			return oga;
		}
	}
}
