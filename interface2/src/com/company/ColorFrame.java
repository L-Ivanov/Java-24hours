package com.company;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ColorFrame extends JFrame {
    JButton red, green, blue;

    public ColorFrame(){
        super("Color Frame");
        setSize(322, 122);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        FlowLayout flo = new FlowLayout();
        setLayout(flo);
        red = new JButton("Red");
        add(red);
        green = new JButton("Green");
        add(green);
        blue = new JButton("Blue");
        add(blue);
        //започва анонимен вътрешен клас
        ActionListener act = new ActionListener() {
           public void actionPerformed(ActionEvent event){
               if(event.getSource() == red){
                   getContentPane().setBackground(Color.red);
               }
               if(event.getSource() == green){
                   getContentPane().setBackground(Color.green);
               }
               if(event.getSource() == blue){
                   getContentPane().setBackground(Color.blue);
               }

           }
        };
        //край на анонимен вътрешен клас
        red.addActionListener(act);
        green.addActionListener(act);
        blue.addActionListener(act);
        setVisible(true);
    }
}
