package com.company;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

public class NewColorFrame extends JFrame {
    JButton red, green,blue;
    public NewColorFrame(){
        super("New Color Frame");
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

        ActionListener act = (event)->{
            if(event.getSource() == red){
                getContentPane().setBackground(Color.red);
            }
            if(event.getSource() == green){
                getContentPane().setBackground(Color.green);
            }
            if(event.getSource()== blue){
                getContentPane().setBackground(Color.blue);
            }
        };
        red.addActionListener(act);
        green.addActionListener(act);
        blue.addActionListener(act);
        setVisible(true);
    }
}
