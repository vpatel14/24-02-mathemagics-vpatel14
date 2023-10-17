import static java.lang.System.*;

public class Mathemagic {

    public static final double PI = 3.14159;

    public static void main(String[] args) {

        //testing periRect
        out.printf("Perimeter around enemy forces: %.1f\n", periRect(12, 5));                    //  should yield 34.0

        //testing trapArea
        out.printf("Enemy for in wedge the size of: %.1f\n", trapArea(5, 6, 7));          //  should yield 38.5

        //testing trapArea
        out.printf("Enemy for in wedge the size of: %.2f\n", conicVol(4, 4));                  //  should yield 67.02

        //testing cubicBarrier
        out.printf("Shield needed in the size of: %.1f\n", cubicBarrier(33));                         //  should yield 6534.0

        //testing blastArea
        out.printf("Fireball blast area: %.2f\n", blastArea(7.5));                                   //  should yield 176.71

        //testing atmoShift
        out.printf("Blocking temperature value: %.2f\n", atmoShift(98.6));                            //  should yield 37.00

        //testing elevationVect
        out.printf("Enemy attack coming at elevation vector: %.2f\n", elevationVect(1, 9, 14, 2));     //  should yield -0.54


    }//end of main method


    public static double periRect(int length, int width) {
        return 0;
    }


    public static double trapArea(int base1, int base2, int height) {
        return 0;
    }


    public static double conicVol(double radius, int height) {
        return 0;
    }


    public static double cubicBarrier(int edge) {
        return 0;
    }


    public static double blastArea(double radius) {
        return 0;
    }


    public static double atmoShift(double fahr) {
        return 0;
    }


    public static double elevationVect(int x1, int y1, int x2, int y2) {
        return 0;
    }


}//end of class
