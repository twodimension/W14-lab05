package edu.ucsb.cs56.w14.lab05.twodimension;

public class GamingSystem {
    private String price;
     // price of the gaming machine, such as 299, 199

    private String name; // name of the gaming system, e.g "Xbox360, PS3"
    
    /**
       Two-arg constructor
       @param price, price of the machine
       @param name name of the machine,such as "Xbox360"
    */

    public GamingSystem(String price, String name) {
     this.price = price;
     this.name = name;



                // @@@ STUB so do nothing
    }

    /** 
	Getter for price
	@return price, the price of the machine
    */

    public String getPrice () { return price; }

    /** 
	Getter for name
	@return name of the machine, eg: "Xbox"
    */
    public String getName () {return name; }

    /**
       
    */

    @Override
    public String toString() {
	return this.name + " will cost consumer " +this.price+ " dollars"  ;
	// OR: return "[STUB]";     
    }


    /** hashcode to be used for hash tables, etc.
	based only on the upc value.
     */

    @Override
    public int hashCode() {
	int priceCode;
	priceCode = Integer.parseInt(this.getPrice());


        return priceCode; // in stub, return super class (as if not overridden)
	// OR: return 42; // WORST POSSIBLE HASH CODE IN PRACTICE; ok for testing tests
    }

    /** compare for equality based on upc
	@return true if parameter is a Cereal with same upc, otherwise false
     */

    @Override
    public boolean equals(Object o) {
        if(!(o instanceof GamingSystem))
	       return false;
	GamingSystem other = (GamingSystem) o;
	return (other.getName().equals(this.getName()) & other.getPrice().equals(this.getPrice()));
	// OR: return false;
	// OR: return true;
	// Note: there is not good "always wrong" stub value for a boolean method
	//   It will be "correct" half the time by accident.
    }

}
