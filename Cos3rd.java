class Cos3rd extends ConsoleProgram {

  /**
  * Calculates triangle's 3rd side given SAS
  * @author: Edric
  */
  
  public void run() {
    
    // declare variables
    double sideA;
    double sideB;
    double sideC;
    double angleC;

    // inputs
    sideA = readDouble("Enter side A (cm): ");
    sideB = readDouble("Enter side B (cm): ");
    angleC = readDouble("Enter contained angle (deg): ");

    // calculations (cosine law)
    sideC = Math.sqrt(Math.pow(sideA,2) + Math.pow(sideB,2) - 2 * sideA * sideB * (Math.cos(Math.toRadians(angleC))));
    
    // output
    System.out.printf("side C (cm): " + "%.2f", sideC);

  }
}