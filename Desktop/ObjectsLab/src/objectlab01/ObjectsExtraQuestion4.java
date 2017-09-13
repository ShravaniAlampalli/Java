/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package objectlab01;

/**
 *
 * @author Instructor
 */
public class ObjectsExtraQuestion4 
{
    public static void main(String[] args) 
    {
        String inputString = " Northwest Missouri State University ";
        String outputString = "";
        System.out.println("The input string is "+inputString);
        // To remove leading and trailing white space
        inputString = inputString.trim();
        outputString = outputString+inputString.charAt(0);
        // Obtain substring starting from the position of white space
        inputString = inputString.substring(inputString.indexOf(" ")+1);
        outputString = outputString+inputString.charAt(0);
        // Obtatin substring starting from the next position of white space
        inputString = inputString.substring(inputString.indexOf(" ")+1);
        outputString = outputString+inputString.charAt(0);
        //Obtain subString starting from the next position of white space
        inputString = inputString.substring(inputString.indexOf(" ")+1);
        outputString = outputString+inputString.charAt(0);
        // To capitalize the string
        outputString = outputString.toUpperCase();    
        System.out.println("The output string is "+outputString);
    }
}
