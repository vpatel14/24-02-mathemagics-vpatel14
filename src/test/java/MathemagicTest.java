import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.*;

import org.junit.jupiter.api.*;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class MathemagicTest {
    private static int[][] testRects;
    private static double[] testPeris;
    private static int[][] testTraps;
    private static double[] testTrapAreas;
    private static double[][] testCones;
    private static double[] testConeVols;
    private static int[] testCubes;
    private static double[] testCuAreas;
    private static double[] testRads;
    private static double[] testCirAreas;
    private static double[] testFahrs;
    private static double[] testCels;
    private static int[][] testPts;
    private static double[] testSlopes;


    @BeforeAll
    static void setUp () {
        testRects = new int[][]{{12,5},{131,75},{20,25},{9,256},{36,72},{8,6},{18,16}};
        testPeris = new double[]{34.0,412.0,90.0,530.0,216.0,28.0,68.0};
        testTraps = new int[][]{{3,3,3},{5,6,7},{7,10,6},{13,9,3},{6,11,4},{11,8,5}};
        testTrapAreas= new double[]{9.0,38.5,51.0,33.0,34.0,47.5};
        testCones = new double[][]{{4,4},{4,3},{9,3},{1,3},{1,5},{7,7},{1.5,3},{1.5,5}};
        testConeVols = new double[]{67.02,50.27,254.47,3.14,5.24,359.19,7.07,11.78};
        testCubes = new int[]{112,4,33,50,5,19,111};
        testCuAreas = new double[]{75264.0,96.0,6534.,15000,150,2166,73926};
        testRads = new double[]{7.5,10,72.534,55,101,99.952};
        testCirAreas = new double[]{176.71,314.16,16528.49,9503.32,32047.39,31385.77};
        testFahrs = new double[]{98.6,52.30,85.48,75,100};
        testCels = new double[]{37,11.28,29.71,23.89,37.78};
        testPts = new int[][]{{1,9,14,2},{1,7,18,3},{6,4,2,2},{4,4,5,3},{1,1,2,9},{1,7,2,9}};
        testSlopes = new double[]{-0.54,-0.24,0.50,-1.00,8.00,2.00};
    }

    private static Stream<Arguments> providedNumbers_allperiRects() {
        return Stream.of(
                Arguments.of(testRects[0], testPeris[0]),
                Arguments.of(testRects[1], testPeris[1]),
                Arguments.of(testRects[2], testPeris[2]),
                Arguments.of(testRects[3], testPeris[3]),
                Arguments.of(testRects[4], testPeris[4]),
                Arguments.of(testRects[5], testPeris[5]),
                Arguments.of(testRects[6], testPeris[6])
        );
    }

    @DisplayName("Perimeter of the rectangles")
    @ParameterizedTest
    @MethodSource ("providedNumbers_allperiRects")
    void peris_variousRectangles_returnPerimeter (int[] arr, double peri) {
        double p = Mathemagic.periRect(arr[0],arr[1]);
        assertEquals(peri, p,0.2);
    }

    private static Stream<Arguments> providedNumbers_allTraps() {
        return Stream.of(
                Arguments.of(testTraps[0],testTrapAreas[0]),
                Arguments.of(testTraps[1],testTrapAreas[1]),
                Arguments.of(testTraps[2],testTrapAreas[2]),
                Arguments.of(testTraps[3],testTrapAreas[3]),
                Arguments.of(testTraps[4],testTrapAreas[4]),
                Arguments.of(testTraps[5],testTrapAreas[5])
        );
    }

    @DisplayName("Testing all the trapezoid areas")
    @ParameterizedTest
    @MethodSource ("providedNumbers_allTraps")
    void traps_variousTrapezoids_returnArea (int[] trap, double area) {
        double ar = Mathemagic.trapArea(trap[0],trap[1],trap[2]);
        assertEquals(area,ar,0.02);
    }

    private static Stream<Arguments> providedNumbers_allCones() {
        return Stream.of(
                Arguments.of(testCones[0],testConeVols[0]),
                Arguments.of(testCones[1],testConeVols[1]),
                Arguments.of(testCones[2],testConeVols[2]),
                Arguments.of(testCones[3],testConeVols[3]),
                Arguments.of(testCones[4],testConeVols[4]),
                Arguments.of(testCones[5],testConeVols[5]),
                Arguments.of(testCones[6],testConeVols[6]),
                Arguments.of(testCones[7],testConeVols[7])
                );
    }

    @DisplayName(("Testing all the conical areas"))
    @ParameterizedTest
    @MethodSource("providedNumbers_allCones")
    void cones_variousCones_returnVolume (double[] cone, double volume){
        double vol = Mathemagic.conicVol(cone[0],(int)cone[1]);
        assertEquals(vol,volume,0.02);
    }

    private static Stream<Arguments> providedNumbers_allCubes() {
        return Stream.of(
                Arguments.of(testCubes[0],testCuAreas[0]),
                Arguments.of(testCubes[1],testCuAreas[1]),
                Arguments.of(testCubes[2],testCuAreas[2]),
                Arguments.of(testCubes[3],testCuAreas[3]),
                Arguments.of(testCubes[4],testCuAreas[4]),
                Arguments.of(testCubes[5],testCuAreas[5]),
                Arguments.of(testCubes[6],testCuAreas[6])
        );
    }

    @DisplayName(("Testing all the cubic surface areas"))
    @ParameterizedTest
    @MethodSource("providedNumbers_allCubes")
    void cubes_variousCubes_returnSurfAreas (int edge, double surfArea){
        double sa = Mathemagic.cubicBarrier(edge);
        assertEquals(surfArea,sa,0.2);
    }

    private static Stream<Arguments> providedNumbers_allCircles() {
        return Stream.of(
                Arguments.of(testRads[0],testCirAreas[0]),
                Arguments.of(testRads[1],testCirAreas[1]),
                Arguments.of(testRads[2],testCirAreas[2]),
                Arguments.of(testRads[3],testCirAreas[3]),
                Arguments.of(testRads[4],testCirAreas[4]),
                Arguments.of(testRads[5],testCirAreas[5])
        );
    }

    @DisplayName(("Testing all the circular areas"))
    @ParameterizedTest
    @MethodSource("providedNumbers_allCircles")
    void circles_variousCircles_returnAreas (double radius, double area){
        double ar = Mathemagic.blastArea(radius);
        assertEquals(area,ar,0.05);
    }

    private static Stream<Arguments> providedNumbers_allTemps() {
        return Stream.of(
                Arguments.of(testFahrs[0],testCels[0]),
                Arguments.of(testFahrs[1],testCels[1]),
                Arguments.of(testFahrs[2],testCels[2]),
                Arguments.of(testFahrs[3],testCels[3]),
                Arguments.of(testFahrs[4],testCels[4])
        );
    }

    @DisplayName(("Testing all the temperatures"))
    @ParameterizedTest
    @MethodSource("providedNumbers_allTemps")
    void temps_variousTemperatures_returnTemps (double fahrenheit, double celsius){
        double cel = Mathemagic.atmoShift(fahrenheit);
        assertEquals(celsius,cel,0.02);
    }

    private static Stream<Arguments> providedNumbers_allLines() {
        return Stream.of(
                Arguments.of(testPts[0],testSlopes[0]),
                Arguments.of(testPts[1],testSlopes[1]),
                Arguments.of(testPts[2],testSlopes[2]),
                Arguments.of(testPts[3],testSlopes[3]),
                Arguments.of(testPts[4],testSlopes[4]),
                Arguments.of(testPts[5],testSlopes[5])
        );
    }

    @DisplayName(("Testing all the lines"))
    @ParameterizedTest
    @MethodSource("providedNumbers_allLines")
    void lines_variousLines_returnSlopes (int[] pts, double slope){
        double m = Mathemagic.elevationVect(pts[0],pts[1],pts[2],pts[3]);
        assertEquals(slope,m,0.02);
    }


}