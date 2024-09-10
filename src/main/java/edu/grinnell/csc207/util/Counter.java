package edu.grinnell.csc207.util;

/**
 * Simple counters.
 *
 * Harrison Zhu, Sunjae Kim
 */
public class Counter {
  // +--------+------------------------------------------------------
  // | Fields |
  // +--------+
  int counter;
  int startingValue;
  
  // +--------------+------------------------------------------------
  // | Constructors |
  // +--------------+
  public Counter(){
    this.counter = 0;
    this.startingValue = 0;
  }
  

  public Counter(int startingValue){
    this.startingValue = startingValue;
    this.counter = startingValue;
  }


  // +---------+-----------------------------------------------------
  // | Methods |
  // +---------+
  public void increment(){
    this.counter = this.counter + 1;
  }

  public int get(){
    return this.counter;
  }

  public String toString(){
    return "" + this.counter;
  }

  public void reset(){
    this.counter = this.startingValue;
  }
} // class Counter
