class Circumference extends ConsoleProgram {

  /**
  * Calculates circumference given radius
  * c = 2πr
  * @author: Edric
  */
  
  public void run() {
    
    // declare variables
    double circumference;
    double radius;

    // calculations
    radius = readDouble("Enter the radius (cm): ");
    circumference = 2 * Math.PI * radius;

    // output
    System.out.printf("Circumference (cm): " + "%.2f", circumference);

  }
}