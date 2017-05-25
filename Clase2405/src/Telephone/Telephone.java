/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Telephone;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author Estudiante
 */
public class Telephone {
    public static void main(String[] args) {
       JFrame frame=new JFrame();
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setSize(new Dimension(250,200));
    frame.setTitle("Telephone");
    frame.setLayout(new BorderLayout());
    
    JPanel centerpanel=new JPanel(new GridLayout(4,3));
        for (int i = 1; i < 10; i++) {
            centerpanel.add(new JButton(""+i));
            }
        centerpanel.add(new JButton ("*"));
        centerpanel.add(new JButton("O"));
        centerpanel.add(new JButton("#"));
        frame.add(centerpanel,BorderLayout.CENTER);
        JPanel southpanel=new JPanel(new FlowLayout());
        southpanel.add(new JLabel("number to dial: "));
        southpanel.add(new JTextField(10));
        frame.add(southpanel, BorderLayout.SOUTH);
        frame.setVisible(true);
    }
    
    
    
    
}
