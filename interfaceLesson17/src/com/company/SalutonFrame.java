package com.company;

import javax.swing.*;

public class SalutonFrame extends JFrame {
    JButton redButton = new JButton("OK");

    public SalutonFrame(){
        super("Saluton");
        setLookAndFeel();
        setSize(450,200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
        add(redButton);

    }

    private void setLookAndFeel(){
        try{
            UIManager.setLookAndFeel("javax.swing.plaf.nimbus.NimbusLookAndFeel");
        }catch(Exception exc){

        }
    }
}
