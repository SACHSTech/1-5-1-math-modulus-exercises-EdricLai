class Hours extends ConsoleProgram {

  /**
  * Hours to days conversion
  * @author: Edric
  */
  
  public void run() {
    
    // declare variables
    int hours;
    int days;

    // calculations
    hours = readInt("Enter the number of hours: ");
    days = hours / 24;
    hours = hours % 24;

    // output
    System.out.println(days + " days and " + hours + " hours");
    
  }
}