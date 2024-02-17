class AreaSin extends ConsoleProgram {

  /**
  * Calculates triangle's area given SAS
  * @author: Edric
  */
  
  public void run() {
    
    // declare variables
    double sideA;
    double sideB;
    double angleC;
    double area;

    // inputs
    sideA = readDouble("Enter side A (cm): ");
    sideB = readDouble("Enter side B (cm): ");
    angleC = readDouble("Enter contained angle (deg): ");

    // calculations
    area = (sideA * sideB * Math.sin(Math.toRadians(angleC))) / 2;

    // output
    System.out.printf("Area (cm²): " + "%.2f", area);

  }
}