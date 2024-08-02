/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pizzaservingscalculator;

/**
 *
 * @author Lucas Craig
 */
import javax.swing.JOptionPane;
import javax.swing.JFrame;

public class PizzaServingsCalculator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        PizzaBox pizzaCalculator = new PizzaBox();
        pizzaCalculator.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        pizzaCalculator.setVisible(true); //makes box appear
        
        //"pizza time :)" -Tobey Maguire
    }
    
}
