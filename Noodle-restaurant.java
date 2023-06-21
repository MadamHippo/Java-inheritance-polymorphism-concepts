class NoodleRestaurant {
  String name;

  public NoodleRestaurant(String customerName){
    name = customerName;
  }

  // Specifically, look at the order() method to see what its parameter’s data type is.
  // the parameter is asking for noodle!
  public void order(Noodle noodle) {
    System.out.println(noodle.getCookPrep());
    System.out.println("Order for " + name + " is ready.");
  }

  public static void main(String[] args) {
    Noodle ramen, pho;
    ramen = new Ramen();
    pho = new Pho();
    
    NoodleRestaurant customer1 = new NoodleRestaurant("Sagirah");
    NoodleRestaurant customer2 = new NoodleRestaurant("Maritza");

    // Add your code here
    // Inside the main() method, call the order() method on customer1 with pho as an argument.
    customer1.order(pho);
    // will print "Soak pho for 1 hour, then boil for 1 minute in broth. Then garnish with cilantro and jalapeno. Order for Sagirah is ready."

    customer2.order(ramen);
    // will print "Boil ramen for 5 minutes in broth, then add meat, mushrooms, egg, and vegetables. Order for Maritza is ready."


  }
}
