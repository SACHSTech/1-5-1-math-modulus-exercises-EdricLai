class Rads extends ConsoleProgram {

  /**
  * Degrees to radians conversion
  * @author: Edric
  */
  
  public void run() {
    
    // declare variables
    double degrees;
    double radians;

    // calculations
    degrees = readDouble("Enter degrees: ");
    radians = Math.toRadians(degrees);

    // output
    System.out.println("Radians: " + radians);
    
  }
}