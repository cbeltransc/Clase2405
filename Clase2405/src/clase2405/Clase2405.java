/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clase2405;

import javax.swing.JOptionPane;

/**
 *
 * @author Estudiante
 */
public class Clase2405 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       String name=JOptionPane.showInputDialog(null, "Whats your name?");
       int choice =JOptionPane.showConfirmDialog(null, "Do you like cake," + name+ "?");
       if (choice==JOptionPane.YES_OPTION){
           JOptionPane.showMessageDialog(null, "Of course, Who doesn't");           
       }else{
           JOptionPane.showMessageDialog(null, "We'll have to agree to disagree");
       }
    }
    
}
