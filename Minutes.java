class Minutes extends ConsoleProgram {

  /**
  * Minutes to days conversion
  * @author: Edric
  */
  
  public void run() {
    
    // declare variables
    int minutes;
    int hours;
    int days;

    // calculations
    minutes = readInt("Enter the number of minutes: ");
    hours = minutes / 60;
    days = hours / 24;
    hours = hours - days * 24;
    minutes = minutes - (hours + days * 24) * 60;

    // output
    System.out.println(days + " days, " + hours + " hours, and " + minutes + " minutes");
    
  }
}