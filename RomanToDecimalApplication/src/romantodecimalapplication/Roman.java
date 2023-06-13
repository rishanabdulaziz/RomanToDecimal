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

public class Roman {

     private String roman;
     private char[] num = new char[10];

     public Roman()
     {
         roman = "";
     }

      public void setRom()//Method to ask the user to set the roman numeral they want to convert
      {
          roman = JOptionPane.showInputDialog(null,"This is a Roman Numeral converter \n"
                  + "Please enter a valid Roman number:");
      }

      public void romToDec()//Method to convert roman numeral to decimal
      {
          if (roman.length() == 0)
              JOptionPane.showMessageDialog(null,"You leaved a blank. Please fill in a Roman Number.",
                      "Invalid Roman Value", JOptionPane.ERROR_MESSAGE);

          if (roman.length() > 10)
              JOptionPane.showMessageDialog(null,"You have entered more than 10 Roman Numbers \n "
                      + "Please enter a number which is less than 10 numbers in length",
                      "Invalid Roman Value", JOptionPane.ERROR_MESSAGE);
          else
          {
              char[] romArray = roman.toCharArray() ;//Convert String to an array of char

              for (int i = 0 ; i < style="color: rgb(192, 192, 192);"> //Assingning array romArray to array num
              {
                  if (romArray[i] == 'm' || romArray[i] == 'M')
                      num[i] = 1000 ;
                  else if (romArray[i] == 'd' || romArray[i] == 'D')
                      num[i] = 500 ;
                  else if (romArray[i] == 'c' || romArray[i] == 'C')
                      num[i] = 100 ;
                  else if (romArray[i] == 'l' || romArray[i] == 'L')
                      num[i] = 50 ;
                  else if (romArray[i] == 'x' || romArray[i] == 'X')
                      num[i] = 10 ;
                  else if (romArray[i] == 'v' || romArray[i] == 'V')
                      num[i] = 5 ;
                  else if (romArray[i] == 'i' || romArray [i] == 'I')
                      num[i] = 1 ;
                  else
                      JOptionPane.showMessageDialog(null, "The Roman Numeral you have entered is invalid.",
                              "Invalid Roman Value", JOptionPane.ERROR_MESSAGE);
              }
          }
      }

      public int convert()//Method to count the whole converted roman numeral to decimal
      {
          int convert = 0;

          if (num[0] <= num[1] && num[2] > num[1])
              JOptionPane.showMessageDialog(null, "The Roman Numeral you have entered is invalid.",
                      "Invalid Roman Value", JOptionPane.ERROR_MESSAGE) ;
          else if (num[1] <= num[2] && num[3] > num[2])
              JOptionPane.showMessageDialog(null, "The Roman Numeral you have entered is invalid.",
                      "Invalid Roman Value", JOptionPane.ERROR_MESSAGE) ;
          else if (num[2] <= num[3] && num[4] > num[3])
              JOptionPane.showMessageDialog(null, "The Roman Numeral you have entered is invalid.",
                      "Invalid Roman Value", JOptionPane.ERROR_MESSAGE) ;
          else if (num[3] <= num[4] && num[5] > num[4])
              JOptionPane.showMessageDialog(null, "The Roman Numeral you have entered is invalid.",
                      "Invalid Roman Value", JOptionPane.ERROR_MESSAGE) ;
          else if (num[4] <= num[5] && num[6] > num[5])
              JOptionPane.showMessageDialog(null, "The Roman Numeral you have entered is invalid.",
                      "Invalid Roman Value", JOptionPane.ERROR_MESSAGE) ;
          else if (num[5] <= num[6] && num[7] > num[6])
              JOptionPane.showMessageDialog(null, "The Roman Numeral you have entered is invalid.",
                      "Invalid Roman Value", JOptionPane.ERROR_MESSAGE) ;
          else if (num[6] <= num[7] && num[8] > num[7])
              JOptionPane.showMessageDialog(null, "The Roman Numeral you have entered is invalid.",
                      "Invalid Roman Value", JOptionPane.ERROR_MESSAGE) ;
          else if (num[7] <= num[8] && num[9] > num[8])
              JOptionPane.showMessageDialog(null, "The Roman Numeral you have entered is invalid.",
                      "Invalid Roman Value", JOptionPane.ERROR_MESSAGE) ;
          //Check the validity of the roman numeral. Example of invalid roman numeral is IIIV
          else
          {
              for (int i = 0; i <= 8; i++)//Count the whole roman numeral { if(i != roman.length() - 1)
              {
                  if (num[i] >= num[i + 1])
                      convert = convert + num[i];
                  else
                      convert = convert - num[i];
              }

              if (i == roman.length() - 1)
                  convert = convert + num[roman.length() - 1];
          }

      return convert;//Return the decimal value of the roman numeral
      }
}
