public class Main {

  public static void main(String[] args) {

    // positive number
    int number = 70;

    System.out.print("Factors are given number of " + number + " are: ");

    // loop runs from 1 to 70
    for (int i = 1; i <= number; ++i) {
      
      // if number is divided by i
      // i is the factor
      if (number % i == 0) {
        
        System.out.print(" the Numbrer is even " i + " ");
      }
    }
  }
}
