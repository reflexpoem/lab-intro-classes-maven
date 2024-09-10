package edu.grinnell.csc207.experiments;

import java.io.PrintWriter;

import edu.grinnell.csc207.util.BigFraction;

/**
 * A simple experiment using fractions.
 *
 * @author Samuel A. Rebelsky.
 * @author Harrison Zhu, Sunjae Kim
 */
public class BFExperiment {
  /**
   * Generate a few fractions and print them out.
   *
   * @param args
   *   Command-line arguments; ignored.
   *
   * @throws Exception
   *   When we have some unexpected I/O issue.
   */
  public static void main(String[] args) throws Exception {
    PrintWriter pen = new PrintWriter(System.out, true);
    BigFraction f1;
    f1 = new BigFraction(3, 10);
    BigFraction f2;
    f2 = new BigFraction(2, 5);
    pen.println("First fraction: " + f1);
    pen.println("Second fraction: " + f2);
    pen.println("Sum: " + (f1.add(f2)));
    pen.println("Product: " + (f1.multiply(f2)));
    pen.println("fractional "+ (f1.fractional()));
    BigFraction f3;
    f3 = new BigFraction("123/456");
    pen.println("Fraction from string: " + f3);

    pen.close();
  } // main(String[])
} // class BFExperiment
