/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SimpleFrame;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Image;
import java.awt.Toolkit;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author Estudiante
 */
public class SimpleFrame {
    public static void main(String[] args) {
        JFrame frame=new JFrame();
        Image icon=Toolkit.getDefaultToolkit().getImage("caution.gif");
        frame.setIconImage(icon);
        JPanel panel=(JPanel)frame.getContentPane();
        panel.setBackground(Color.white);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(new Dimension(300,120));
        Dimension dim=Toolkit.getDefaultToolkit().getScreenSize();
        frame.setLocation(dim.width/2-frame.getSize().width/2,dim.height/2-frame.getSize().height/2 );
        frame.setTitle("A frame");
        frame.setLayout(new FlowLayout());
        JLabel label=new JLabel ("Type your zip code:");
        JTextField field=new JTextField(5);
        JButton button1=new JButton();
        button1.setText("Im a button");
        button1.setBackground(Color.BLUE);
        frame.add(button1);
        JButton button2=new JButton();
        button2.setText("Click me!");
        button2.setBackground(Color.MAGENTA);
        frame.add(button2);
        frame.setVisible(true);
    }
    
}
