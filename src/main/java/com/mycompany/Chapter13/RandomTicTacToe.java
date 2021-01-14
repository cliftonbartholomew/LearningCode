/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.Chapter13;

import java.awt.Color;
import java.awt.GridLayout;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.border.LineBorder;

/**
 *
 * @author Server
 */
public class RandomTicTacToe extends JFrame {
    public RandomTicTacToe(){
        this.setLayout(new GridLayout(3,3));
        
        JLabel[] labels = new JLabel[9];
        for(int i = 0; i < labels.length; i ++){
            int choice = (int)(Math.random()*3);
            if(choice == 1){
                labels[i] = new JLabel(new ImageIcon("C:\\Users\\Server\\Documents\\NetBeansProjects\\Fiddle\\image1.png"));    
            }
            else if(choice == 2){
                labels[i] = new JLabel(new ImageIcon("C:\\Users\\Server\\Documents\\NetBeansProjects\\Fiddle\\image2.png"));    
            }
            else{
                labels[i] = new JLabel();
            }
            
            labels[i].setBorder(new LineBorder(Color.BLACK, 1));  
            this.add(labels[i]);
            
        }
    }
    
    public static void main(String[] args) {
        JFrame frame = new RandomTicTacToe();
        frame.setTitle("TicTacToe");
        frame.setSize(300, 300);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
