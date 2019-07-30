/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package systemoutprint;

import java.util.List;

/**
 *
 * @author columbo
 */
public class printtoconsole 
{
    ////////////////////////////////////////////////////////////////////////////
    // print to console
    ////////////////////////////////////////////////////////////////////////////
    // void systemOutPrintLnLineNumbers (List<String> list)
    // void systemOutPrintLn(List<String> list)
    // void systemoutprintlnLineNumbers(List[] list)
    // void systemOutPrintLn(List[] list)
    // void systemOutPrintLnLineNumbers (String[] list)
    // void systemOutPrintLn(String[] list)
    
    /**
     * print a list to console with "line: x " line by line
     * @param list<String> 
     */
    public static void systemOutPrintLnLineNumbers (String[] list)
    {
        for (int x = 0; x < list.length; x++)
        {
            System.out.println("line: " + x + " " + list[x]);
        }
    }
     /**
     * print a list to console line by line
     * @param List<String>
     */
    public static void systemOutPrintLn(String[] list)
    {
        for (int x = 0; x < list.length; x++)
        {
            System.out.println(list[x]);
        }
    }
    /**
     * print a list to console with "line: x " line by line
     * @param list<String> 
     */
    public static void systemOutPrintLnLineNumbers (List<String> list)
    {
        for (int x = 0; x < list.size(); x++)
        {
            System.out.println("line: " + x + " " + list.get(x));
        }
    }
     /**
     * print a list to console line by line
     * @param List<String>
     */
    public static void systemOutPrintLn(List<String> list)
    {
        for (int x = 0; x < list.size(); x++)
        {
            System.out.println(list.get(x));
        }
    }
    /**
     * print a list to console with "line: x " line by line
     * @param list[] 
     */
    public static void systemOutPrintLnLineNumbers (List[] list)
    {
        for (int x = 0; x < list.length; x++)
        {
            System.out.println("line: " + x + " " + list[x]);
        }
    }
    /**
     * print a list to console line by line
     * @param List[]
     */
    public static void systemOutPrintLn(List[] list)
    {
        for (int x = 0; x < list.length; x++)
        {
            System.out.println(list[x]);
        }
    }
}
