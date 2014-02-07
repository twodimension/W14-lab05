package edu.ucsb.cs56.w14.lab05.twodimension;

import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;

// @@@ TODO: Change the items below per instructions.
// @@@ TODO: Don't forget to change the "see" comment to refer to your class
// @@@ TODO: Then delete these @@@ TODO lines.

/** Test class for Cereal

    @author Phill Conrad
    @author Wei Guo
   
    @version 2014/01/30 for lab04, cs56, W14
    @see GamingSystem 

*/

public class GamingSystemTest {

    /** Test case for getUpc method of Cereal
     @see GamingSystem#getPrice
    */

    @Test
	public void test_getPrice() {
	GamingSystem c1 = new GamingSystem("299","Xbox360");
	assertEquals("299",c1.getPrice());
    }


    /** Test case for getName method of Cereal
     @see Cereal#getName
    */

    @Test
	public void test_getName() {
	GamingSystem c1 = new GamingSystem("299","Xbox360");
	assertEquals("Xbox360",c1.getName());
    }

    /** Test case for toString
     @see GamingSystem#toString
    */

    @Test
	public void test_toString() {
	GamingSystem c1 = new GamingSystem("299","Xbox360");
	assertEquals("Xbox360 will cost consumer 299 dollars",c1.toString());
    }

    /** Test case 1 for .equals
     @see GamingSystem#toString
    */

    @Test
	public void test_equals1() {
	GamingSystem c1 = new GamingSystem("299","Xbox360");
	GamingSystem c2 = new GamingSystem("299","Xbox360");
	assertTrue(c1.equals(c2));
    }

    /** Test case 2 for .equals
     @see GamingSystem#toString
    */

    @Test
	public void test_equals2() {
	GamingSystem c1 = new GamingSystem("299","Xbox360");
	GamingSystem c2 = new GamingSystem("399","Xbox360");
	assertFalse(c1.equals(c2));
    }

    /** Test case 1 for .hashCode
     @see GamingSystem#hashCode
    */

    @Test
	public void test_hashCode1() {
	GamingSystem c1 = new GamingSystem("299","Xbox360");
	GamingSystem c2 = new GamingSystem("299","Xbox360");
	assertTrue(c1.hashCode()==c2.hashCode());
    }

    /** Test case 2 for .hashCode
     @see GamingSystem#hashCode
    */

    @Test
	public void test_hashCode2() {
	GamingSystem c1 = new GamingSystem("299","Xbox360");
	GamingSystem c3 = new GamingSystem("399","Xbox360");
	assertTrue(c1.hashCode()!=c3.hashCode());
    }

}
