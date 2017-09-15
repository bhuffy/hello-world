
import javax.swing.JOptionPane;

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.text.SimpleDateFormat;  
import java.util.Date;

/**
 * This program is provided so that the user can enter the month, day and year of their 
 * birthday.  It is provided to make Proj 1.1 more extensible.
 * 
 * @author Robert Juranitch/Bennett Huffman
 * @version 09.15.17
 */
public class CalendarDriver
{
    public static void main(String[] args)
    {
        // declarations and initializations of variables
        String returnValue = "";
        int month = 0;
        int day = 0;
        int year = 0;
        
        // Get Birthday from user
        JOptionPane.showInputDialog(null, "Enter your date (mm/dd/yyyy)");
        // because JOptionPane returns a string, we must convert each String into an integer
        
        
        
    }
}



// Credit: https://www.javatpoint.com/java-string-to-date