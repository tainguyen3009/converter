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
 * context class that will check with ConvStrategy class
 */
public class UnitConverter {
    private  ConvStrategy cvStrategy;
    
    /**
     * construct a new object for context class
     */
    public UnitConverter(){
        cvStrategy = new FCconverter();
    }
    /**
     * Executes the current conversion strategy with the given input value.
     * @param valueA the input value need to be convert
     * @return the converted value based on the strategy
     */
    public double executeStrategy(double valueA){
        return cvStrategy.convert(valueA);
    }
    /**
     * Set a new strategy for convert
     * @param newStrategy the new convert strategy to be set
     */
    public void setStrategy(ConvStrategy newStrategy){
        cvStrategy = newStrategy;
    }

}
