// This class represents a specific type of Noodle called Spaghetti
class Spaghetti extends Noodle {
  
  // Constructor for Spaghetti class
  Spaghetti() {
    // Calling the superclass constructor (Noodle) with specific values
  	super(30.0, 0.2, "round", "semolina flour");
  }
  
  // Overriding the getCookPrep() method from the superclass (Noodle)
  @Override
  public String getCookPrep() {
    // Returning the cooking instructions for spaghetti
    return "Boil spaghetti for 8 - 12 minutes and add sauce, cheese, or oil and garlic.";
  }
  
}
