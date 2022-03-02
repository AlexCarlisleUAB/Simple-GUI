/*
Alex Carlisle
CIS 255
Project 3
*/

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class ACarlisle_Project3 extends JFrame
{
	private final int WIDTH = 500;
    private final int HEIGHT = 500;

    JPanel panel;
    JRadioButton atlanta;
    JRadioButton nashville;
    JRadioButton houston;
    JRadioButton denver;
    ButtonGroup radioButtonGroup;
    JLabel message;
    JTextField checkedBags;
    JCheckBox firstClass;
    JCheckBox roundTrip;
    JButton fare;

   public ACarlisle_Project3()
   {
      setTitle("AirPath Flights");
      setSize(WIDTH, HEIGHT);
      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      setVisible(true);
      setLayout(new GridLayout());

      message = new JLabel ("Please enter your flight info:");

      checkedBags = new JTextField(5);

      atlanta = new JRadioButton ("Atlanta");
      nashville = new JRadioButton ("Nashville");
      houston = new JRadioButton ("Houston");
      denver = new JRadioButton ("Denver");



      radioButtonGroup = new ButtonGroup();
	  radioButtonGroup.add(atlanta);
	  radioButtonGroup.add(nashville);
	  radioButtonGroup.add(houston);
	  radioButtonGroup.add(denver);

      panel = new JPanel();

      panel.add(message);
      panel.add(atlanta);
      panel.add(nashville);
      panel.add(houston);
      panel.add(denver);
      
      add(panel);
   }

   public static void main(String[] args)
   {
	   new ACarlisle_Project3();
	}
}
