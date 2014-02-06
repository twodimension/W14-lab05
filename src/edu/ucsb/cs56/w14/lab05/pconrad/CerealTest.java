package edu.ucsb.cs56.w14.lab05.pconrad;

import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;

// @@@ TODO: Change the items below per instructions.
// @@@ TODO: Don't forget to change the "see" comment to refer to your class
// @@@ TODO: Then delete these @@@ TODO lines.

/** Test class for Cereal

    @author Phill Conrad
    @author Insert your name here
    @author If working in pair, insert 2nd pair here, else delete this line
    @version 2014/01/30 for lab04, cs56, W14
    @see Cereal 

*/

public class CerealTest {

    /** Test case for getUpc method of Cereal
     @see Cereal#getUpc
    */

    @Test
	public void test_getUpc() {
	Cereal c1 = new Cereal("00127288","Trader Joe's Raisin Bran");
	assertEquals("00127288",c1.getUpc());
    }


    /** Test case for getName method of Cereal
     @see Cereal#getName
    */

    @Test
	public void test_getName() {
	Cereal c1 = new Cereal("00127288","Trader Joe's Raisin Bran");
	assertEquals("Trader Joe's Raisin Bran",c1.getName());
    }

    /** Test case for toString
     @see Cereal#toString
    */

    @Test
	public void test_toString() {
	Cereal c1 = new Cereal("00127288","Trader Joe's Raisin Bran");
	assertEquals("[00127288,Trader Joe's Raisin Bran]",c1.toString());
    }

    /** Test case 1 for .equals
     @see Cereal#toString
    */

    @Test
	public void test_equals1() {
	Cereal c1 = new Cereal("00127288","Trader Joe's Raisin Bran");
	Cereal c2 = new Cereal("00127288","Trader Joe's Raisin Bran");
	assertTrue(c1.equals(c2));
    }

    /** Test case 2 for .equals
     @see Cereal#toString
    */

    @Test
	public void test_equals2() {
	Cereal c1 = new Cereal("00127288","Trader Joe's Raisin Bran");
	Cereal c2 = new Cereal("99999999","Trader Joe's Raisin Bran");
	assertFalse(c1.equals(c2));
    }

    /** Test case 1 for .hashCode
     @see Cereal#hashCode
    */

    @Test
	public void test_hashCode1() {
	Cereal c1 = new Cereal("00127288","Trader Joe's Raisin Bran");
	Cereal c2 = new Cereal("00127288","Trader Joe's Raisin Bran");
	assertTrue(c1.hashCode()==c2.hashCode());
    }

    /** Test case 2 for .hashCode
     @see Cereal#hashCode
    */

    @Test
	public void test_hashCode2() {
	Cereal c1 = new Cereal("00127288","Trader Joe's Raisin Bran");
	Cereal c3 = new Cereal("99999999","Trader Joe's Raisin Bran");
	assertTrue(c1.hashCode()!=c3.hashCode());
    }

}
