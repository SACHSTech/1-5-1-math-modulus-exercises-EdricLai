class FtoC extends ConsoleProgram {

  /**
  * Fahrenheit to celsius conversion
  * @author: Edric
  */
  
  public void run() {
    
    // declare variables
    double fahrenheit;
    double celsius;

    // calculations
    fahrenheit = readDouble("Enter Fahrenheit: ");
    celsius = (5.0 / 9.0) * (fahrenheit - 32);

    // output
    System.out.println("Celsius: " + celsius);

  }
}