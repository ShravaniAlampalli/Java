/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package objectlab01;

import java.util.Random;

/**
 *
 * @author Instructor
 */
public class ObjectsQuestion3c 
{
    public static void main(String[] args) 
    {
        Random randomNumber = new Random();
        System.out.println("\nSolution 3c");       
        System.out.println("Random values without seed value");  
        System.out.println(randomNumber.nextInt(200));
        System.out.println(randomNumber.nextInt(200));
        System.out.println(randomNumber.nextInt(200));
    }
}
