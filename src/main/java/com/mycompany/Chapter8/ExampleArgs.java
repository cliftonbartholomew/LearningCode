/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.Chapter8;

/**
 *
 * @author Server
 */
public class ExampleArgs {
    public static void main(String[] args) {
        for(int i = 0; i < args.length; i++){
            System.out.println("args[" + i + "] : " + args[i]);
        }
    }
}
