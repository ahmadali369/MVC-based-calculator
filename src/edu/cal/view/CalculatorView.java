package edu.cal.view;

import java.awt.*;
import java.awt.event.*;


public class CalculatorView extends Frame {
    private Label text1Label, text2Label, text3Label;
    private TextField text1, text2, text3;
    private Button addButton, subtractButton, multiplyButton,divideButton,powerButton,clearButton;

    public CalculatorView() {
        text1Label = new Label("Num1");
        text2Label = new Label("Num2");
        text3Label = new Label("Result");

        text1 = new TextField(10);
        text2 = new TextField(10);
        text3 = new TextField(10);

        addButton = new Button("Add");
        subtractButton = new Button("Subtract");
        multiplyButton = new Button("Multiply");
        divideButton= new Button ("Divide");
        powerButton= new Button ("Power");
        clearButton= new Button ("Clear");

        add(text1Label);
        add(text1);
        add(text2Label);
        add(text2);
        add(text3Label);
        add(text3);
        add(addButton);
        add(subtractButton);
        add(multiplyButton);
        add(divideButton);
        add(powerButton);
        add(clearButton);

        setSize(200, 200);
        setLocation(300, 300);
        setLayout(new FlowLayout());
    }

    public double getNum1() throws NumberFormatException{
        return Double.parseDouble(text1.getText());
    }

    public double getNum2() throws NumberFormatException{
        return Double.parseDouble(text2.getText());
    }

    public Label getLbl1() {
		return text1Label;
	}

	public void setLbl1(Label lbl1) {
		this.text1Label = lbl1;
	}

	public Label getLbl2() {
		return text2Label;
	}

	public void setLbl2(Label lbl2) {
		this.text2Label = lbl2;
	}

	public Label getLbl3() {
		return text3Label;
	}

	public void setLbl3(Label lbl3) {
		this.text3Label = lbl3;
	}

	public TextField getTxt1() {
		return text1;
	}

	public void setTxt1(TextField txt1) {
		this.text1 = txt1;
	}

	public TextField getTxt2() {
		return text2;
	}

	public void setTxt2(TextField txt2) {
		this.text2 = txt2;
	}

	public TextField getTxt3() {
		return text3;
	}

	public void setTxt3(TextField txt3) {
		this.text3 = txt3;
	}

	public Button getBtn1() {
		return addButton;
	}

	public void setBtn1(Button btn1) {
		this.addButton = btn1;
	}

	public Button getBtn2() {
		return subtractButton;
	}

	public void setBtn2(Button btn2) {
		this.subtractButton = btn2;
	}

	public Button getBtn3() {
		return multiplyButton;
	}

	public void setBtn3(Button btn3) {
		this.multiplyButton = btn3;
	}
	public Button getBtn4() {
		return divideButton;
	}

	public void setBtn4(Button btn4) {
		this.divideButton = btn4;
	}
	public Button getBtn5() {
		return powerButton;
	}

	public void setBtn5(Button btn5) {
		this.powerButton = btn5;
	}
	public Button getBtn6() {
		return clearButton;
	}

	public void setBtn6(Button btn6) {
		this.clearButton = btn6;
	}
	
	
	public void setResult(double result) {
        text3.setText(String.valueOf(result));
    }
	
	public void setEmpty() {
//        text3.setText(String.valueOf(result));
		text1.setText(String.valueOf(""));
		text2.setText(String.valueOf("")); 
		text3.setText(String.valueOf(""));
		
    }

    public void addCalculationListener(ActionListener listener) {
        addButton.addActionListener(listener);
        subtractButton.addActionListener(listener);
        multiplyButton.addActionListener(listener);
        divideButton.addActionListener(listener);
        powerButton.addActionListener(listener);
        clearButton.addActionListener(listener);
    }

    public void display() {
        setVisible(true);
    }
}
