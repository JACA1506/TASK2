/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package task2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 *
 * @author Joshua
 */
public class LogicForIntersectorArrays {
    
    
    public boolean validateArrays(String arrayString) {
        List<String> arrayFormated = null;
        boolean validArray = true;
        try {
            String[] arraySplited = arrayString.split(",");
            arrayFormated = Arrays.asList(arraySplited);
            for (String element : arrayFormated) {
                if (!isNumeric(element)) {
                    validArray = false;
                }

            }
            return validArray;
        } catch (Exception ex) {
            return false;
        }

    }
    
    private  boolean isNumeric(String string) {
        try {
            Integer.parseInt(string);
            return true;
        } catch (NumberFormatException nfe) {
            return false;
        }
    }
    
    
    
    
    public List<String> calculateIntersection(String array1, String array2) {
        List<String> arrayFormated1 = null;
        List<String> arrayFormated2 = null;
        arrayFormated1 = formatArrays(array1);
        arrayFormated2 = formatArrays(array2);
        List<String> intersection = new ArrayList<String>();
        for (String element : arrayFormated1) {
            for (String element2 : arrayFormated2) {
                if (element.equals(element2)) {
                    if (!intersection.contains(element)) {
                        intersection.add(element);
                    }
                }
            }
        }
        return intersection;
    }
    
    
    
    private List<String> formatArrays (String array1){
         List<String> arrayFormated = null;
        try{
            String[] arraySplited = array1.split(",");
            arrayFormated = Arrays.asList(arraySplited); 
            return arrayFormated;
            
        }catch (Exception ex) {
            return null;
        }
    }
    
}
