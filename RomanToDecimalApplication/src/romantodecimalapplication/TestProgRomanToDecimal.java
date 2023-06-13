/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package romantodecimalapplication;

/**
 *
 * @author Rishan Aziz
 */

import java.util.*;
import javax.swing.*;

public class TestProgRomanToDecimal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

         int n = JOptionPane.showConfirmDialog(null,
                 " Enter/Proceed with this program",
                 "Enter/Proceed Program", JOptionPane.YES_NO_OPTION);

         //Ask user if they want to proceed or not
         while(n == JOptionPane.YES_OPTION)
         {
             String output;

             Roman romanType = new Roman();
             romanType.setRom();
             romanType.romToDec();

             output = "The conversion from roman numeral to decimal is, "
                     + romanType.convert();

             JOptionPane.showMessageDialog(null, output,
                     "Roman Value",
                     JOptionPane.INFORMATION_MESSAGE);//output the decimal value of the roman numeral

             n = JOptionPane.showConfirmDialog(null, " Enter/Proceed with this program",
                     "Enter/Proceed Program", JOptionPane.YES_NO_OPTION);
}
    }

}
