import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JComboBox;
import javax.swing.JFrame;

import java.util.Currency;
import java.util.Locale;
import java.util.*;

public class DifferentCurrency
{
	//currency
    private static Currency c2 = Currency.getInstance("JPY");
	private static Currency c3 = Currency.getInstance("USD");
	private static Currency c1 = Currency.getInstance(Locale.FRANCE);
	private static Currency c4 = Currency.getInstance(Locale.CHINA);
	private static Currency c5 = Currency.getInstance(Locale.CANADA);
	private static Currency c6 = Currency.getInstance(Locale.GERMANY);
	//symbol
	public static String sym1 = c1.getSymbol();
	public static String sym2 = c2.getSymbol();
	public static String sym3 = c3.getSymbol();
	public static String sym4 = c4.getSymbol();
	public static String sym5 = c5.getSymbol();
	public static String sym6 = c6.getSymbol();
	//Display name
    public static String cur2 = c2.getDisplayName();
    public static String cur1 = c1.getDisplayName();
    public static String cur3 = c3 .getDisplayName();
    public static String cur4 = c4.getDisplayName();
    public static String cur5 = c5.getDisplayName();
    public static String cur6 = c6 .getDisplayName();
    //Exchange rates
    public static double rate1 = 0.91;
    public static double rate2 = 143.04;
    public static double rate3 = 1;
    public static double rate4 = 7.18;
    public static double rate5 = 1.33;
    public static double rate6 = 0.91;
    
    

	public static void main(String[] args)
    {
    	
        Currency c1 = Currency.getInstance(Locale.FRANCE);
        Currency c2 = Currency.getInstance("JPY"); 
        Currency c3 = Currency.getInstance("USD");  
       
  
        System.out.println("France Symbol : "+c1.getSymbol());
        System.out.println("JPY Symbol : "+c2.getSymbol());
        System.out.println("USD Symbol : "+c3.getSymbol());
        
  
    }
	
}

class DropDownCurrencyChange {
    public static void main(String[] args) {
        // Create a JFrame (window) to hold the drop-down menu
        JFrame frame = new JFrame("Drop-down Menu Example");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        // Create an array of options
        String[] options = { DifferentCurrency.cur1, DifferentCurrency.cur2, DifferentCurrency.cur3 };
        
        // Create a drop-down menu using the options array
        JComboBox<String> dropdown = new JComboBox<>(options);
        
        // Set the initial selected option
        dropdown.setSelectedIndex(0);
        
        // Create if statement for options
        dropdown.addActionListener(new ActionListener() {
            public void actionPerformed1(ActionEvent e) {
                String selectedOption = (String) dropdown.getSelectedItem();
                String sym = DifferentCurrency.sym1;
                double rate = DifferentCurrency.rate1;
                double oldrate = rate;
                if (selectedOption.equals(DifferentCurrency.cur1)) {
                	oldrate = rate;
                	sym = DifferentCurrency.sym1;
                	rate = DifferentCurrency.rate1;
                    //System.out.println("Option 1 selected. Performing action 1.");
                } else if (selectedOption.equals(DifferentCurrency.cur2)) {
                	oldrate = rate;
                	sym = DifferentCurrency.sym2;
                	rate = DifferentCurrency.rate2;
                    //System.out.println("Option 2 selected. Performing action 2.");
                } else if (selectedOption.equals(DifferentCurrency.cur3)) {
                	oldrate = rate;
                	sym = DifferentCurrency.sym3;
                	rate = DifferentCurrency.rate3;
                   // System.out.println("Option 3 selected. Performing action 3.");
                }
                else if (selectedOption.equals(DifferentCurrency.cur4)) {
                	oldrate = rate;
                	sym = DifferentCurrency.sym4;
                	rate = DifferentCurrency.rate4;
                }
                else if (selectedOption.equals(DifferentCurrency.cur5)) {
                	oldrate = rate;
                	sym = DifferentCurrency.sym5;
                	rate = DifferentCurrency.rate5;
                }
                else if (selectedOption.equals(DifferentCurrency.cur6)) {
                	oldrate = rate;
                	sym = DifferentCurrency.sym6;
                	rate = DifferentCurrency.rate6;
                }
            }

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				
			}
        });
        
        // Add the drop-down menu to the frame
        frame.add(dropdown);
        
        // Set the size of the frame and make it visible
        frame.setSize(300, 200);
        frame.setVisible(true);
    }
}

