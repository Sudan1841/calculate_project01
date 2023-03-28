package Calculators;

import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Text;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.wb.swt.SWTResourceManager;

public class Calculator {

	protected Shell shell;
	private Text textDisplay;
	double FirstNum, SecondNum, result;
	String operation; 
	String answer;

	/**
	 * Launch the application.
	 * @param args
	 */
	public static void main(String[] args) {
		try {
			Calculator window = new Calculator();
			window.open();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Open the window.
	 */
	public void open() {
		Display display = Display.getDefault();
		createContents();
		shell.open();
		shell.layout();
		while (!shell.isDisposed()) {
			if (!display.readAndDispatch()) {
				display.sleep();
			}
		}
	}

	/**
	 * Create contents of the window.
	 */
	protected void createContents() {
		shell = new Shell();
		shell.setBackground(SWTResourceManager.getColor(128, 128, 0));
		shell.setSize(811, 987);
		shell.setText("SWT Calculators  Application");
		shell.setLayout(null);
		
		textDisplay = new Text(shell, SWT.BORDER);
		textDisplay.setForeground(SWTResourceManager.getColor(220, 20, 60));
		textDisplay.setBackground(SWTResourceManager.getColor(0, 0, 0));
		textDisplay.setFont(SWTResourceManager.getFont(".AppleSystemUIFont", 80, SWT.NORMAL));
		textDisplay.setBounds(10, 20, 784, 185);
		
		Button btnC = new Button(shell, SWT.NONE);
		btnC.setForeground(SWTResourceManager.getColor(0, 0, 255));
		btnC.setBackground(SWTResourceManager.getColor(0, 255, 0));
		btnC.setFont(SWTResourceManager.getFont(".AppleSystemUIFont", 80, SWT.NORMAL));
		btnC.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) 
			{
				textDisplay.setText("");	
			}
		});
		btnC.setBounds(10, 193, 205, 166);
		btnC.setText("C");
		
