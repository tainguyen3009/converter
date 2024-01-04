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
 * Strategy class implement ConvStrategy and contain method to convert from Pounds to Kilo
 */
public class PKconverter implements ConvStrategy{
    private final double convFactor = 2.2;
    /**
     * method to convert pounds to kilo
     * @param Pounds the value need to be converted
     * @return converted value base on method
     */
    public double convert (double Pounds){
        return Pounds/convFactor;
    }


}
