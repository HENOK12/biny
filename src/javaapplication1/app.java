/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;


public class app extends JFrame{
    public app(){
          
     JButton ak =new JButton("click me");
         add(ak);
         Handler h = new Handler();
     ak.addActionListener(new ActionListener(){
         public void actionPerformed(ActionEvent e){
             JOptionPane.showMessageDialog(null, "hello heni");
         }
         
     });
     
     ak.addActionListener(h);
         
    }
    public static void main(String[] args) {
        app a = new app();
        a.setVisible(true);
         a.setSize(300,200);
     a.setTitle("book library");
     a.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        
    }
    
}

class Handler implements ActionListener{
    @Override
    public void actionPerformed(ActionEvent e){
        System.out.println("Hello");
    }

   
}