		Button btnBackSpace = new Button(shell, SWT.NONE);
		btnBackSpace.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) 
			{
				String  BackSpace = "";
				if(textDisplay.getText().length()>0)
				{
				
				StringBuilder StrB = new StringBuilder(textDisplay.getText());
				StrB.deleteCharAt(textDisplay.getText().length()-1);
				BackSpace= StrB.toString();
				textDisplay.setText(BackSpace);
				}
			}
		});
		btnBackSpace.setForeground(SWTResourceManager.getColor(0, 0, 255));
		btnBackSpace.setBackground(SWTResourceManager.getColor(0, 255, 0));
		btnBackSpace.setFont(SWTResourceManager.getFont(".AppleSystemUIFont", 80, SWT.NORMAL));
		btnBackSpace.setBounds(203, 193, 177, 166);
		btnBackSpace.setText("<>");
		
		Button btnPercent = new Button(shell, SWT.NONE);
		btnPercent.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) 
			{
				FirstNum = Double.parseDouble(textDisplay.getText());
				textDisplay.setText("");
				operation = "%";
			}
		});
		btnPercent.setForeground(SWTResourceManager.getColor(0, 0, 255));
		btnPercent.setBackground(SWTResourceManager.getColor(0, 255, 0));
		btnPercent.setFont(SWTResourceManager.getFont(".AppleSystemUIFont", 80, SWT.NORMAL));
		btnPercent.setBounds(363, 192, 217, 167);
		btnPercent.setText("%");
		
		Button btnDivision = new Button(shell, SWT.NONE);
		btnDivision.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) 
			{
				FirstNum = Double.parseDouble(textDisplay.getText());
				textDisplay.setText("");
				operation = "/";
			}
		});
		btnDivision.setForeground(SWTResourceManager.getColor(0, 0, 255));
		btnDivision.setBackground(SWTResourceManager.getColor(0, 255, 0));
		btnDivision.setFont(SWTResourceManager.getFont(".AppleSystemUIFont", 80, SWT.NORMAL));
		btnDivision.setBounds(546, 192, 248, 167);
		btnDivision.setText("/");
		
		Button btn7 = new Button(shell, SWT.NONE);
		btn7.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) 
			{
				String EnterNumber = textDisplay.getText()+btn7.getText();
				textDisplay.setText(EnterNumber);
			}
		});
		btn7.setForeground(SWTResourceManager.getColor(0, 0, 255));
		btn7.setBackground(SWTResourceManager.getColor(0, 255, 0));
		btn7.setFont(SWTResourceManager.getFont(".AppleSystemUIFont", 80, SWT.NORMAL));
		btn7.setText("7");
		btn7.setBounds(10, 340, 205, 154);
		
		Button btn8 = new Button(shell, SWT.NONE);
		btn8.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) 
			{
				String EnterNumber = textDisplay.getText()+btn8.getText();
				textDisplay.setText(EnterNumber);
			}
		});
		btn8.setForeground(SWTResourceManager.getColor(0, 0, 255));
		btn8.setBackground(SWTResourceManager.getColor(0, 255, 0));
		btn8.setFont(SWTResourceManager.getFont(".AppleSystemUIFont", 80, SWT.NORMAL));
		btn8.setText("8");
		btn8.setBounds(203, 340, 177, 154);
		
		Button btn9 = new Button(shell, SWT.NONE);
		btn9.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) 
			{
				String EnterNumber = textDisplay.getText()+btn9.getText();
				textDisplay.setText(EnterNumber);
			}
		});
		btn9.setForeground(SWTResourceManager.getColor(0, 0, 255));
		btn9.setBackground(SWTResourceManager.getColor(0, 255, 0));
		btn9.setFont(SWTResourceManager.getFont(".AppleSystemUIFont", 80, SWT.NORMAL));
		btn9.setText("9");
		btn9.setBounds(368, 340, 211, 154);
		
		Button btnPlus = new Button(shell, SWT.NONE);
		btnPlus.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) 
			{
				FirstNum = Double.parseDouble(textDisplay.getText());
				textDisplay.setText("");
				operation = "+";
			}
		});
		btnPlus.setForeground(SWTResourceManager.getColor(0, 0, 255));
		btnPlus.setBackground(SWTResourceManager.getColor(0, 255, 0));
		btnPlus.setFont(SWTResourceManager.getFont(".AppleSystemUIFont", 80, SWT.NORMAL));
		btnPlus.setText("+");
		btnPlus.setBounds(567, 342, 227, 152);
		
		Button btn4 = new Button(shell, SWT.NONE);
		btn4.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e)
			{
				String EnterNumber = textDisplay.getText()+btn4.getText();
				textDisplay.setText(EnterNumber);
			}
		});
		btn4.setForeground(SWTResourceManager.getColor(0, 0, 255));
		btn4.setBackground(SWTResourceManager.getColor(0, 255, 0));
		btn4.setFont(SWTResourceManager.getFont(".AppleSystemUIFont", 80, SWT.NORMAL));
		btn4.setText("4");
		btn4.setBounds(10, 478, 205, 173);
		
		Button btn5 = new Button(shell, SWT.NONE);
		btn5.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) 
			{
				String EnterNumber = textDisplay.getText()+btn5.getText();
				textDisplay.setText(EnterNumber);
			}
		});
		btn5.setForeground(SWTResourceManager.getColor(0, 0, 255));
		btn5.setBackground(SWTResourceManager.getColor(0, 255, 0));
		btn5.setFont(SWTResourceManager.getFont(".AppleSystemUIFont", 80, SWT.NORMAL));
		btn5.setText("5");
		btn5.setBounds(196, 478, 184, 173);
		
		Button btn6 = new Button(shell, SWT.NONE);
		btn6.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) 
			{
				String EnterNumber = textDisplay.getText()+btn6.getText();
				textDisplay.setText(EnterNumber);
			}
		});
		btn6.setForeground(SWTResourceManager.getColor(0, 0, 255));
		btn6.setBackground(SWTResourceManager.getColor(0, 255, 0));
		btn6.setFont(SWTResourceManager.getFont(".AppleSystemUIFont", 80, SWT.NORMAL));
		btn6.setText("6");
		btn6.setBounds(361, 478, 219, 173);
		
		Button btnMultiply = new Button(shell, SWT.NONE);
		btnMultiply.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) 
			{
				FirstNum = Double.parseDouble(textDisplay.getText());
				textDisplay.setText("");
				operation = "*";
			}
		});
		btnMultiply.setForeground(SWTResourceManager.getColor(0, 0, 255));
		btnMultiply.setBackground(SWTResourceManager.getColor(0, 255, 0));
		btnMultiply.setFont(SWTResourceManager.getFont(".AppleSystemUIFont", 80, SWT.NORMAL));
		btnMultiply.setText("*");
		btnMultiply.setBounds(571, 477, 223, 174);
		
		Button btn3 = new Button(shell, SWT.NONE);
		btn3.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e)
			{
				String EnterNumber = textDisplay.getText()+btn3.getText();
				textDisplay.setText(EnterNumber);
			}
		});
		btn3.setForeground(SWTResourceManager.getColor(0, 0, 255));
		btn3.setBackground(SWTResourceManager.getColor(0, 255, 0));
		btn3.setFont(SWTResourceManager.getFont(".AppleSystemUIFont", 80, SWT.NORMAL));
		btn3.setText("3");
		btn3.setBounds(10, 638, 205, 171);
		
		Button btn2 = new Button(shell, SWT.NONE);
		btn2.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) 
			{
				String EnterNumber = textDisplay.getText()+btn2.getText();
				textDisplay.setText(EnterNumber);
			}
		});
		btn2.setForeground(SWTResourceManager.getColor(0, 0, 255));
		btn2.setBackground(SWTResourceManager.getColor(0, 255, 0));
		btn2.setFont(SWTResourceManager.getFont(".AppleSystemUIFont", 80, SWT.NORMAL));
		btn2.setText("2");
		btn2.setBounds(196, 638, 184, 171);
		
		Button btn1 = new Button(shell, SWT.NONE);
		btn1.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) 
			{
				String EnterNumber = textDisplay.getText()+btn1.getText();
				textDisplay.setText(EnterNumber);
			}
		});
		btn1.setForeground(SWTResourceManager.getColor(0, 0, 255));
		btn1.setBackground(SWTResourceManager.getColor(0, 255, 0));
		btn1.setFont(SWTResourceManager.getFont(".AppleSystemUIFont", 80, SWT.NORMAL));
		btn1.setText("1");
		btn1.setBounds(367, 640, 213, 169);
		
		Button btnMinis = new Button(shell, SWT.NONE);
		btnMinis.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) 
			{
				FirstNum = Double.parseDouble(textDisplay.getText());
				textDisplay.setText("");
				operation = "-";
			}
		});
		btnMinis.setForeground(SWTResourceManager.getColor(0, 0, 255));
		btnMinis.setBackground(SWTResourceManager.getColor(0, 255, 0));
		btnMinis.setFont(SWTResourceManager.getFont(".AppleSystemUIFont", 80, SWT.NORMAL));
		btnMinis.setText("-");
		btnMinis.setBounds(571, 639, 223, 170);
		
		Button btnExit = new Button(shell, SWT.NONE);
		btnExit.setSelection(true);
		btnExit.setGrayed(true);
		btnExit.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) 
			{
				System.exit(0);
			}
		});
		btnExit.setForeground(SWTResourceManager.getColor(0, 0, 255));
		btnExit.setBackground(SWTResourceManager.getColor(0, 255, 0));
		btnExit.setFont(SWTResourceManager.getFont(".AppleSystemUIFont", 80, SWT.NORMAL));
		btnExit.setText("Exit");
		btnExit.setBounds(10, 800, 205, 155);
		
		Button btnPoint = new Button(shell, SWT.NONE);
		btnPoint.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) 
			{
				String EnterNumber = textDisplay.getText()+btnPoint.getText();
				textDisplay.setText(EnterNumber);
			}
		});
		btnPoint.setForeground(SWTResourceManager.getColor(0, 0, 255));
		btnPoint.setBackground(SWTResourceManager.getColor(0, 255, 0));
		btnPoint.setFont(SWTResourceManager.getFont(".AppleSystemUIFont", 80, SWT.NORMAL));
		btnPoint.setText(".");
		btnPoint.setBounds(190, 800, 190, 155);
		
		Button btn0 = new Button(shell, SWT.NONE);
		btn0.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) 
			{
				String EnterNumber = textDisplay.getText()+btn0.getText();
				textDisplay.setText(EnterNumber);
			}
		});
		btn0.setForeground(SWTResourceManager.getColor(0, 0, 255));
		btn0.setBackground(SWTResourceManager.getColor(0, 255, 0));
		btn0.setFont(SWTResourceManager.getFont(".AppleSystemUIFont", 80, SWT.NORMAL));
		btn0.setText("0");
		btn0.setBounds(353, 800, 227, 155);
		
		Button btnEqual = new Button(shell, SWT.NONE);
		btnEqual.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) 
			{
				SecondNum = Double.parseDouble(textDisplay.getText());
			if(operation=="+")
			{
				result = FirstNum+SecondNum ;
				answer = String.format("%.2f", result);
				textDisplay.setText(answer);
				
			}
			else if(operation=="-")
			{
				result = FirstNum-SecondNum ;
				answer = String.format("%.2f", result);
				textDisplay.setText(answer);
			}
			else if(operation=="*")
			{
				result = FirstNum*SecondNum ;
				answer = String.format("%.2f", result);
				textDisplay.setText(answer);
			}
			 
			 else if(operation=="/")
				{
					result = FirstNum/SecondNum ;
					answer = String.format("%.2f", result);
					textDisplay.setText(answer);
				}
			 else if(operation=="%")
				{
					result = FirstNum%SecondNum ;
					answer = String.format("%.2f", result);
					textDisplay.setText(answer);
				}
			}
		});
		btnEqual.setForeground(SWTResourceManager.getColor(0, 0, 255));
		btnEqual.setBackground(SWTResourceManager.getColor(0, 255, 0));
		btnEqual.setFont(SWTResourceManager.getFont(".AppleSystemUIFont", 80, SWT.NORMAL));
		btnEqual.setText("=");
		btnEqual.setBounds(571, 799, 223, 156);

	}

}
