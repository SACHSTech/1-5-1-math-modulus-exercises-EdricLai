class Power extends ConsoleProgram {

  /**
  * Exponent calculator
  * @author: Edric
  */
  
  public void run() {
    
    // declare variables
    double base;
    double exponent;
    double result;
    
    // inputs
    base = readDouble("Enter the base: ");
    exponent = readDouble("Enter the exponent: ");

    // calculations
    result = Math.pow(base,exponent);

    // output
    System.out.printf("Result: " + "%.2f", result);

  }
}