/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.Chapter5;

/**
 *
 * @author Server
 */
public class OverloadingMethods {
    public static void main (String[] args){
        
    }
    
    public static int max(int num1, int num2){
        if(num1 > num2){
            return num1;
        }
        
        return num2;
    }
    
    public static double max(double num1, double num2){
        if(num1 > num2){
            return num1;
        }
        
        return num2;
    }    
}
