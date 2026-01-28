public class java_for_real_life_example_50 {
      public static void main(String[] args) { 
    int n = 5;
    int fact = 1;

    for (int i = 1; i <= n; i++) {
      fact *= i;
    }

    System.out.println("Factorial of " + n + " is " + fact);
  }
}
