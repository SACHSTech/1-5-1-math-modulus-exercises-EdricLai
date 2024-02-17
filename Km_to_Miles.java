class Km_to_Miles extends ConsoleProgram {

  /**
  * Kilometers to miles conversion
  * @author: Edric
  */
  
  public void run() {

    // declare variables
    double kilometers;
    double miles;

    // calculations
    kilometers = readDouble("Enter kilometers: ");
    miles = kilometers * 0.621371;

    // output
    System.out.printf("Miles: " + "%.2f", miles);

  }
}