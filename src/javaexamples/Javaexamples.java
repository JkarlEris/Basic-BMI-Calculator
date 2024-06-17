package javaexamples;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.Color;

public class Javaexamples extends javax.swing.JFrame {

        Javaexamples() {
            
            JFrame f = new JFrame("Karl Miguel A. Reyes INF223");
            f.getContentPane().setBackground(Color.RED);
           
            JLabel title = new JLabel("BMI CALCULATOR");
            title.setBounds(150, 15, 300, 70);
            f.add(title);
            
            JLabel lbl = new JLabel("Height(cm): ");
            lbl.setBounds(20, 60, 100, 40);
            f.add(lbl);
            
            JLabel lb2 = new JLabel("Weight(kg): ");
            lb2.setBounds(20, 90, 100, 40);
            f.add(lb2);
            
            JLabel lbResult = new JLabel("BMI Calculator in JAVA GUI");
            lbResult.setBounds(20, 120 ,300, 40);
            f.add(lbResult);
            
            JTextField txtHeight = new JTextField("");
            txtHeight.setBounds(120, 60, 200, 40);
            f.add(txtHeight);
            
            JTextField txtWeight = new JTextField("");
            txtWeight.setBounds(120, 90, 200, 40);
            f.add(txtWeight);
            
            JButton btn = new JButton("BMI Calculator in JAVA GUI (CALCULATE)");
            btn.setBounds(120, 190, 300, 40);
            
            btn.addActionListener(new ActionListener(){
            @Override
            
        public void actionPerformed (ActionEvent e){   

            double weight = Double.parseDouble(txtWeight.getText());
            double height = Double.parseDouble(txtHeight.getText());

            double kg = weight * 2.20462262;
            double cm = height / 2.54;
            double bmi  = kg / Math.pow(cm, 2) * 703;

            if(bmi < 18.5){
               lbResult.setText("underweight - BMI : " +bmi);   
            }else if (bmi < 25){   
               lbResult.setText("normal - BMI : " +bmi);   
            }else if (bmi < 30){
               lbResult.setText("overweight - BMI : " +bmi);   
            }else{
                lbResult.setText("obese - BMI : " +bmi);   
            }
        }    
        });
        f.add(btn); 

        f.setSize(400, 300);
        f.setLayout(null);
        f.setVisible(true);

    }
    public static void main(String[] args) {
        new Javaexamples();
    }

}
