package controller;

import edu.cal.view.CalculatorView;
import edu.fast.model.CalculatorModel;
import java.awt.event.*; 

public class CalculatorController implements ActionListener {
    private CalculatorView view;
    private CalculatorModel model;

    public CalculatorController(CalculatorView view, CalculatorModel model) {
        this.view = view;
        this.model = model;
        this.view.addCalculationListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
    	
    	try {
    		
    		
    		double num1 = view.getNum1();
            double num2 = view.getNum2();

            if (e.getSource() == view.getBtn1()) {
                model.setNum1(num1);
                model.setNum2(num2);
                model.add();
            } else if (e.getSource() == view.getBtn2()) {
                model.setNum1(num1);
                model.setNum2(num2);
                model.subtract();
            } else if (e.getSource() == view.getBtn3()) {
                model.setNum1(num1);
                model.setNum2(num2);
                model.multiply();
            }
            else if (e.getSource() == view.getBtn4()) {
                model.setNum1(num1);
                model.setNum2(num2);
                model.divide();
            }
            else if (e.getSource() == view.getBtn5()) {
                model.setNum1(num1);
                model.setNum2(num2);
                model.power();
            }
            else if (e.getSource() == view.getBtn6()) {
            	view.setEmpty();
               
                model.clear();
            }


            view.setResult(model.getResult());
            
            
            
    	}catch(NumberFormatException e1) {
    		
    		System.out.println("Number Formate is Not Correct");
    	
    		
    		
    	}
    	
        
    }
}

