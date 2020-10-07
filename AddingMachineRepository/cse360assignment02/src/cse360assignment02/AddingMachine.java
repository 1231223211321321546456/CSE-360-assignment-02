/*
 * Author: Dominic Alejandro
 * Class: CSE 360
 * Assignment 2
 * Description: The AddingMachine file implements methods to add, 
 * 				subtract, and display integers
 */

package cse360assignment02;


public class AddingMachine {
	  private int total;
	  private String history;
	  /**
	   * AddingMachine constructor initializes total to 0
	   * and history to "0"
	   */
	  public AddingMachine () {
	    total = 0;  // not needed - included for clarity
	    history = "0";
	  }
	  /**
	   * getTotal returns the total value
	   * @return total
	   */
	  public int getTotal () {
	    return total;
	  }
	  
	  /**
	   * add() sums the value to the current total and
	   * records the added value in history
	   * @param value : The value to be added to total
	   */
	  public void add (int value) {
		  total += value;
		  history += (" + " + value);
	  }
	  
	  /**
	   * subtract() subtracts the value from the current total and
	   * records the subtracted value in history
	   * @param value : The value to be subtracted from the total
	   */
	  public void subtract (int value) {
		  total -= value;
		  history += (" - " + value);
	  }
	  
	  /**
	   * toString() method
	   * 
	   * @return the string of the original value and the operations
	   * performed on the value 
	   */
	  public String toString () {
		System.out.println(history);  
	    return history;
	  }
	  /**
	   * clear() clears the operation history and resets the 
	   * total value and history back to their starting values (0 and "0")
	   */
	  public void clear() {
		  total = 0;
		  history = "0";
	  }
	  public static void main(String args[]) {
		  /*
		  AddingMachine a = new AddingMachine();
		  a.add(4);
		  a.subtract(2);
		  a.add(5);		  
		  a.toString();
		  */
	  }
}


