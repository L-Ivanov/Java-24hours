package com.company;

import javax.swing.*;
import java.awt.*;
import java.beans.JavaBean;

public class Playback extends JFrame {
    JLabel pageLabel = new JLabel("Web page address: ", JLabel.RIGHT);
    JTextField pageAddress = new JTextField("Hi",20);
    JCheckBox jumboSize = new JCheckBox("Jumbo size");
    JCheckBox paladin = new JCheckBox("Paladin");
    JCheckBox titan = new JCheckBox("Titan");
    ButtonGroup ships = new ButtonGroup();

    JComboBox pickAShip = new JComboBox();


    String text = pageAddress.getText();

    public Playback(){

        super("Playback");
        setLookAndFeel();
        setSize(450,200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        FlowLayout flo = new FlowLayout();
        setLayout(flo);
        JButton play = new JButton("Play");
        JButton stop = new JButton("Stop");
        JButton pause = new JButton("Pause");
        add(play);
        add(stop);
        add(pause);
        setVisible(true);
        add(pageLabel);
        add(pageAddress);
        add(jumboSize);
        add(paladin);
        add(titan);
        ships.add(paladin);
        ships.add(titan);
        pickAShip.addItem("Eternal Crusader");
        pickAShip.addItem("Spire");
        pickAShip.addItem("Aquilae");
        pickAShip.setEditable(true);
        add(pickAShip);


    }
    private void setLookAndFeel(){
        try{
            UIManager.setLookAndFeel("javax.swing.plaf.nimbus.NimbusLookAndFeel");

        }catch(Exception exc){

        }
    }
}
