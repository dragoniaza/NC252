/**
@Posathorn Ploykaew 5907101008
 * */
package th.ac.utcc.CPE23.tarn.Posathorn;

public class Link {
	  public long data;
	  public Link next;

	  public Link(long val) {
	    data = val;
	    next = null;
	  }

	  public void displayLink() {
	    System.out.print(data + " ");
	  }

	}  // end class
