class Noodle {
  
  protected double lengthInCentimeters;
  protected double widthInCentimeters;
  protected String shape;
  protected String ingredients;
  protected String texture = "brittle";
  
  Noodle(double lenInCent, double wthInCent, String shp, String ingr) {
    
    this.lengthInCentimeters = lenInCent;
    this.widthInCentimeters = wthInCent;
    this.shape = shp;
    this.ingredients = ingr;
    
  }
  
  public String getCookPrep() {
    
    return "Boil noodle for 7 minutes and add sauce.";
    
  }
  
  
  public static void main(String[] args) {
    
    Noodle spaghetti, ramen, pho;
    
    spaghetti = new Spaghetti();
    ramen = new Ramen();
    pho = new Pho();
    
    // Add your code below:
    // and initialize an array of type Noodle called allTheNoodles with the items:
    Noodle[] allTheNoodles = {spaghetti, ramen, pho};
    
    // Loop through each noodle in allTheNoodles. Call getCookPrep() on each noodle and print the result.

    for (Noodle everyNoodle : allTheNoodles) {
      System.out.println(everyNoodle.getCookPrep());
      
      /* WILL PRINT: Boil spaghetti for 8 - 12 minutes and add sauce, cheese, or oil and garlic.
      Boil ramen for 5 minutes in broth, then add meat, mushrooms, egg, and vegetables.
      Soak pho for 1 hour, then boil for 1 minute in broth. Then garnish with cilantro and jalapeno. */
    }
    
    
  }
  
}


