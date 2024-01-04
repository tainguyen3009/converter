/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkgUnitConverter;
/*
Student Name: tai nguyen    
Student Number:041086103
Course & Section #: 22S_CST8288_031
Declaration: class convert Fahrenheit to Celsius
This is my own original work and is free from Plagiarism.
*/
/**
 *
 * @author tai nguyen
 * interface strategy class for unit conversion
 */

public interface ConvStrategy {
    /**
     * convert the given value with strategy
     * 
     * @param valueA the input value need to convert
     * @return converted value 
     */
     double convert(double valueA);
}
