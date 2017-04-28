/**
 * Average
 * @author Sean Wunderlich
 * ITSE 1302-011
 */

import java.util.*;
import java.io.*;

public class AverageInteger
{
    /**
     *
     * @param intNum1
     * @param intNum2
     * @return
     */
    //Accepts two integer parameters and returns their average as a floating point number.
    public double average (int intNum1, int intNum2) {
        return (intNum1 + intNum2) / 2.0;
    }

    /**
     *
     * @param intNum1
     * @param intNum2
     * @param intNum3
     * @return
     */
    //Accepts three integer parameters and returns their average as a floating point number.
    public double average (int intNum1, int intNum2, int intNum3) {
        return (intNum1 + intNum2 + intNum3) / 3.0;
    }

    /**
     *
     * @param intNum1
     * @param intNum2
     * @param intNum3
     * @param intNum4
     * @return
     */
    //Accepts four integer parameters and returns their average as a floating point number.
    public double average (int intNum1, int intNum2, int intNum3, int intNum4) {
        return (intNum1 + intNum2 + intNum3 + intNum4) / 4.0;
    }
}
