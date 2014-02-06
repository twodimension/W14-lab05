package edu.ucsb.cs56.w14.lab05.pconrad;

public class Cereal {
    private String upc; // UPC: numbers under the bar code, e.g. 00127288
    // note: String because leading zeros may be significant

    private String name; // name of the cereal, e.g "Trader Joe's Raisin Bran"
    
    /**
       Two-arg constructor
       @param upc  numbers under the bar code, e.g. 00127288
       @param name name of the cereal, e.g "Trader Joe's Raisin Bran"
    */

    public Cereal(String upc, String name) {
	this.upc = upc; this.name=name;
    }

    /** 
	Getter for upc
	@return upc, numbers under the bar code, e.g. 00127288
    */

    public String getUpc () { return this.upc; }

    /** 
	Getter for name
	@return name of the cereal, e.g "Trader Joe's Raisin Bran"
    */
    public String getName () {return this.name; }

    /**
       convert to String representation in format [upc,name]
       e.g. <code>["00127288","Trader Joe's Raisin Bran"]</code>

       @return formatted string, [upc,name]
    */

    @Override
    public String toString() {
	return "[" + getUpc() + "," + getName() + "]";
    }


    /** hashcode to be used for hash tables, etc.
	based only on the upc value.
     */

    @Override
    public int hashCode() {
	/* NOTE: we could have just used 
	   return upc.hashcode() but the code below is 
	   an example of what to do if you need to combine
	   multiple fields into a hashcode.

	   See also: http://stackoverflow.com/questions/16377926/how-to-write-hashcode-method-for-a-particular-class

	*/
	final int prime = 31; /* could use any prime number */
        int result = 1;
        result = (prime * result) + this.upc.hashCode();

	/* If you had more fields to add to the hashcode,
	   have more lines like the ones shown below.
	   If the objects already have hashcode methods,
	   use their hashcode--if they are int variables,
	   just use the int value. 

        result = prime * result + object1.hashcode();
        result = prime * result + object2.hashcode();
        result = prime * result + intVariable3;
        result = prime * result + intVariable4;
	*/

       
        return result;
    }

    /** compare for equality based on upc
	@return true if parameter is a Cereal with same upc, otherwise false
     */

    @Override
    public boolean equals(Object o) {
	if (o==null) return false;
	if (! (o instanceof Cereal) ) return false;
	Cereal c = (Cereal) o;
	return (c.getUpc() == this.getUpc());
    }

}