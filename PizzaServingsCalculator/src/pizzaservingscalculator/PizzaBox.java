/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pizzaservingscalculator;

/**
 *
 * @author Lucas Craig
 */

import java.awt.GridLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JPanel;
import java.awt.Font;
import java.awt.Color;

public class PizzaBox extends JFrame {
    
    private final JLabel title;
    private final Font titleFont;
    private final JPanel line2;
    private final JLabel prompt;
    private final JTextField inputBox;
    private final JButton calcButton;
    private final JLabel output;
    
    public PizzaBox() {
            //Setting up JFrame:
        super("Pizza Servings Calculator");
        setLayout(new GridLayout(4,1));
        setSize(350, 300);
            //Line 1:
        title = new JLabel("Pizza Servings Calculator");
        title.setHorizontalAlignment(SwingConstants.CENTER);
        title.setForeground(Color.RED); //changing title text to red
        titleFont = new Font("Serif", Font.BOLD, 25);
        title.setFont(titleFont);
        add(title); //put into frame in 1st grid slot
            //Line 2:
        line2 = new JPanel(); //stores 2 elements so they can both fit into 2nd grid slot
        prompt = new JLabel("Enter the size of the pizza in inches: ");
        line2.add(prompt);
        inputBox = new JTextField(5);
        line2.add(inputBox);
        add(line2); //put into frame in 2nd grid slot
            //Line 3:
        calcButton = new JButton("Calculate Servings");
        add(calcButton); //put into frame in 3rd grid slot
            //Line 4:
        output = new JLabel(""); 
        output.setHorizontalAlignment(SwingConstants.CENTER);
        add(output); //put into frame in 4th grid slot
        ButtonHandler calcButtonHandler = new ButtonHandler(); //event handler for button press
        calcButton.addActionListener(calcButtonHandler);   
    }
    
    
    /*
    ButtonHandler:
     - takes size input from textbox
     - calculates pizza servings
     - changes the Line 4 JLabel (output) to show servings
    */
        public class ButtonHandler implements ActionListener {
            @Override
            public void actionPerformed(ActionEvent event){
                double size = Integer.valueOf(inputBox.getText());
                double servings = Math.pow(size/8,2);
                output.setText(String.format("A %.0f inch pizza will serve %.2f people.", size, servings));
        }
    }

}
