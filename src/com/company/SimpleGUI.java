package com.company;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SimpleGUI extends JFrame {
    JButton button = new JButton("press");
    JTextField input = new JTextField("",5);
    JLabel label = new JLabel("inpet:");
    JRadioButton radio1= new JRadioButton("Select this");
    JRadioButton radio2= new JRadioButton("Select this");
    JCheckBox check = new JCheckBox("check", false);

    public SimpleGUI()  {
        super("Simple Example");
        this.setBounds(100,100,250,100);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Container container = this.getContentPane();
        container.setLayout(new GridLayout(3,2,2,2));
        container.add(label);
        container.add(input);

//        ButtonGroup buttonGroup = new ButtonGroup();
//        buttonGroup.add(radio1);
//        buttonGroup.add(radio2);

        container.add(radio1);

        radio1.setSelected(true);
        container.add(radio2);
        container.add(check);

        check.addActionListener(new ButtonEventListener());
        container.add(button);
    }

    class ButtonEventListener implements ActionListener{

        public void actionPerformed(ActionEvent e){
            String message = "";
            message +="button was presed\n";
            message+="text is +"+   input.getText();

            JOptionPane.showMessageDialog(null,message,"Output",JOptionPane.PLAIN_MESSAGE);
        }
    }
}
