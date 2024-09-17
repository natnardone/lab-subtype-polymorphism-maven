package edu.grinnell.csc207.experiments;

import edu.grinnell.csc207.blocks.AsciiBlock;
import edu.grinnell.csc207.blocks.Boxed;
import edu.grinnell.csc207.blocks.Empty;
import edu.grinnell.csc207.blocks.HorizontalCompositionTop;
// import edu.grinnell.csc207.blocks.HorizontalCompositionCenter;
import edu.grinnell.csc207.blocks.HorizontalCompositionTop;
import edu.grinnell.csc207.blocks.Line;
import edu.grinnell.csc207.blocks.Rectangle;
import edu.grinnell.csc207.blocks.Surrounded;
// import edu.grinnell.csc207.blocks.VerticalCompositionLeft;

import java.io.PrintWriter;

/**
 * Experiments with ASCII blocks.
 *
 * @author Samuel A. Rebelsky
 * @author Your Name Here
 */
public class Blocks {
  /**
   * Print a separator.
   *
   * @param pen
   *   What we use to print the separator.
   */
  static void separator(PrintWriter pen) {
    pen.printf("\n-------------\n\n");
  } // separator(PrintWriter)

  /**
   * Run the experiments.
   *
   * @param args
   *   The command-line parameters (ignored).
   */
  public static void main(String[] args) throws Exception {
    PrintWriter pen = new PrintWriter(System.out, true);
    pen.printf("b1 = new Line(\"Hello\")\n\n");
    AsciiBlock b1 = new Line("Hello");
    AsciiBlock.print(pen, b1);

    separator(pen);
    pen.printf("b2 = new Rectangle('X', 4, 3)\n\n");
    AsciiBlock b2 = new Rectangle('X', 4, 3);
    AsciiBlock.print(pen, b2);

    separator(pen);
    pen.printf("b3 = new Boxed(b1)\n\n");
    AsciiBlock b3 = new Boxed(b1);
    AsciiBlock.print(pen, b3);

    separator(pen);
    pen.printf("b4 = new Boxed(b2)\n\n");
    AsciiBlock b4 = new Boxed(b2);
    AsciiBlock.print(pen, b4);

    separator(pen);
    pen.printf("b5 = new Boxed(b4)\n\n");
    AsciiBlock b5 = new Boxed(b4);
    AsciiBlock.print(pen, b5);

    separator(pen);
    pen.printf("b6 = new Boxed(b5)\n\n");
    AsciiBlock b6 = new Boxed(b5);
    AsciiBlock.print(pen, b6);

    separator(pen);
    pen.printf("b7 = new Empty()\n\n");
    AsciiBlock b7 = new Empty();
    AsciiBlock.print(pen, b7);

    separator(pen);
    pen.printf("b8 = new Boxed(b8)\n\n");
    AsciiBlock b8 = new Boxed(b7);
    AsciiBlock.print(pen, b8);

    separator(pen);
    pen.printf("b9 = new Boxed(b8)\n\n");
    AsciiBlock b9 = new Boxed(b8);
    AsciiBlock.print(pen, b9);

    separator(pen);
    pen.printf("b10 = new Surrounded(b5, \'*\')\n\n");
    AsciiBlock b10 = new Surrounded(b5, '*');
    AsciiBlock.print(pen, b10);

    separator(pen);
    pen.printf("b11 = new Surrounded(b2, \' \')\n\n");
    AsciiBlock b11 = new Surrounded(b2, ' ');
    AsciiBlock.print(pen, b11);

    separator(pen);
    pen.printf("b12 = new Surrounded(b11, \'A\')\n\n");
    AsciiBlock b12 = new Surrounded(b11, 'A');
    AsciiBlock.print(pen, b12);

    separator(pen);
    pen.printf("b13 = new Surrounded(b7, \'A\')\n\n");
    AsciiBlock b13 = new Surrounded(b7, 'A');
    AsciiBlock.print(pen, b13);

    // AsciiBlock exes = new Rectangle('X', 4, 2);
    // AsciiBlock ohs = new Rectangle('O', 4, 2);

    AsciiBlock exes = new Rectangle('X', 3, 5);
    AsciiBlock ohs = new Rectangle('O', 4, 2);

    AsciiBlock comp1 =
      new HorizontalCompositionTop(exes, new HorizontalCompositionTop(ohs, exes));
    AsciiBlock comp2 =
      new HorizontalCompositionTop(new HorizontalCompositionTop(exes, ohs), exes);
    AsciiBlock boxedcomp = new Boxed(new HorizontalCompositionTop(exes, ohs));

    separator(pen);
    AsciiBlock.print(pen, new HorizontalCompositionTop(exes, ohs));
    separator(pen);
    AsciiBlock.print(pen, new HorizontalCompositionTop(ohs, exes));
    separator(pen);
    AsciiBlock.print(pen, new HorizontalCompositionTop(exes, exes));

    separator(pen);
    AsciiBlock.print(pen, new HorizontalCompositionTop(b7, exes));

    separator(pen);
    AsciiBlock.print(pen, comp1);

    separator(pen);
    AsciiBlock.print(pen, comp2);

    separator(pen);
    AsciiBlock.print(pen, boxedcomp);

    pen.close();
  } // main(String[])
} // class Blocks
