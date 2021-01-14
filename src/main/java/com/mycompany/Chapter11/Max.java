/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.Chapter11;

/**
 *
 * @author Server
 */
public class Max {
    //comparable is an interface (i.e. a promise) that the object has a compareTo function
    //o1.compareTo(o2) is:
    //> 1 if o1 comes after o2
    //<1 if o1 comes before o1
    //0 if they are equal
    public static Comparable max(Comparable o1, Comparable o2){
        //
        if(o1.compareTo(o2) > 0){
            return 01;
        }
        else
            return 02;
    }
}
